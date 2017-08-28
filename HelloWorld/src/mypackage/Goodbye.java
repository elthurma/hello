package mypackage;

public class Goodbye extends Hello {
	public void hello() {
		System.out.println("in GoodbyHello");
		
	}
public static void main(String args[]) {
	System.out.println("in main");
	Hello gb1 = new Hello();
	gb1.hello();
	System.out.println("yeahyeahyah");
	
}
}
