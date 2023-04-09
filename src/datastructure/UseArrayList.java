package datastructure;



import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.sql.*;
import java.util.ArrayList;


import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import static java.sql.DriverManager.getConnection;

public class UseArrayList {

	public UseArrayList() throws SQLException {
	}

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		ArrayList<Integer> numbers = new ArrayList<>();
		// add the element to the arrayList
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		System.out.println(numbers);
		//peek the first element to the array list
		int firstNumber = numbers.get(0);
		System.out.println("First number: " + firstNumber);

		//remove the second element
		numbers.remove(1);
		System.out.println(numbers);
		//retrieve element using the for loop
		System.out.print("Elements: ");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i) + " ");
		}
		System.out.println();

		//Print all the elements in the ArrayList using a for-each loop
		for (int n : numbers) {
			System.out.println(n);
		}

		// Print all the elements in the ArrayList using a while loop and an iterator
		//System.out.println("while with iterator");
		Iterator<Integer> iterator = numbers.listIterator();
		while (iterator.hasNext()) ;
		int number = iterator.next();
		System.out.println(number);
	}
	//sort the arraylist

	// connect to the database
}
























