//sample program for hash map 11

import java.util.HashMap;
import java.util.Map;
 
public class FirstProgram {
	 public static void main(String[] args)
	    {
	        //MAP
	        Map<String, String> foodTable
	            = new HashMap<String, String>();
	 
	       
	        foodTable.put("A", "Angular");
	        foodTable.put("J", "Java");
	        foodTable.put("P", "Python");
	        foodTable.put("H", "Hibernate");
	 
	        // Iterating HashMap through for loop
	        for (Map.Entry<String, String> set :
	             foodTable.entrySet()) {
	 
	            // Printing all elements of a Map
	            System.out.println(set.getKey() + " = "
	                               + set.getValue());
	        }
	    }
}
