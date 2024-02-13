package SecondRepo;

import java.util.ArrayList;
import java.util.Arrays;

public class class10 {

	public static void main(String[] args) {
		// LEEDCODE CHALLANGE
//Operator  sum
		String[] operation = { "x++", "x++", "x++" };

		int x = 0;

		for (int i = 0; i < operation.length; i++) {

			String a = operation[i];

			if (a.contains("-")) {
				x--;
			} else {
				x++;
			}
		}
		System.out.println(x);

//Defanging an IP Address

		String address = "1.1.1.1";
		// System.out.println(address.length());
		StringBuilder ans = new StringBuilder(address);
		for (int i = 0; i < address.length(); i++) {

			char ch = address.charAt(i);
			if (ch == '.') {
				ans.append("[.]");
			} else
				ans.append(address.charAt(i));
		}
		System.out.println(ans.toString());

		// Reverse String
		char[] s = { 'h', 'e', 'l', 'l', 'o' };
		char s1 = 0;
		for (int i = s.length - 1; i >= 0; i--) {

			s1 = s[i];
			System.out.println("After reversing--->"+s1);
		}

		// Valid Palindrome
		String a = "A man, a plan, a canal: Panama";
		a = a.replaceAll("\\s", "");
		a = a.replaceAll(",", "");
		a = a.replace(":", "");
		a = a.toLowerCase();
		StringBuilder strb = new StringBuilder(a);

		strb.reverse();
		String data = strb.toString();
		if (a.equals(data)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is Not a Palindrome");
		}
		// System.out.println(a);

		
		//Length Of Last Word
		
		String str ="Hello World";
		
		str = str.substring(6, 11);
		
		
		System.out.println("Length of the Last word is :"+str.length());
		
		//Index of an element
		int num[] = {1,2,3,4,5};
       // to covert array to arraylist --> Arrays.asList(num);
	ArrayList <Integer> arr = new ArrayList<Integer>();
	arr.add(1); arr.add(2); arr.add(3); arr.add(4);
	System.out.println("Index of the given target:"+arr.indexOf(3));
	
	//Find the second largest element in an array
	
	int array[]= {10,20,1,2,3,4,5,8};
	int total = array.length;
	int temp;
	for(int i = 0; i < total; i++) {
		for(int j = i+1; j < total; j++) {
			
			if(array[i]< array[j]) {
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		
	}
	System.out.println("smallest size"+array[total-3]);
	}

}
