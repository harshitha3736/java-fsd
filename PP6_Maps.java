package Phase1_assessment1;

import java.util.*;

public class PP6_Maps {

	public static void main(String[] args) {
		// Creating an empty HashMap
				Map<String, Integer> map = new HashMap<>();

				// Inserting entries in the Map
				// using put() method
				map.put("Harshitha", 18);
				map.put("Impu", 27);
				map.put("Jnanaesh", 36);
				map.put("Issach", 35);

				// Iterating over Map
				for (Map.Entry<String, Integer> e : map.entrySet())

					// Printing key-value pairs
					System.out.println(e.getKey() + " "
									+ e.getValue());

	}

}


