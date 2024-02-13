package SecondRepo;


class overLoadingTest{
	
	public void method1() {
		System.out.println("method1");
	}
	
	public void method2() {
		System.out.println("method2");
	}
	
}

class child extends overLoadingTest {
	
	public void method1() {
		System.out.println("method1-child");
	}
	
	public void method3() {
		System.out.println("method3 - child");
	}
}
public class parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		overLoadingTest c = new child();
	c.method1(); c.method2();	
	
	child s = new child();
	s.method1(); s.method2(); s.method3();
	}
}
