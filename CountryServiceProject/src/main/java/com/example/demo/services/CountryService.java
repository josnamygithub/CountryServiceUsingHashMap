package com.example.demo.services;

import java.util.*;

import org.springframework.stereotype.Component;

import com.example.demo.beans.Country;
import com.example.demo.controllers.AddResponse;

@Component
// these anotation is used to  help to create object in the controller class and there we use the @Autowired 
public class CountryService {

	static HashMap<Integer ,Country> countryIdMap;
	
	public CountryService() {
		
		countryIdMap = new HashMap<Integer,Country>();
		
		Country IndiaCountry = new Country(1,"India","Delhi");
		Country UsaCountry = new Country(2,"USA", "Washington");
		Country UKCountry = new Country(3,"UK","London");
		
		countryIdMap.put(1, IndiaCountry);
		countryIdMap.put(2, UsaCountry);
		countryIdMap.put(3, UKCountry);
	}
	public List getALLCountries() {
		
		List countries = new ArrayList(countryIdMap.values());
		return countries;
	}
	 
	
	public Country getCountryById(int id) {
		Country country = countryIdMap.get(id);
		return country;
	}
	
	public Country getCountryByName (String countryname) {
		Country country = null;
		for(int i :countryIdMap.keySet()) {
			if(countryIdMap.get(i).getCountryname().equals(countryname))
				country= countryIdMap.get(i);
		}
		return country;
	}
//utility method to get max id ;
	public static int getMaxId() {
		int max=0;
		for (int id:countryIdMap.keySet()) {
			if(max<=id) max=id;
		}
		return max+1;
	}
	
	public Country addcountry(Country country) {
		
		country.setId(getMaxId());
		countryIdMap.put(country.getId(), country);
		return country;
	}
	
	public Country updateCountry(Country country) {
		if(country.getId() >0 ) {
			countryIdMap.put(country.getId(), country);
		}
		return country;
		
	}
	
	public AddResponse  deleteCountry(int id) {
		countryIdMap.remove(id);
		AddResponse res = new AddResponse();
		res.setMsg("Country Deleted...");
		res.setId(id);
		
		return res;
	}
}
