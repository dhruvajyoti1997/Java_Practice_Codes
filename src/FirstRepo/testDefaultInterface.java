package FirstRepo;

@FunctionalInterface
public interface testDefaultInterface {

	void m1();
	
	default void m2() {
		System.out.println("M2");
		m3();
		
	}
	
	static void m3() {
		System.out.println("static declared");
	}
}


