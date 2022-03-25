package com.ayush.finder.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(Hospital_Service_id.class)
public class Hospital_service {

	@Id
	private String hospital_id;
	@Id
	private int service_id;
	public Hospital_service(String hospital_id, int service_id) {
		super();
		this.hospital_id = hospital_id;
		this.service_id = service_id;
	}
	public String getHospital_id() {
		return hospital_id;
	}
	public void setHospital_id(String hospital_id) {
		this.hospital_id = hospital_id;
	}
	public int getService_id() {
		return service_id;
	}
	public void setService_id(int service_id) {
		this.service_id = service_id;
	}
	
	
	
}
