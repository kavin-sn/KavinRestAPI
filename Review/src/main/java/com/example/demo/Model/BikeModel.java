package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class BikeModel 
{
	@Id                                         
   private int bikenum;
   private String bikename;
   private String bikeversion;
public int getBikenum() {
	return bikenum;
}
public void setBikenum(int bikenum) {
	this.bikenum = bikenum;
}
public String getBikename() {
	return bikename;
}
public void setBikename(String bikename) {
	this.bikename = bikename;
}
public String getBikeversion() {
	return bikeversion;
}
public void setBikeversion(String bikeversion) {
	this.bikeversion = bikeversion;
}
   
}
