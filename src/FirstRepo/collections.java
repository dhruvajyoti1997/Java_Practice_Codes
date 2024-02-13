package FirstRepo;
import java.util.*;
public class collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Converting array to linkedlist or arraylist.
		
		String [] arr= {"A","B","C","D","E","E"};
		String arr1 = arr.toString();
		//System.out.println("before conversion--->"+arr1);
		List<String> arraylist = Arrays.asList(arr);
		LinkedList<String> Lks = new LinkedList<>(arraylist);
		System.out.println(Lks);
		//List<String> list1= new ArrayList<>(arraylist);
		Set<String> list1= new HashSet<>(arraylist);
		System.out.println("after conversion--->"+list1);
		

			//String li=list1.get(0);
		//	System.out.println(li);
	}

}
