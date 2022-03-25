package com.ayush.finder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayush.finder.entity.HospitalInfo;

public interface HospitalRepository extends JpaRepository<HospitalInfo,String>{
	
	
//	public HospitalInfo getHospitalInfo() {
//		
//		
//	}

}
