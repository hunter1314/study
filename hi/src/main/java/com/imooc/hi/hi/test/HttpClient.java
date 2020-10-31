package com.imooc.hi.hi.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpClient {
	 private static String REST_API = "http://localhost:8081";
	 
	 public static void main(String[] args) throws Exception {
	  //addResource();
	  getAllResource();
	 }
	 
	 public static void addResource() throws Exception {
	  //ObjectMapper mapper = new ObjectMapper();
	  URL url = new URL(REST_API + "/user/showUser?id=2");
	  HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
	  httpURLConnection.setDoOutput(true);
	  httpURLConnection.setRequestMethod("GET");
	  httpURLConnection.setRequestProperty("Accept", "application/json");
	  httpURLConnection.setRequestProperty("Content-Type", "application/json");
	  
	  BufferedReader reader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
	  String output;
	  System.out.print("addResource result is : ");
	  while ((output = reader.readLine()) != null) {
	   System.out.print(output);
	  }
	  System.out.print("\n");
	 }
	 
	 public static void getAllResource() throws Exception {
	  URL url = new URL(REST_API + "/user/showUser?id=2");
	  HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
	  httpURLConnection.setRequestMethod("GET");
	  httpURLConnection.setRequestProperty("Accept", "application/json");
	  BufferedReader reader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
	  String output;
	  System.out.print("getAllResource result is :");
	  while ((output = reader.readLine()) != null) {
	   System.out.print(output);
	  }
	  System.out.print("\n");
	 }
	 
	 //http://localhost:8081/user/showUser?id=2
}
