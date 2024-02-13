package FirstRepo;

import java.util.*;

public class Comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<student> list1= new ArrayList<student>();
     list1.add(new student("X",1,70));
     list1.add(new student("G",2,80));
     list1.add(new student("U",3,90));
     
     Collections.sort(list1, student.rollno1);
     System.out.println(list1);
	}

}
