package com.ayush.finder.service;

import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Distance_Find_Service {
	RestTemplate restTemplate = new RestTemplate();
	
	public double getDistance(double start_longitude,double start_latitude,double dest_longitude,double dest_latitude) {
		
		
		
//		RestTemplate restTemplate = new RestTemplate();
//		String fooResourceUrl
//		  = "https://apis.mapmyindia.com/advancedmaps/v1/33da8c0716b48b3f5f0e8dba54b11291/distance_matrix/driving/77.15605506826591,28.70978159989673;77.3756368423889,28.594492632792353";
		
		
		
//String fooResourceUrl
//		  = "https://apis.mapmyindia.com/advancedmaps/v1/33da8c0716b48b3f5f0e8dba54b11291/distance_matrix/driving/"+String.valueOf(start_longitude)+","+String.valueOf(start_latitude)+";"+String.valueOf(dest_longitude)+","+String.valueOf(dest_latitude);
		
		String fooResourceUrl
		  = "https://apis.mapmyindia.com/advancedmaps/v1/b8216fe7b9ba201f39a26f41de94b0d8/distance_matrix/driving/"+String.valueOf(start_longitude)+","+String.valueOf(start_latitude)+";"+String.valueOf(dest_longitude)+","+String.valueOf(dest_latitude);
	
		
		
		ResponseEntity<String> response
		  = restTemplate.getForEntity(fooResourceUrl , String.class);
		
		double distance=Double.MAX_VALUE;
		try {
			JSONObject jsonObject= new JSONObject(response.getBody());
			System.out.println(jsonObject.getJSONObject("results").getJSONArray("distances").getJSONArray(0));
			distance=(jsonObject.getJSONObject("results").getJSONArray("distances").getJSONArray(0).getDouble(1));
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return distance;
	}
	
	
	
}
