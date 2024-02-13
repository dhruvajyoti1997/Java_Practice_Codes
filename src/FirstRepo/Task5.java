package FirstRepo;

import java.util.ArrayList;
import java.util.Iterator;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String s1 = "HELLO";
		// Count the maximum Occurance of words
		/*
		 * String s2 = "HELLO BLACK ROSE DOWN BLACK HELLO";
		 * 
		 * int count = 0;
		 * 
		 * //String s22= s2.toLowerCase();
		 * 
		 * String[] words = s2.split(" "); for(int i=0; i< words.length; i++) { count
		 * =1; for(int j = i+1; j< words.length; j++) {
		 * 
		 * if(words[i].equals(words[j])) { count++; //
		 * 
		 * }
		 * 
		 * } if(count >1 && words[i] != "0") System.out.println(words[i]); }
		 */

		// System.out.println(s1.charAt(0));
		// System.out.println(s2);

		/*
		 * String s3 = s1.substring(3)+ s1.charAt(0); System.out.println(s3); //bcdea
		 * 
		 * String s4 = s1.charAt(s1.length()-1) + s1.substring(0, s1.length()-1);
		 * System.out.println(s4); //eabcd
		 */

		/*
		 * String A = "hello"; String B = "java"; // Print Captial Letter of a first
		  letter char[] a = A.toCharArray(); String C = A.substring(0, 1).toUpperCase()
		  + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1);
		  
		 System.out.println(C);
		 */
		
		// Traverse a string
		/*
		  for (int i = a.length - 1; i >= 0; i--) {
		  
		  System.out.println(a[i]); }
		 */

		// Traverse a list

	 /*  ArrayList<Integer> D = new ArrayList<>();

		D.add(1);
		D.add(2);
		D.add(3);

		Iterator obj = D.iterator();

		while (obj.hasNext()) {

			Integer w = (Integer) obj.next();
			System.out.println(w);*/

		//String Plaindrome
			String orgStr = "aadaa";
            String rev = "";
			
            StringBuilder str1 = new StringBuilder(orgStr);
            
           StringBuilder str2= str1.reverse();
			/*
			 * for (int i = orgStr.length() - 1; i >= 0; i--) { rev= rev + orgStr.charAt(i);
			 * System.out.println(orgStr.charAt(i)); }
			 */
			
			if ( str1.equals(str2)/*orgStr.equals(rev)*/) {
				System.out.println("palindrome");
			} else {

				System.out.println("Not Palindrome");
			}
			
			Math.pow(2, 7);
		}
	}


