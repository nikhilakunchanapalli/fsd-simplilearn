package demoMap;

import java.util.*;


public class HashMap1 {
	 
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		 //Creating HashMap
		
		map.put(1,"nikhila"); //put element in map
		map.put(2,"deepthi");
		map.put(3,"Pinky");
		map.put(1,"rinku");  //trying duplicate key
		
		System.out.println("Iterating HashMap...");
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
			
		}
		


	}
}

