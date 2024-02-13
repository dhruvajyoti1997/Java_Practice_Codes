package FirstRepo;

public class kingSingleton{
	//Eager Initialization for creating a singleton class or singleton pattern
		private static final  kingSingleton king = new kingSingleton();
		
		public static kingSingleton getInstance() {
			//this method is to create from singleton pattern
			return king;
		}
		
		private kingSingleton() {
			//yes we can create a private constructor , the benefit is we can only create the object inside that class not from outside.
			
		}
		
	
}