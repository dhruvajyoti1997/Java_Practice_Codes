package FirstRepo;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//count the sum in an array having sum 0;
		int[] arr = { 1, 3, 2, -1, 5, 4, -8, 4, 3, -7 };

		int count = 0;

		int arrLen = arr.length;

		for (int i = 0; i < arrLen; i++) {

			int sum = 0;
			for (int j = i + 1; j < arrLen; j++) {

				sum = sum + arr[j];

				if (sum == 0) {
					count++;
				}

			}

		}
 System.out.println(count);
		
		
		//
		
		String str = "here is my keyword";
		
		String search = "here";
		char a= 'e';
			
			if(str.toLowerCase().contains(search.toLowerCase())) {
				
				System.out.println("String found at");
			} else {
				System.out.println("Not Found");
			}
			
			for(int ii=0; ii < str.length(); ii++) {
				
				char ch = str.charAt(ii);
				if(a == ch) {
				System.out.println("presents");	
				break;
				}
			}
		}
	}


