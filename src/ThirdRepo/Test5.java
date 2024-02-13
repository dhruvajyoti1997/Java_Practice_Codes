package ThirdRepo;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(10); li.add(20) ; li.add(30) ;  li.add(24) ;  li.add(25) ; li.add(246) ; li.add(346) ;  li.add(324) ; li.add(248) ; 
		
	int num[] = {1,4,6,3,2,5} ; 
//int sum= 0; 
	int temp=0;
	for(int i=0; i < num.length; i++) {
		for(int j=i+1; j < num.length; j++) {
			if(num[i] > num[j]) {
				temp= num[i];
				num[i] = num[j];
				num[j]= temp;
			}
			
			
		}
//		if(num[i] <30) {
//			sum = (int) Math.floor(num[i]/10);
//			System.out.println(sum);
//		} else if(num[i] < 300) {
//			sum = (int) Math.floor(num[i]/10);
//			System.out.println(sum);
//		}else if(num[i] < 3000) {
//			sum = (int) Math.floor(num[i]/10);
//			System.out.println(sum);
//		}
//		
		
	}
		System.out.println(num[num.length -1]);
		
//		for(int i=0; i< num.length; i++) {
//			for(int j =i; j< num.length;j++) {
//				for(int k=i ; k<=j; k++) {
//					System.out.println("sub arrays--> "+num[k]);
//				}
//				//
//			}
//		}
//		
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("sa"); ts.add("ka"); ts.add("da");
		char a = 0, b=0,c=0, d=0;
		TreeSet<String> ts1 = new TreeSet<String>();
		TreeSet<String> ts2 = new TreeSet<String>();
		TreeSet<String> ts3 = new TreeSet<String>();
	Iterator<String> it = ts.iterator();
	while(it.hasNext()) {
		String str = it.next();
		char st=str.charAt(0);
		//System.out.println(st);
		if(st < a) {
			ts1.add(str);
		} 
		if(st >= b) {
			ts2.add(str);
		} 
		if(st >= c && st < d) {
			ts3.add(str);
		}
	}
    System.out.println(ts1);
    System.out.println(ts2);
    System.out.println(ts3);
	}

}
