package eg1;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {

	public static void main(String arg[]) {
		Set<String> hs = new HashSet(); // not maintains order of insertion
		hs.add("Hello");
		hs.add("Hello");
		hs.add("java");
		hs.add("jse");
		hs.add("jme");
		hs.add(null);
		hs.add(null);
		hs.add("Spring");
		System.out.println("hs = " + hs);
		
		Set<String> lhs = new LinkedHashSet(); // maintains order of insertion
		lhs.add("Hello");
		lhs.add("Hello");
		lhs.add("java");
		lhs.add("jse");
		lhs.add("jme");
		lhs.add(null);
		lhs.add(null);
		lhs.add("Spring");
		System.out.println("lhs = " + lhs);
		
		//Set<String> ts = new TreeSet(); //sorts in ascending order
		Set<String> ts = new TreeSet(Collections.reverseOrder());// sorts in descending order
		ts.add("hello");
		ts.add("hello");
		ts.add("java");
		ts.add("jse");
		ts.add("jme");
		//ts.add(null);
		//ts.add(null);
		ts.add("spring");
		ts.add("beta");
		ts.add("alpha");
		System.out.println("ts = " + ts);
		
		for(String s:ts){
			System.out.println(s);
		}
		
		System.out.println(ts.size());
		ts.remove("jme");
		System.out.println(ts);
		
		System.out.println(ts.contains("java"));
		System.out.println(ts.contains("dotnet"));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
