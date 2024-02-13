package SecondRepo;

import java.util.Scanner;

public class test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	    String  str = "iinesisaequeou";
      String vowels = "aeiou";
      String result="";
      char ch;
      int count , i ,j;
      for( i=0; i< str.length(); i++) {
    	  
    	  ch = str.charAt(i);
    	  count =0;
    	  //System.out.println(ch);
    	  for( j=0; j< vowels.length(); j++) {
    		  
    		  if(ch == vowels.charAt(j)) {
    			  count ++;
    			 
    		  }
    	  }
    	  if(count == 0) {
    		  result = result + ch;
    	  }
    	 
      }
      
     
      System.out.println("\nString without Vowels = " +result);
	}

}
