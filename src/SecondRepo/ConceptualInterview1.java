package SecondRepo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ConceptualInterview1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Revome Duplicate values
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1); arr.add(2); arr.add(3); arr.add(1); arr.add(3); arr.add(5);
		arr.add(2);
		
		long arr3=	 arr.stream().mapToInt(Integer :: intValue).sum();//arr.stream().map(i -> i + i).collect(Collectors.toList());
	List<Integer> arr2=	arr.stream().distinct().collect(Collectors.toList());
	Set<Integer> duplicate = new HashSet<Integer>(arr);
	
	System.out.println("hiii->"+duplicate);
	System.out.println(arr2 + " "+ arr3);
	
	//Reverse a number
	
	int num = 12345;
	
	int sum =0;
	
	
	while(num != 0) {
		
		int num1 = num%10;
		sum = sum *10 + num1;
		
		num = num/10; 
	}
	System.out.println(sum);
	
	
	//FiZZ BUZZ
	
	for(Integer i=1 ; i<=15; i++) {
		String result = (i%3==0 &&i %5 ==0 ) ? "FIZZBUZZ" : (i%3 ==0) ? "FIZZ" : (i%5==0) ? "BUZZ" : i.toString();
		
		System.out.println(result);
	}
	//
	
	  List<String> list = new ArrayList<>();  
      list.add("a");  
      list.add("a");  
      list.add("b");  
      list.add("d"); 
      list.add("c"); 
    System.out.println("List of elements: "+list);  
    System.out.println("\nCount all with frequency:");  
  HashSet<String> uniqueSet = new HashSet<String>(list);  
  for (String i : uniqueSet) {  
       System.out.println(i + ": " + Collections.frequency(list, i));  
  } 

	
	}
	


}
