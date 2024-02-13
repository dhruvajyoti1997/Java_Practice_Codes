package ThirdRepo;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Median of an array
		int sum=8;
		int arr[] = {5,1,3,9,2,6};
		double temp = 0;
		int res=0;
		for(int i=0; i< arr.length; i++) {
			for(int j= i+1; j< arr.length;j++) {
				int mid = arr.length/2;
				if(arr.length%2 ==0) {
					mid =( arr[ mid]+ arr[ (mid -1)]) /2;
					res = mid;
				} 
				
				
			}
		
		
		}
		System.out.println(res);
		
		int arr1[] = {1,2,3,4,7,9};
		int arr2[] = {5,1,3,9,2,6};
		int count =0;
		for(int i=0; i< arr1.length; i++) {
			for(int j=0; j< arr2.length;j++) {
				
				if(arr2[i] <= arr1[i]) {
					count++;
				}
			}
		}
		
		System.out.println(count);
		
		//Word equals with Integer
		String s1 = "geeks4";
		
		String s2 = s1.substring(0,5);
		String s3 = s1.substring(5);
		Integer n1 = Integer.valueOf(s3);
       if(s2.length() == n1) {
    	   
    	   System.out.println("true");
       } else {
    	   System.out.println("false");
       }
       
       //Rotating of an array
       
       int arr4[] = {1, 2, 3, 4, 5, 6, 7};
        
       //check every character are equal or not
       
       String chr = "cdbkdub"; //ggg
       
       char[] chr1 = chr.toCharArray();
       
       for(int i=1; i < chr1.length; i++) {
    	   if(chr1[0] != chr1[i]) {
    		   
    		   System.out.println("each char not are equal");
    		   break;
    	   } else {
    		   
    		   System.out.println("each char  are equal"); 
    		   break;
    	   }
       }
       //substring
       String sum2 = chr.substring(0,6);
       System.out.println(sum2 +"--result");
       
       
	}

}
