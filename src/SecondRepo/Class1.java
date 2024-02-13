package SecondRepo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
//		String a = "america"; String b= "africa";
//		List<String> a1 = Arrays.asList(a);
//	List<String> a2 = Arrays.asList(b);
		
//		char [] arr1 = a.toCharArray();  char [] arr2 = b.toCharArray();
//				int count =0;
//				for(int i = 0 ; i < arr1.length; i++) {
//					
//					for(int j = i+1; j < arr1.length; j++) {
//						
//						if(a.charAt(i) == a.charAt(j))
//						
//							//count ++;
//						System.out.println(arr1[j]);
//					}
//					if (arr1[count] == arr2[count]) {
//						System.out.println(aa.remove(arr2[count]));
//					}
		
	String str = "america";
	String str2 = "africa";
	
	String[] split1= str.split("");
	String[] split2= str2.split("");
	 ArrayList<String> strList = new ArrayList<String>(
	            Arrays.asList(split1)); 
	 ArrayList<String> strList2 = new ArrayList<String>(
	            Arrays.asList(split2)); 
	 
	 List<String> t3=	 strList2.stream().filter(e -> !strList.contains(e)).collect(Collectors.toList());
	 System.out.println(t3);
//	str2 = str2.substring(0, 1) + str2.substring(1+1) ;
//	
//	System.out.println("val---"+str2);
//		for(int k=0; k < str.length(); k++) {
//			for(int g= 0; g< str2.length(); g++) {
//				
//				if(str.charAt(k) == str2.charAt(g)) {
//					
//					str2 = str2.substring(0, g) + str2.substring( g+1);
//				}
//			}
//		}
//		System.out.println(str2);
	
		//System.out.println('D' +'J');
					
		String binary = "1001110111101110011111";
		
		int op =0;
		
		int count =0;
		
		for(int i=0; i< binary.length(); i++) {
			
			if(binary.charAt(i) == '1') {
				count ++;
				if(count > op) {
					op = count;
				}
				else {
					count =0;
				}
				
			}
		}
		System.out.println("value of count is -->"+op);
				
				
	}

}
