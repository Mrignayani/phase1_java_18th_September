package eg1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		
		List li = new ArrayList();
		li.add(3333);
		li.add("Mrignayani");
		li.add(77.888);
		li.add(true);
		li.add(29999999L);
		li.add('c');
		li.add(null);
		li.add(null);
		li.add(3333);

		System.out.println(li);
		
		List<Integer> list1 = new LinkedList<>();
		
		// Insertion
		list1.add(12222);
		list1.add(12222);
		list1.add(3);
		list1.add(44);
		list1.add(22);
		list1.add(4000);
		list1.add(null);
		list1.add(null);
		System.out.println(list1);
		
		list1.add(1, 100); // add is overloading method, insert the element at particular position
		
		System.out.println(list1);
		System.out.println(list1.size());
		System.out.println(list1.get(8)); // Read
		
		System.out.println("Iterating the list1 using for loop");
		for (int i=0; i<list1.size();i++) {
			System.out.println(list1.get(i));
			
		}
		
	
		list1.set(7, 7777); //Updation
		System.out.println(list1);
		
		
		list1.remove(0); // takes index
		System.out.println(list1);
		
		Integer i = 100;
		list1.remove(i);//takes object as value and deletes the value from the list remember it takes off only the first occurrence in case of 2 same objects
		System.out.println(list1);
		
		list1.add(22);
		list1.add(22);
		System.out.println(list1);
		
		
		Integer i1 = 22;
		list1.remove(i1);
		System.out.println(list1);
		
		while(list1.remove(i1));
		System.out.println(list1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
