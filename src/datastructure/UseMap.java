package datastructure;


import java.util.Map.*;
import java.util.*;
import java.util.ArrayList;




public class UseMap {

	public static void main(String[] args) {

		List<String> cityOfUsa = new ArrayList<String>();

		cityOfUsa.add("NY");
		cityOfUsa.add("CA");
		cityOfUsa.add("FL");

		List<String> cityOfCanada = new ArrayList<String>();
		cityOfCanada.add("Montreal");
		cityOfCanada.add("Toronto");



		Map<String,List<String>> map = new LinkedHashMap<String,List<String>>();
		map.put("Usa" ,cityOfUsa);
		map.put("Canada" , cityOfCanada);



		for (Entry <String,List<String>> country :map.entrySet()){
			System.out.println(country.getKey()+ " " + country.getValue());
		}








		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

	}

}
