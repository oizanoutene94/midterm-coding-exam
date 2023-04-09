package datastructure;

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
		// creating a new  map
		Map<String, List<String>> map = new HashMap<String, List<String>>();

		// create a new list of strings to add to the map
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("six");
		list.add("seven");
		System.out.println(list);
		//add the list to the map using the key  ls
		map.put("ls", list);
		System.out.println(map);
		// retrieve the list from the map using the key word "ls"
		List<String> retrievedList = map.get("ls");
		System.out.println(retrievedList);
		// using a for each loop print each element from the retrievedList
		for (String ls : retrievedList) {
			System.out.println(ls);
		}
		//using a while loop with iterator print each element of the retrievedList
		System.out.println("while loop with iterator :");
		Iterator<String> iterator = retrievedList.iterator();
		while (iterator.hasNext()) ;
		System.out.println(iterator.next());
	}

	//connect to database

	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","abc1234");

}









