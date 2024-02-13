package FirstRepo;


public class Singleton {
public static void main(String[] args) {
//as we know singleton means we can only only one object of the class
	
	kingSingleton king = kingSingleton.getInstance(); //it is a static method so we need call via classname.methodname
	kingSingleton king1 = kingSingleton.getInstance();
	kingSingleton king2 = kingSingleton.getInstance();
	
	//lets check the hashcode of the object created . if its same the its singleton
	
	System.out.println(king1.hashCode());
	System.out.println("========111=============");
	System.out.println(king.hashCode());
	System.out.println("========222=============");
	System.out.println(king2.hashCode());
	
	//Output is same 883049899
//	========111=============
//			883049899
//			========222=============
//			883049899

}
}
