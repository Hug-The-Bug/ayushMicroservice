package com.ayush.finder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ayush.finder.entity.Services;

public interface ServicesRepository extends JpaRepository<Services,Integer>{

	@Query(
			  value = "SELECT service_name FROM services WHERE service_id =?1", 
			  nativeQuery = true)
	public String getServiceNameById(int id);
}
