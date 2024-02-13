package FirstRepo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class functionalPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Filters in streams
		List<Integer> list = List.of(4, 3, 6, 7, 1, 8, 5, 9, 2);
		// getting sum of all even nos by reduce method. -- here in reduce 0 is the
		// starting value like how sum =0 then keep adding the elements.
//		int sum = list.stream().filter(element -> element % 2 == 0).reduce(0,
//				(element1, element2) -> element1 + element2); // -> is called lambda expression //method definition is created in a shortcut format 

		//System.out.println(sum);
		// new way . using filters.
		// filters for getting even values
		//list.stream().filter(element -> element % 2 == 0).forEach(element -> System.out.println(element));

		

		
		// traditional method

//     int sum=0;
//     
//     for(int list1 : list) {
//    	// boolean i= list1%2 == 0;
//    	// System.out.println(i);
//    	 if( list1%2 == 0) {
//    		 
//    		 sum+=list1; //here sum value is changing its called mutations.
//    	 }
//    	 
//     }
//     System.out.println("Sum are--->"+ sum);
		
		Integer [] a = {1,2,3,4,5,6,8,10};
		
		List <Integer> square = Arrays.asList(a);
		
	
	//long a1=	square.stream().filter(n -> n%2 ==0).count();//square.stream().filter(i ->i%2 == 0).map(i -> i*i).collect(Collectors.toList());
	 square.stream().map(number -> number * 3).forEach(System.out::println);
	//System.out.println(a1);
	
	/* merge two arrays/ list */

//	ArrayList<Integer> a11 = new ArrayList<>();
//	a11.add(1);  a11.add(3);  a11.add(5);  a11.add(2); 
//	
//	Collections.sort(a11);
//	
//	//System.out.println(a1); 
//	
//	ArrayList<Integer> a2 = new ArrayList<>();
//	a2.add(7);  a2.add(0);  a2.add(8);  a2.add(6); 
//	
//	Collections.sort(a2);
//	//System.out.println(a2);
//	ArrayList<Integer> newList = new ArrayList<>();
	
//	newList = (ArrayList<Integer>) Stream.concat(a11.stream(), a2.stream()).collect(Collectors.toList());
//	System.out.println(newList);
	
	

	}

}
