package Practice5;

import java.util.*;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList
		System.out.println("1: ARRAYLIST");
		ArrayList<String> name = new ArrayList<String>();
		name.add("Anjali");
		name.add("Abhijith");
		System.out.println(name);
		
		//Vector
		System.out.println("\n2: VECTOR");
		Vector<Integer> vec=new Vector<Integer>();
		vec.addElement(12);
		vec.add(11);
		System.out.println(vec);
		
		//LINKEDLIST
		System.out.println("\n3:LINKEDLIST");
		LinkedList<String> names=new LinkedList<String>();  
	      names.add("Arun");  
	      names.add("Kevin");  	      
	      System.out.println(names);
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	      }
	       //HASHSET
	       System.out.println("\n");
	       System.out.println("4:HASHSET");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(10);  
	       set.add(13);  
	       set.add(12);
	       set.add(17);
	       System.out.println(set);
	       
	       //LINKEDHASHSET
	       System.out.println("\n");
	       System.out.println("5:LINKEDHASHSET");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(11);  
	       set2.add(13);  
	       set2.add(12);
	       set2.add(14);	       
	       System.out.println(set2);

	}

}
