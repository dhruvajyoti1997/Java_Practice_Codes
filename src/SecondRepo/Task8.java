package SecondRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//UNO CODING
		int num = 51112;
		int sum=0;
		int digit;
		while(num > 0) {
			digit = num%10;
			sum = sum+ digit;
			num= num/10;
			
		}
		//System.out.println(sum);
		int sum1, sum2=0;
		while(sum >0) {
			sum1 = sum%10;
			sum2= sum2+ sum1;
			sum= sum/10;
			
		}
		if(sum2 ==1) {
			System.out.println("ITS AN UNO");
		} else {
			System.out.println("NOT AN UNO");
		}
		
		//reverse the vowels
		String vowels = "leetcode";
		
		char [] ch = vowels.toCharArray(); //convert it to array
		
		
		int right = 0; //right side should be incremented
		int left = vowels.length() -1; //it should get decremented
		
		ArrayList<Character> arr= new ArrayList<>();
		
		arr.add('a'); arr.add('e'); arr.add('i'); arr.add('o'); arr.add('u'); //store the vowels
		
		while( right < left) { //   
			
			if(!arr.contains(ch[right])) {
				right++;   
				//continue;
			}
			if(!arr.contains(ch[left])) {
				left --;   
				//continue;
			}
			//swap vowels in the given string.
			char i = ch[right];
			ch[right] = ch[left];
			ch[left]= i;   
			
			right ++; left --;
			}
		System.out.println(ch);  
		
		List<Integer> t1= new ArrayList<>();
		
		t1.add(1); t1.add(2); t1.add(7); t1.add(8);
		
List<Integer> t2= new ArrayList<>();
		
		t2.add(4); t2.add(5); t2.add(7); t2.add(9);
		
	List<Integer> t3=	t1.stream().filter(e -> !t2.contains(e)).collect(Collectors.toList());
System.out.println(t3);

//five digit any number

	Random ran = new Random();
	ran.ints().limit(5).forEach(System.out :: println);
	}

	
}
