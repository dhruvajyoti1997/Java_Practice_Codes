package FirstRepo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Wrong Code String input2= "Where is my game"; String input1 = "Where";
		 * 
		 * System.out.println(checkOccurance(input1, input2));
		 */

		
		//  find Duplicate Elements 
		  String [] names = {"Java", "JavaScript","Kotlin","Python","Java"};
		 
		  for(int i=0; i<names.length;i++)
		  { for(int j=i+1; j< names.length; j++) 
		  {
		  
		  if(names[i].equals(names[j])) { System.out.println(names[i]); } 
		  }
		  }
		 

		/*
		 * largest And smallest Number in an array
		 * 
		 * int[] num = { 1, 4, 10, 100, 120, 60, 20 };
		 * 
		 * int largest = num[0]; int smallest = num[0]; for (int i = 0; i < num.length;
		 * i++) {
		 * 
		 * if (largest < num[i]) { largest = num[i]; } else if (smallest > num[i]) {
		 * smallest = num[i]; } } System.out.println(largest);
		 * System.out.println(smallest);
		 */

		/*
		 * To calculate Distinct values List<Integer> s2= Arrays.asList(3,7,6,9,3,1);
		 * 
		 * List<Integer> integerslist =
		 * s2.stream().distinct().collect(Collectors.toList());
		 * 
		 * System.out.println(integerslist);
		 */

		/*
		 * Count the duplicate values in an array using java 8 List<Integer> s2=
		 * Arrays.asList(3,7,6,9,3,1);
		 * 
		 * long integerslist = s2.stream().filter( i -> Collections.frequency(s2, i)
		 * >1).count();//
		 * 
		 * System.out.println(integerslist);
		 */

		
		/* * Find the Duplicate Values */
		/*
		 * List<Integer> s2= Arrays.asList(3,7,6,9,3,1);
		 * 
		 * List<Integer> integerslist = s2.stream().filter( i ->
		 * Collections.frequency(s2, i) >1).collect(Collectors.toList());
		 * System.out.println(integerslist);
		 */
		
		
		  List<Character> char1 = Arrays.asList('a','b','c','a','c', 'c');
		 
		 List<Character> c2 = char1.stream().filter(i -> Collections.frequency(char1,
		  i) >1).collect(Collectors.toList());//.count();
		 
		  System.out.println(c2);
		 
		
		
		List<Character> str2 = Arrays.asList('a','b','c','a','b');
		
		@SuppressWarnings("unlikely-arg-type")
		Long str3= str2.stream().filter(i -> Collections.frequency(str2, i) >1).count();
		
		System.out.println(str3);
		
	}

}
