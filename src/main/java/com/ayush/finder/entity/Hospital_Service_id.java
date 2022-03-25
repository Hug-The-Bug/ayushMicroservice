package com.ayush.finder.entity;

import java.io.Serializable;

import javax.persistence.Id;

public class Hospital_Service_id implements Serializable{

	
	
	private String hospital_id;
	
	private int service_id;

	public Hospital_Service_id(String hospital_id, int service_id) {
		super();
		this.hospital_id = hospital_id;
		this.service_id = service_id;
	}
	
	
	
}
