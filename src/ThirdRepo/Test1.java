package ThirdRepo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] num= {1,2,3,4,5};
		
		int target= 4;
		
		for(int i=0; i < num.length;i++) {
			
			if(num[i] == target ) {
				
				System.out.println("index position of 4 is"+i);
			}
		}
		
		Integer [] num1 = {1,1,2};
		List<Integer> list = Arrays.asList(num1);
		List<Integer> res=list.stream().distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(res);
		
		Integer [] num2 = {0,1,0,1,1,1,0,0,1,1,0,0,0};
		
		for(int i=0; i < num2.length;i++)
		{
			for(int j=i+1; j < num2.length; j++) {
				
				int temp=0;
				if(num2[i] > num2[j]) {
					
					temp = num2[i];
					num2[i]= num2[j];
					num2[j]= temp;
				}
			}
			System.out.print(num2[i]);
		}
		
	}

}
