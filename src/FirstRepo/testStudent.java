package FirstRepo;

import java.util.*;
import java.util.stream.Collectors;

public class testStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		student s1= new student("Dhruva",1,76);
//		student s2= new student("Siba",3,65);
//		student s3= new student("Yalladas",11,53);
//		student s4= new student("XYZ",19,36);
//		student s5= new student("YZB",41,65);
//		//System.out.println(s1.getPercentage());
//		
//		List<student> li = new ArrayList<student>();
//		
//		li.add(s1); li.add(s2); li.add(s3); li.add(s4);li.add(s5);  -- we are commenting this student object just to use in the below method
		
		//System.out.println(li.size());
		
		//the motive is to get the students which are having percentage of more than 36 // concept of functional programming.
		
		
		//below method is a traditional method.
//		for(student e : li){
//			if(e.getPercentage() > 36) {
//			System.out.println(e.getPercentage());
//			}
//		}
		
		//now we will create a new method in which we will stream those list of values.
		
//		List<student> li1 = null;
//		//printWithFunctionProgramming(li1);
//	}
//
//	
//
//	private static void printWithFunctionProgramming(List<student> li1) {
//		// TODO Auto-generated method stub
//		student s1= new student("Dhruva",1,76);
//		student s2= new student("Siba",3,65);
//		student s3= new student("Yalladas",11,53);
//		student s4= new student("XYZ",19,36);
//		student s5= new student("YZB",41,65);
//		//System.out.println(s1.getPercentage());
//		
//		List<student> li11 = new ArrayList<student>();
//		li11.add(s1); li11.add(s2); li11.add(s3); li11.add(s4);li11.add(s5); 
//		li11.stream().forEach(e -> System.out.println(e.getPercentage())
//				);
		
		List<String> list = Arrays.asList("geeks", "gs","for","hkgs");
		
		List<String> answer = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(answer);
		
		
		
	}

}
