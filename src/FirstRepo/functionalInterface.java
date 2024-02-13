package FirstRepo;

public class functionalInterface {

	@FunctionalInterface
	interface calculate{
		public int sum(int x);
		
		 default void show() {
			System.out.println("here it is");
			//return 0;
		}
	}
	
	public static void main(String[] args) {
		int num = 10;
		 calculate c = (int x) -> x+x;
		 
		int res= c.sum(num); 
		 c.show();
		System.out.println(res +" ");
	}
}
