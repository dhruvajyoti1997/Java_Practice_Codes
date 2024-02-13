package FirstRepo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//import sun.security.provider.certpath.CollectionCertStore;

public class Streams {

	public static void main(String[] args) {

//		String [] s1 = {"1","6","5","8","3","4"};
//		
//		List<String> ii =  Arrays.asList(s1);
//		System.out.println(ii);
//		List<String> sortedlist = ii.stream().sorted().collect(Collectors.toList());
//	   System.out.println(sortedlist);
	   
		/*
		 * List<Integer> s2= Arrays.asList(3,7,6,9,2,1);
		 * 
		 * // List<Integer> integerslist = s2.stream().sorted((a,b) ->
		 * a.compareTo(b)).collect(Collectors.toList());
		 *  List<Integer> integerslist = s2.stream().filter(n -> n>3).collect(Collectors.toList());
		 * 
		 * System.out.println(integerslist);
		 */
		
		 int arr[] = { 1, 22, 3, 4, 5,22,7 };
		 
	int sum=	 (int) Arrays.stream(arr).filter(i -> i >1).distinct().count();
	Arrays.stream(arr).map(i -> i*3).forEach(System.out :: println);
		  int[] stream = Arrays.stream(arr).filter(n -> n>1).toArray();
		  System.out.println(sum);
	}
	
}
