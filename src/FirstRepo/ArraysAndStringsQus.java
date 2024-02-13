package FirstRepo;

import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraysAndStringsQus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
//		String str= "woodOfwalls";
//		String str1 = str.toLowerCase();
//		int count =0;
//		//char [] a = str.toCharArray();
//		//char ff = 0;
//		char search = 'o';
//		for(int i=0; i< str.length(); i++) {
//			//for(int j= i+1; j< a.length; j++) {
//				
//				if(str1.charAt(i) == search) {
//					
//					//ff = a[j];
////					System.out.println(ff);
////					//System.out.println("==============COUNT==================");
////					
////					
//					count ++;
//					
//					
//					//break;
//				}
//			//}
//			
//		}
//		System.out.println( count);
		//=========================================================================================================================
		//Check the occurance of each characters
		String alphabets = "Dhruvaas";
		List<String> list = Arrays.asList(alphabets);
		
		//System.out.println("list is"+ list);
		Set <String>listset = new HashSet<>(list);
		
		//System.out.println(listset); //unique values
		//System.out.println(Collections.frequency(list.subList(1,2), listset));
		for(String s : listset) {
			System.out.println(s+" -->"+Collections.frequency(list, s));
//		
		}
//		
		
//		List <Integer> list = new ArrayList<>();
//		
//	list.sort(Comparator.reverseOrder());
//	
//	System.out.println(list);
//			
		//ANAGRAM CHECK
//		String s1= "dhruva";
//		String s2="ruvdha";
//		
//		char a[] = s1.toCharArray();
//		char b[] = s2.toCharArray();
//		
//		Arrays.sort(a);
//		Arrays.sort(b);
//		
//		boolean result= a.equals(b);
//		
//		if(result == true) {
//			
//			System.out.println("Its an anagram");
//		}
//		else {
//			
//			System.out.println("its not");
//		}
	
		 String str1 = "MMAAYYTTUURE";  
	        int count;  
	        System.out.println("The entered string is: "+str1);
	        //Converts given string into character array  
	        char str[] = str1.toCharArray();  
	          
	        System.out.println("Duplicate characters in a given string: ");  
	        //Count the frequency of each character present in the string  
	        for(int i = 0; i <str.length; i++) 
	        {  
	            count = 1;  
	            for(int j = i+1; j <str.length; j++) 
	            {  
					if (str[i] == str[j] /* && str[i] != ' ' */) 
	                {  
	                    count++;  
	                    //Set string[j] to 0 to avoid printing visited character  
	                  //  str[j] = '0';  
	                }  
	            }  
	            //A character is considered as duplicate if count is greater than 1  
				if (count > 1 /* && str[i] != '0' */)  
	                System.out.println(str[i] );  
	        }  
	    
	        
	        /* ANAGRAM */
//	        char aa[] = a.toLowerCase().toCharArray();
//	        char bb[] = b.toLowerCase().toCharArray();
//	        if(a.length() != b.length()){
//	            return false;
//	        }else{
//	            java.util.Arrays.sort(aa);
//	            java.util.Arrays.sort(bb);
//	            return java.util.Arrays.equals(aa, bb);
//	        }
	}
//		
		
	}


