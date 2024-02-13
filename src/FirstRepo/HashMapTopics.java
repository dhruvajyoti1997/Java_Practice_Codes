package FirstRepo;
//import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class HashMapTopics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*A HashMap is similar to HashTable With a difference that it does not guarantee the order because it is not
synchronized.

It can store null values for key and value.

Hashmap allows duplicate values but not key.

*
*/ 
//		
//		HashMap <Integer, String> cities = new HashMap<Integer, String>();
//		cities.put(100, "Delhi");
//		cities.put(101, "Kolkata");
//		cities.put(102, "Mumbai");
//		cities.put(103, "Chennai");
//		cities.put(104, "Bangalore");
//		
//		
//	//	System.out.println(cities.values());  //To print the values 
//		
//		
//		//System.out.println(cities.containsKey());
//		/* Iteration over HashMap*/
//		for(Map.Entry mapSet: cities.entrySet()) {
//			System.out.println(mapSet.getValue() +"\t"+ mapSet.getKey());
//		}
//		
//		/* Converting HashMap Key to List*/
//		
//		Collection<Integer> keys = cities.keySet().stream().collect(
//                Collectors.toCollection(ArrayList::new));
//		System.out.println(keys);
//		
//		/* Converting HashMap values to List*/
//		
//		Collection<String> val = cities.values().stream().collect(Collectors.toCollection(ArrayList :: new));
//		
//		System.out.println(val);
		
//		HashMap<String, Long> myphonebook = new HashMap<String , Long>();
//		myphonebook.put("Neelisha",  (long) 987326542);
//		myphonebook.put("Shivam",  (long) 985672810);
//		myphonebook.put("Tariq",  (long) 987459021);
//		
//		for(Map.Entry<String, Long> phone : myphonebook.entrySet()) {
//			System.out.println(phone.getKey() +"============="+ phone.getValue());
//			
//	
//		}
//		System.out.println(myphonebook.size());
//		System.out.println(myphonebook.remove("Tariq"));
		
		//@SuppressWarnings("deprecation")
//		Integer i = new Integer(4);
//		Integer w= i.compareTo(4);
//		System.out.println(w);
		
		//Count the duplicate elements
		
//		 String s1= "DhruvaAA"; char c[] = s1.toCharArray();
//		 
//		 HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
//		 
//		 for(int i=0; i< c.length; i++) {
//		 
//		 if(hashmap.containsKey(c[i])) {
//			 hashmap.put(c[i], hashmap.get(c[i])+1);
//		
//		 }
//		 else 
//		 { hashmap.put(c[i], 1); 
//		 } 
//		 } 
//		 System.out.println(hashmap);
		 
		
//		HashSet<Integer> e1 = new HashSet<Integer>();
//		
//		e1.add(123);
//		e1.add(234);
//		e1.add(345);
//		
//		Iterator<Integer> i = e1.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
//		
		HashMap<Integer, String> newMap = new HashMap<Integer, String>();
		newMap.put(1, "Dhruva"); newMap.put(2, "Navin"); newMap.put(3, "Sunil"); newMap.put(4, "rohit");
	
//		Iterator itr = newMap.entrySet().iterator();
//		
//		while(itr.hasNext()) {
//			
//			Map.Entry<Integer, String> p = (Entry<Integer, String>) itr.next();
//			
//			System.out.println(p.getKey());
//		}
		
		for(Map.Entry<Integer, String> p : newMap.entrySet()) {
			
			System.out.println(p.getValue());
		}
		
	}

}
