package com.ssshsgd.tut03;

import java.util.HashMap; //Like the Array List, a Hash Map must be imported

public class Main {

	public static void main(String[] ars) {
		HashMap<String, City> cities;//In the angle brakets, the first type is the key to access the data, and the second type is the type the map holds 
	
		cities = new HashMap<String, City>();
		
		cities.put("LA", new City("Los Angeles", "California", 18550000)); //How we add an element to a hashmap
		
		cities.put("NYC", new City("New York City", "New York", 8406000));
		
		City simi = new City("Simi Valley", "California", 126181);
		
		cities.put("SV", simi); //You can enter an existing object to a Hash Map
		
		cities.get("LA").print(); //This is how you get a specific element in a Hash Map, you put in the key that represents the element. Similar to how you get an element of an array by giving it the index that represents the element
		
		for(City c : cities.values()) { //This is how you can get the values as collection so you can sort through each element
			c.print();
		}
		
		/**
		 * EXPECTED OUTPUT:
		 * 
		 * Los Angeles, California has a population of 18550000
		 * Simi Valley, California has a population of 126181
		 * Los Angeles, California has a population of 18550000
		 * New York City, New York has a population of 8406000
		 * 
		 */
	}
	
}
