package Phase1_assessment1;

import java.io.*;
import java.util.*;

public class PP5_Collections {

	public static void main(String[] args) {
		// create an empty array list with an initial
				// capacity
				Collection<Integer> list1 = new ArrayList<Integer>(5);

				// use add() method to add elements in the list
				list1.add(35);
				list1.add(20);
				list1.add(18);

				// prints all the elements available in list
				for (Integer number : list1) {
					System.out.println("Number = " + number);
				}

				// Creating an empty ArrayList
				Collection<Integer> list2 = new ArrayList<Integer>();

				// Appending the collection to the list
				list2.addAll(list1);

				// displaying the modified ArrayList
				System.out.println("The new ArrayList is: " + list2);

	}

}
