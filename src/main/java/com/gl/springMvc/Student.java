package com.gl.springMvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lasttName;
	private String country;
	private LinkedHashMap <String,String> countries;
	private String favouriteLanguage;
	private String[] operatingSystem;
	
	public Student() {
		countries = new LinkedHashMap<>();
		countries.put("IN", "India");
		countries.put("UK", "UnitedKingdom");
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLasttName() {
		return lasttName;
	}
	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public LinkedHashMap<String, String> getCountries() {
		return countries;
	}
	public void setCountries(LinkedHashMap<String, String> countries) {
		this.countries = countries;
	}
	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}
	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}
	public String[] getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
}
