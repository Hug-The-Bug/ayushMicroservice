package com.ayush.finder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ayush.finder.entity.HospitalInfo;
import com.ayush.finder.entity.InformationToSend;
import com.ayush.finder.service.HospitalService;

@RestController
public class Controller {

	
	@Autowired
	HospitalService hospitalService;
	
	@GetMapping("/getdistance")
	public double getDistance() {
		
		
		
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
		  = "https://apis.mapmyindia.com/advancedmaps/v1/33da8c0716b48b3f5f0e8dba54b11291/distance_matrix/driving/77.15605506826591,28.70978159989673;77.3756368423889,28.594492632792353";
		ResponseEntity<String> response
		  = restTemplate.getForEntity(fooResourceUrl , String.class);
		
		double distance=Double.MAX_VALUE;
		try {
			JSONObject jsonObject= new JSONObject(response.getBody());
			
			distance=(double) jsonObject.getJSONObject("results").getJSONArray("distances").getJSONArray(0).get(1);
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return distance;
	}
	
	@GetMapping("/getAllHospitalInfo")
	public List<HospitalInfo> getAllHospitalInfo(){
		return hospitalService.getAllHospitalInfo();
	}
	
	@GetMapping("/getListOfService")
	public List<String> getListOfService(){
		return hospitalService.getListOfService("AH-2019-0076");
	}
	
	@GetMapping("/getAllInfoToSend/{start_longitude}/{start_latitude}")
	
	public List<InformationToSend> getAllInfoToSend(@PathVariable double start_longitude , @PathVariable double start_latitude){
		
//		77.376184, 28.594191
		
//		System.out.println( start_longitude+" "+start_latitude);
		 
		return hospitalService.getAllInfoToSend(start_longitude, start_latitude);
		

	}
//     @GetMapping("/getAllInfoToSend")
//	public double getAllInfoToSend(@RequestParam double start_longitude , @RequestParam double start_latitude){
//
//    	 System.out.println( start_longitude+","+start_latitude);
//    	 return start_longitude+ start_latitude;
//    	 return hospitalService.getAllInfoToSend(start_longitude, start_latitude);
//     }
	
}
