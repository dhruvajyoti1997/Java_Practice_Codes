package FirstRepo;

import java.util.*;

public class Task2 {

//	public static void printsum(int n) {
//		if(n<=100) {
//			System.out.print(n);
//			printsum(n +1);
//		}
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		printsum(1);
		
		
		/*reverse a string  Traditional Method */
		String name ="DhruvaJyoti";
		
		char [] a = name.toCharArray();
		String  rev=" ";
		for(int i= a.length -1; i>= 0; i--) {
			rev = rev+ a[i] ;
		}
		System.out.println(rev);
		//Using String Builder
		StringBuilder s1 = new StringBuilder(name);
		
		System.out.println(s1.reverse()); 
 
		/* Addition Of two strings "111", "222"--> "333"*/
		
		/*String s1 = "111";
		String s2= "222";
		
		
		int foo = Integer.parseInt(s1);
		int foo2=  Integer.parseInt(s2);
		//System.out.println(foo);
		
		int fooResult= foo+foo2;
		
		System.out.println(fooResult); */
		
		
	/* String Compare */
		
//		String s1= "newstring";
//		String s2= "newstring";
//		boolean res = false;
//		for(int i=0; i< s1.length(); i++) {
//			
//			if(s1.charAt(i) != s2.charAt(i)) {
//				res = false;
//			} else {
//				res = true;
//				
//			}
//			
//		
//		}
//		System.out.println("Both String are---------->"+ res);
		
		/* sum of unique numbers*/
		
		//Integer [] a = {1,2,1,3,4,5,4,7,8,2};
//		Integer [] a = {4,4,4,4,2};
//		List count = Arrays.asList(a);
//		Set <Integer> a1 = new HashSet<Integer>(count);
//		
//		int sum =0;
//		
//		for(int sum1 : a1) {
//			
//			sum = sum+sum1;
//		}
//		System.out.println(sum);
		
		//Sort the array
		int  a1[] = {98,54,100,99,32};
		int temp = 0;
		int i,j;
		int size = a1.length;
		System.out.println(size);
		for( i= 0;i< size;i++) {
			for( j=i+1; j<size;j++) {
				if(a1[i] >a1[j]) {
					temp = a1[i];
					a1[i]=a1[j];
					a1[j]=temp;
		
				}
			}
		}
		for(i=0; i<size;i++) {
		System.out.println(a1[size-5]);
		}
		
		String s11 = "YES",s2 = "JS";
		int n;
		
		
			int flag=0;
			for(int ii=0;ii<s11.length();ii++) {
				
				for(int jj=i;jj< s2.length();jj++) {
					if(s1.charAt(ii) == s2.charAt(jj)) {
						flag =1;
					}
				}
			}
			if(flag ==1) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		
		
		
		}
		
		
}


