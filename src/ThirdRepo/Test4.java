package ThirdRepo;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Convert string to lower case
		String s1 = "LMNOppQQ";
		String s4 = s1.substring(0, 4).toLowerCase() + s1.substring(4, 6) + s1.substring(7, 8).toLowerCase();
		System.out.println("lower case of string--->" + s4);

		// balanced number
		String s2 = "09345";

		int left = 0;
		int right = 0;

		int mid = s2.length() / 2;
		// System.out.println(mid);
		for (int i = 0; i < s2.length(); i++) {

			if (i < mid) {
				left += (int) (s2.charAt(i) - '0');
			} else if (i > mid) {

				right += (int) (s2.charAt(i) - '0');
			}
		}
		if (left == right) {
			System.out.println("balanced");
		} else {
			System.out.println("not balanced");
		}

		// remove elements from first string matches with second string
		String str1 = "computer";
		String str2 = "cat";
		String[] split1 = str1.split("");
		String[] split2 = str2.split("");
		ArrayList<String> arr1 = new ArrayList<String>(Arrays.asList(split1));
		ArrayList<String> arr2 = new ArrayList<String>(Arrays.asList(split2));

		List<String> result = arr1.stream().filter(e -> !arr2.contains(e)).collect(Collectors.toList());

		System.out.println(result);

		// UpperCase Count
		String camel_case = "ckjkUUYII";
		int count = 0;

		for (int i = 0; i < camel_case.length(); i++) {

			if (camel_case.charAt(i) >= 65 && camel_case.charAt(i) <= 90) {
				count++;
			}
		}

		System.out.println("count of uppercase in a string-->" + count);

		// calculate sum from String
		String find_sum = "1abc29";
		int sum = 0;
		int num = 0;

		for (int i = 0; i < find_sum.length(); i++) {
			num = Character.getNumericValue(find_sum.charAt(i));
			if (find_sum.charAt(i) >= '0' && find_sum.charAt(i) <= '9') {
				sum = sum + num % 10;
				num = num / 10;
			}
		}

		System.out.println("sum from String---->" + sum);

		// Sum of an array

		int[] arr = { 1, 2, 3, 4 };

		int arr_sum = 0;
		for (int k = 0; k < arr.length; k++) {

			arr_sum = arr_sum + arr[k];
		}
		System.out.println("array sum --->"+arr_sum);
		
		HashMap<String , Integer> phone_details = new HashMap<>();
		
		phone_details.put("thomas", 98746);
		phone_details.put("dhruva", 98399);
		phone_details.put("ravi", 29939);
		
	  for(Entry<String, Integer> details: phone_details.entrySet()) {
		  
		  if(phone_details.containsKey("gig")) {
			  System.out.println(details.getKey()+" "+details.getValue());
		  } else {
			  System.out.println("not found");
			  break;
		  }
	  }
	  //https://leetcode.com/problems/two-sum/discuss/1687440/Beginner-Friendly-Bruteforce-Method
	  int [] arr4 = {1,2,3,4,5};
	  int target =7;
	  
	  int [] arr5 = new int[2];
	  
	  for(int i=0; i< arr4.length; i++) {
		  for(int j=0; j < arr4.length; j++) {
			  if(arr4[i] + arr4[j] == target) {
				  arr5[0] = i;
				  arr5[1]=j;
			  }
		  }
	  }
		System.out.println(arr5[0] + " and "+arr5[1]);
		
		//alphabets sorting
		
		String alphabets = "geeksforgeeks";
		
		char [] arr_alphabets = alphabets.toCharArray();
		
		Arrays.sort(arr_alphabets);
		
		System.out.println(Arrays.toString(arr_alphabets));
		//number sorting
		int[] int_sort = {1,0,2,1,2,0};
		int temp =0;
	    for(int i=0; i< int_sort.length; i++) {
	    	for(int j = i+1; j < int_sort.length; j++) {
	    		
	    		if(int_sort[i] > int_sort[j]) {
	    			
	    			temp = int_sort[i];
	    			int_sort[i] = int_sort[j];
	    			int_sort[j] = temp;
	    		}
	    	}
	    }
	    
	    for(int k=0; k < int_sort.length; k++) {
	    	
	    	System.out.println(" "+ int_sort[k]);
	    }
	    
	    int decimal_num = 5;
	    String rev ="";
	  String binary_num=  Integer.toBinaryString(decimal_num);
	  
	  for(int i =binary_num.length() -1 ; i >=0; i--) {
		  rev = rev + binary_num.charAt(i);
	  }
	//  System.out.println("rev"+rev);
	if(rev.equals(binary_num)) {
		System.out.println("the result is palindrome");
	} else {
		System.out.println("the result is not a palindrome");
	}
	//  System.out.println(binary_num);
	    
	    String color = "RGRGR";
	    String replace ="";
	    for(int i=0; i < color.length(); i++) {
	    	
	    	if(color.charAt(i) == 'G') {
	    	replace =	color.replace('G', 'R');
	    
	    	}
	    }
		System.out.println("colour is-->"+ replace);
	}
}
