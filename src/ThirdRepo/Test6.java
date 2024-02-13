package ThirdRepo;
import java.util.*;
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
		String s1 = "geeks";
		char [] arr = s1.toCharArray();
		HashMap<Character, Integer> map = new LinkedHashMap<>();
		
		for(int i=0; i < s1.length(); i++) {
			
			char ch = arr[i];
		//	System.out.println(ch);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
				
			} else {
				map.put(ch,1);
			}
			
		}
		System.out.println("duplicate elements ->"+ map);
		for(Map.Entry<Character, Integer> mp : map.entrySet()) {
			
			if(mp.getValue() == 1/*2*/) {
				System.out.println("removed the duplicate-->"+mp.getKey()+" ->"+mp.getValue());
			}
		}
		
		//longest non repeated substring
		String s2= "geeks";
		
		char [] arr2 = s2.toCharArray();
		
		String longestSubstring = null;
		int longSubstringLength = 0;
		HashMap<Character, Integer> map2 = new LinkedHashMap<>();
		for(int i=0; i < s2.length(); i++) {
			
			char ch1 = arr2[i];
			
			if(!map2.containsKey(ch1)) {
				map2.put(ch1, i);
			} else {
				i = map2.get(ch1);
				map2.clear();
			}
		}
		
		if(map2.size() > longSubstringLength) {
			longSubstringLength = map2.size();
			longestSubstring = map2.keySet().toString();
		}
		
		System.out.println(longestSubstring);
	}

}
