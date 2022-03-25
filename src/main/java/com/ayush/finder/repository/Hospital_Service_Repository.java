package com.ayush.finder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ayush.finder.entity.Hospital_Service_id;
import com.ayush.finder.entity.Hospital_service;

public interface Hospital_Service_Repository extends JpaRepository<Hospital_service,Hospital_Service_id> {

	
	@Query(
			  value = "SELECT service_id FROM hospital_service WHERE hospital_id =?1", 
			  nativeQuery = true)
	public List<Integer> getAllServiceId(String hospital_id);
	
	
}
