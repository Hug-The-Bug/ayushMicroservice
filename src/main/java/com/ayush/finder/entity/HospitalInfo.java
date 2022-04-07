package com.ayush.finder.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HospitalInfo {
	
	private String hospital_name;
	@Id
	private String hospital_accredation_no;
	private double longitude;
	private double latitude;
	private String open_time;
	private String close_time;
	private String phone_no;
	private String address;
	private String website_link;
	private String image;
	
	
	public HospitalInfo() {
		
	}
	
	
//	public HospitalInfo(String hospital_name, String hospital_accredation_no, double longitude, double latitude,
//			String open_time, String close_time, String phone_no, String address, String website_link) {
//		super();
//		this.hospital_name = hospital_name;
//		this.hospital_accredation_no = hospital_accredation_no;
//		this.longitude = longitude;
//		this.latitude = latitude;
//		this.open_time = open_time;
//		this.close_time = close_time;
//		this.phone_no = phone_no;
//		this.address = address;
//		this.website_link = website_link;
//		
//	}

	public HospitalInfo(String hospital_name, String hospital_accredation_no, double longitude, double latitude,
			String open_time, String close_time, String phone_no, String address, String website_link, String image) {
		super();
		this.hospital_name = hospital_name;
		this.hospital_accredation_no = hospital_accredation_no;
		this.longitude = longitude;
		this.latitude = latitude;
		this.open_time = open_time;
		this.close_time = close_time;
		this.phone_no = phone_no;
		this.address = address;
		this.website_link = website_link;
		this.image = image;
	}


	public String getHospital_name() {
		return hospital_name;
	}

	public void setHospital_name(String hospital_name) {
		this.hospital_name = hospital_name;
	}

	public String getHospital_accredation_no() {
		return hospital_accredation_no;
	}

	public void setHospital_accredation_no(String hospital_accredation_no) {
		this.hospital_accredation_no = hospital_accredation_no;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
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

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
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


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}
	

	
	
}
