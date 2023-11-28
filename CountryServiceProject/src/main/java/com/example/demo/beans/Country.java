package com.example.demo.beans;

public class Country {
	
	private int id;
	private String countryname;
	private String countryCapital;
	
	
	
	public Country(int id, String countryname, String countryCapital) {
		this.id = id;
		this.countryname = countryname;
		this.countryCapital = countryCapital;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public String getCountryCapital() {
		return countryCapital;
	}
	public void setCountryCapital(String countryCapital) {
		this.countryCapital = countryCapital;
	}
	@Override
	public String toString() {
		return "Country [id=" + id + ", countryname=" + countryname + ", countryCapital=" + countryCapital + "]";
	}

}
