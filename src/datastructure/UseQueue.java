package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		//create a map
		Queue<String> queue = new LinkedList<String>();
		//add few elements to queue
		queue.add("honda");
		queue.add("toyota");
		queue.add("bmw");
		queue.add("ford");
		System.out.println(queue);
		//peek and retrieve the first element
		String peekedElement = queue.peek();
		System.out.println("the first element is : " +peekedElement);
		//remove the first element from queue
		String removedElement = queue.remove();
		System.out.println("the element removed :"  +removedElement);
		// Poll the first element from the Queue
		String polledElement = queue.poll();
		System.out.println("Polled element: " + polledElement);

		// Use a for-each loop to print out each element in the Queue
		System.out.println("Using for-each loop:");
		for (String fruit : queue) {
			System.out.println(fruit);
		}

		// Use a while loop with an Iterator to print out each element in the Queue
		System.out.println("Using while loop with Iterator:");
		Iterator<String> iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}


	}


