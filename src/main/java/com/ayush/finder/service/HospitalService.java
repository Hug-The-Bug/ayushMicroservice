package com.ayush.finder.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayush.finder.entity.HospitalInfo;
import com.ayush.finder.entity.InformationToSend;
import com.ayush.finder.repository.HospitalRepository;
import com.ayush.finder.repository.Hospital_Service_Repository;
import com.ayush.finder.repository.ServicesRepository;

@Service
public class HospitalService {
	
	@Autowired
	HospitalRepository hospitalRepository;
	
	@Autowired
	Hospital_Service_Repository hospital_service_repository;
	
	@Autowired
	ServicesRepository serviceRepository;
	
	@Autowired
	Distance_Find_Service distance_find_service;
	
	public List<HospitalInfo> getAllHospitalInfo() {
		
		return hospitalRepository.findAll();
	}
	
	public List<String> getListOfService(String hospital_id){
		List<String> service_name = new ArrayList<String>();
		
		List<Integer> service_id= hospital_service_repository.getAllServiceId(hospital_id);
		for(int i=0;i<service_id.size();i++) {
			service_name.add(serviceRepository.getServiceNameById(service_id.get(i)));
		}
		
		return service_name;
	}
	
	public List<InformationToSend> getAllInfoToSend(double start_longitude, double start_latitude){
		
		List<InformationToSend> store = new ArrayList<InformationToSend>();
		
		List<HospitalInfo> hospitalInfo= getAllHospitalInfo();
		
		
		for(int i=0;i<hospitalInfo.size();i++) {
			
			InformationToSend info = new InformationToSend();
			
			info.setHospital_name(hospitalInfo.get(i).getHospital_name());
			info.setOpen_time(hospitalInfo.get(i).getOpen_time());
			info.setClose_time(hospitalInfo.get(i).getClose_time());
			info.setPhone_No(hospitalInfo.get(i).getPhone_no());
			info.setAddress(hospitalInfo.get(i).getAddress());
			info.setWebsite_link(hospitalInfo.get(i).getWebsite_link());
			info.setImage(hospitalInfo.get(i).getImage());
			info.setServices(getListOfService(hospitalInfo.get(i).getHospital_accredation_no()));
			
			double distance= (double)distance_find_service.getDistance(start_longitude, start_latitude, hospitalInfo.get(i).getLongitude(), hospitalInfo.get(i).getLatitude());
			
			info.setDistance(distance);
			store.add(info);
			
		}
		
		
		Collections.sort(store,new Comparator<InformationToSend>() {

		
			
			public int compare(InformationToSend p1,InformationToSend p2) {
				
				return (int) (p1.getDistance()-p2.getDistance());
			}
		});
		
		return store;
	}

}
