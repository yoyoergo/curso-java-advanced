package ar.com.educacionit.clase2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;

class Clase2Yield {

	public static void main(String[] args) {
		/**
		 * Yield
		 * 
		 */
		
		HiloT hiloT1 = new HiloT("Hilot1");
		
		Thread.yield();
		
		//NO SE USA MAS
		
		//JAVA COLLECTION FRAMEWORK:
		//Collection
		//Set: no admite duplicados 
			//TreeSet
			//HashSet
		//
		//List: admite
			//LinkedList
			//ArrayList
		//Map: key-value
			//HashMap
			//LinkedHashMap
		// Hashtable<String, String> map = new Hashtable<>();
		HashMap<String, String> map2 = new HashMap<>();
		Collections.synchronizedMap(map2);
				
		System.out.println("Fin aplicacion");
	}
}
