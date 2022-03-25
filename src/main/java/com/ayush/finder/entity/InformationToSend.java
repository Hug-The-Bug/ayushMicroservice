package com.ayush.finder.entity;

import java.util.List;

public class InformationToSend {
	
	private String hospital_name;
	private String open_time;
	private String close_time;
	private String phone_No;
	private String address;
	private String website_link;
	private double distance;
	private List<String> services;
	
	
	public InformationToSend() {
		
	}
	
	public InformationToSend(String hospital_name, String open_time, String close_time, String phone_No, String address,
			String website_link, double distance, List<String> services) {
		super();
		this.hospital_name = hospital_name;
		this.open_time = open_time;
		this.close_time = close_time;
		this.phone_No = phone_No;
		this.address = address;
		this.website_link = website_link;
		this.distance = distance;
		this.services = services;
	}

	public String getHospital_name() {
		return hospital_name;
	}

	public void setHospital_name(String hospital_name) {
		this.hospital_name = hospital_name;
	}

	public String getOpen_time() {
		return open_time;
	}

	public void setOpen_time(String open_time) {
		this.open_time = open_time;
	}

	public String getClose_time() {
		return close_time;
	}

	public void setClose_time(String close_time) {
		this.close_time = close_time;
	}

	public String getPhone_No() {
		return phone_No;
	}

	public void setPhone_No(String phone_No) {
		this.phone_No = phone_No;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWebsite_link() {
		return website_link;
	}

	public void setWebsite_link(String website_link) {
		this.website_link = website_link;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public List<String> getServices() {
		return services;
	}

	public void setServices(List<String> services) {
		this.services = services;
	}
    
	
	
	
	

}
