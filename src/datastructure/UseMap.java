package datastructure;

import databases.ConnectToSqlDB;

import java.sql.*;
import java.util.*;

public class UseMap {

	public UseMap() throws SQLException {
	}

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Use any databases to store data and retrieve data.
		 */

		//Demonstrate how to use Map that includes storing and retrieving elements.----------

		Map<Integer, String> country = new HashMap<>();
		//Demonstration how to use Map that includes storing and retrieving elements.--------------

		country.put(1, "USA");
		country.put(2, "ALGERIA");
		country.put(3, "RUSSIA");
		country.put(4, "CHINA");
		country.put(5, "GERMANY");

		//retrieving elements with for each loop---------------------------------------

		for (String i : country.values())
			System.out.println(i);
		System.out.println();

		//retrieving elements with for each loop----------------------------------------------

		for (Map.Entry str : country.entrySet()) {
			System.out.print(str.getKey() + ":");
			System.out.println(str.getValue());
		}
		System.out.println();

		//retrieving elements using while loop with an iterator-----------------------------------------

		Iterator<Map.Entry<Integer, String>> it = country.entrySet().iterator();
		while (it.hasNext())
			System.out.println(it.next());
		System.out.println();


		//Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		Map<String, List<String>> map = new HashMap<String, List<String>>();

		// create a new list of strings to add to the map-----------------------------------------------

		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("six");
		list.add("seven");
		System.out.println(list);

		//add the list to the map using the key  ls-------------------------------------

		map.put("ls", list);
		System.out.println(map);

		// retrieve the list from the map using the key word "ls"-------------------------------

		List<String> retrievedList = map.get("ls");
		System.out.println(retrievedList);

		// using a for each loop print each element from the retrievedList-----------------------------

		for (String ls : retrievedList) {
			System.out.println(ls);
		}
		//using a while loop with iterator print each element of the retrievedList---------------------

		System.out.println("while loop with iterator :");
		Iterator<String> iterator = retrievedList.iterator();
		while (iterator.hasNext()) ;
		System.out.println(iterator.next());
	}


	//Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.-------------------------

	ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
	int[] list = new int[20];


	}









