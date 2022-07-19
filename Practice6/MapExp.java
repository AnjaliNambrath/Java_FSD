package Practice6;

import java.util.Map;
import java.util.*;

class MapExp {

    public static void main(String[] args) {
    	//HashMap
    	System.out.println("HashMap\n");
        Map<String, Integer> num = new HashMap<>();

        num.put("One", 1);
        num.put("Two", 2);
        num.put("Three", 3);
        System.out.println("Map: " + num);

        System.out.println("Keys: " + num.keySet());

        System.out.println("Values: " + num.values());

        int value = num.remove("Two");
        System.out.println("Removed Value: " + value);
        System.out.println("Map: " + num);
        System.out.println("\n");
        //HashTable
        System.out.println("HashTable\n");
        Hashtable<Integer,String> abc=new Hashtable<Integer,String>();  
        abc.put(1, "Anoop");
        abc.put(2, "Arun");
        abc.put(3, "Amal");
        for(Map.Entry n:abc.entrySet()){    
 	       System.out.println(n.getKey()+" "+n.getValue());    
 	      }
        System.out.println("\n");
      //TreeMap
        System.out.println("TreeMap\n");
        TreeMap<Integer,String> tre=new TreeMap<Integer,String>();      
        tre.put(1, "Anoop");
        tre.put(2, "Arun");
        tre.put(3, "Amal");
        for(Map.Entry n:tre.entrySet()){    
 	       System.out.println(n.getKey()+" "+n.getValue());    
 	      }

    }
}
