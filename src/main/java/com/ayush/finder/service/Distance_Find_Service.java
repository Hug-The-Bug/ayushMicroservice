package com.ayush.finder.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Distance_Find_Service {
	RestTemplate restTemplate = new RestTemplate();
	
//	public double getDistance(double start_longitude,double start_latitude,double dest_longitude,double dest_latitude) {
//		
//		
//		
////		RestTemplate restTemplate = new RestTemplate();
////		String fooResourceUrl
////		  = "https://apis.mapmyindia.com/advancedmaps/v1/33da8c0716b48b3f5f0e8dba54b11291/distance_matrix/driving/77.15605506826591,28.70978159989673;77.3756368423889,28.594492632792353";
//		
//		
//		
////String fooResourceUrl
////		  = "https://apis.mapmyindia.com/advancedmaps/v1/33da8c0716b48b3f5f0e8dba54b11291/distance_matrix/driving/"+String.valueOf(start_longitude)+","+String.valueOf(start_latitude)+";"+String.valueOf(dest_longitude)+","+String.valueOf(dest_latitude);
//		
//		String fooResourceUrl
//		  = "https://apis.mapmyindia.com/advancedmaps/v1/b8216fe7b9ba201f39a26f41de94b0d8/distance_matrix/driving/"+String.valueOf(start_longitude)+","+String.valueOf(start_latitude)+";"+String.valueOf(dest_longitude)+","+String.valueOf(dest_latitude);
//	
//		
//		
//		ResponseEntity<String> response
//		  = restTemplate.getForEntity(fooResourceUrl , String.class);
//		
//		double distance=Double.MAX_VALUE;
//		try {
//			JSONObject jsonObject= new JSONObject(response.getBody());
//			System.out.println(jsonObject.getJSONObject("results").getJSONArray("distances").getJSONArray(0));
//			distance=(jsonObject.getJSONObject("results").getJSONArray("distances").getJSONArray(0).getDouble(1));
//			
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return distance;
//	}
	
	
//public double getDistance(double start_longitude,double start_latitude,double dest_longitude,double dest_latitude) {
//		
//		
//		
////		RestTemplate restTemplate = new RestTemplate();
////		String fooResourceUrl
////		  = "https://apis.mapmyindia.com/advancedmaps/v1/33da8c0716b48b3f5f0e8dba54b11291/distance_matrix/driving/77.15605506826591,28.70978159989673;77.3756368423889,28.594492632792353";
//		
//		
//		
////String fooResourceUrl
////		  = "https://apis.mapmyindia.com/advancedmaps/v1/33da8c0716b48b3f5f0e8dba54b11291/distance_matrix/driving/"+String.valueOf(start_longitude)+","+String.valueOf(start_latitude)+";"+String.valueOf(dest_longitude)+","+String.valueOf(dest_latitude);
//		
////		String fooResourceUrl="https://atlas.microsoft.com/route/directions/json";
//	
//	String fooResourceUrl="https://atlas.microsoft.com/route/directions/json?api-version={api-version}&query={query}&travelMode={travelMode}&subscription-key={subscription-key}";
//	
//		Map<String, String> vars = new HashMap<>();
//		
//		String querry= start_latitude+","+start_longitude+":"+dest_latitude+","+dest_longitude;
//		
//		vars.put("api-version", "1.0");
//		vars.put("query", querry);
//		vars.put("travelMode","car");
//		vars.put("subscription-key", "Qr06pfw8OqZm9fnjLAKJbMKpmolImw93RBb0F7k7Jrw");
//		
//		ResponseEntity<String> response
//		  = restTemplate.getForEntity(fooResourceUrl , String.class,vars);
//		
//		double distance=Double.MAX_VALUE;
//		try {
//			JSONObject jsonObject= new JSONObject(response.getBody());
//			System.out.println(jsonObject.getJSONArray("routes").getJSONObject(0).getJSONObject("summary").getDouble("lengthInMeters"));
//			distance=(jsonObject.getJSONArray("routes").getJSONObject(0).getJSONObject("summary").getDouble("lengthInMeters"));
//			
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return distance;
//	}
	
	
	
	
	public double getDistance(double start_longitude,double start_latitude,double dest_longitude,double dest_latitude) {
		
	
		
		start_longitude = Math.toRadians(start_longitude);
		dest_longitude = Math.toRadians(dest_longitude);
		start_latitude = Math.toRadians(start_latitude);
		dest_latitude = Math.toRadians(dest_latitude);
 
        // Haversine formula
        double dlon = dest_longitude - start_longitude;
        double dlat = dest_latitude - start_latitude;
        double a = Math.pow(Math.sin(dlat / 2), 2)
                 + Math.cos(start_longitude) * Math.cos(dest_longitude)
                 * Math.pow(Math.sin(dlon / 2),2);
             
        double c = 2 * Math.asin(Math.sqrt(a));
 
        // Radius of earth in kilometers. Use 3956
        // for miles
        double r = 3956;
 
        // calculate the result
        return(c * r);
		
		
		
	}
	
}
