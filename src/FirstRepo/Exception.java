package FirstRepo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alphabets = "Dhruvaas";
	char[] arr4=	alphabets.toCharArray();
	List<String> list = Arrays.asList(alphabets);
//		
//		System.out.println("list is"+ list);
		Set <String>listset = new HashSet<>(list);
//		
//		//System.out.println(listset); //unique values
	//System.out.println(Collections.frequency(list.subList(1,2), listset));

			System.out.println('a'+" -->"+Collections.frequency(listset, 'a'));


		
		int [] arr = {1,2,3,2,4,5,6,4,7,8,5};
		for(int i=0; i< arr.length; i++) {
			for(int j= i+1; j< arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					System.out.println("output -"+arr[i] );
				}
			}
		}
	}

}
