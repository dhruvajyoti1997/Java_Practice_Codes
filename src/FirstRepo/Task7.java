package FirstRepo;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="DHRUVA";
char[] ch= s1.toCharArray();

for(char c : ch){
	
	System.out.println(c +"\t");
}


  String A = "hello"; String B = "java"; // Print Captial Letter of a first   letter
char[] a = A.toCharArray(); 
 String C = A.substring(0, 1).toUpperCase()+ A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1);
 
 System.out.println(C);
 
 for(int i= a.length -1; i >=0 ; i--) {
	 System.out.println(a[i]);
 }
 
	}

}
