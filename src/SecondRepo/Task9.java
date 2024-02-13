package SecondRepo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//conceptual
String a = "A"+"B"+"C";
String temp= "ABC";


System.out.println(a.equals(temp) );


//try {
//	
//	int ha= 30;
//	System.out.println(ha);
//} catch(Exception e) {
//	
//	int b= 40;
//	System.out.println(b);
//} finally {
//	int c= 50;
//	System.out.println(c);
//}

String A ="hello"; String B = "world";

String result = A.substring(0,1).toUpperCase() + A.substring(1) + B.substring(0,1).toUpperCase() + B.substring(1);
System.out.println(result);

ArrayList<Integer> arr = new ArrayList<>();

arr.add(1); arr.add(2); arr.add(7); arr.add(3); arr.add(6); arr.add(7);


List<Integer> res =arr.stream().filter(i -> Collections.frequency(arr, i) >1).collect(Collectors.toList());

System.out.println(res);

	}

}
