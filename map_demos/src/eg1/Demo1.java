package eg1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo1 {

	public static void main(String arg[]) {
		
		Map<Integer, String> hm = new HashMap<>();
		hm.put(121, "Java");
		hm.put(121,  "Updated");
		hm.put(null,  "testnull");
		hm.put(null, "testnull");
		hm.put(144, null);
		hm.put(244, null);
		System.out.println(hm);
		
		System.out.println(hm.size());
		System.out.println(hm.remove(121));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		System.out.println("Iterating map using keyset() ");
		Set<Integer> set = hm.keySet();
		for (Integer i:set) {
			System.out.println("Key is " +i + " value is " + hm.get(i));
		}
		
		System.out.println("Iterating map using entryset() ");
		for (Entry<Integer, String> e: hm.entrySet()) {
			System.out.println("Key is " +e.getKey() + " value is " + e.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
