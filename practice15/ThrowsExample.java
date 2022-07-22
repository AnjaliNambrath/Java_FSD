package practice15;

public class ThrowsExample {
	static void display1() throws Exception{	//exception is thrown by the function while the execution of the code.
		//try {
		int a=10/0;
		//}catch(Exception e) {}
		System.out.println("display1 method");
	}
	static void display2(){	
		try {
		display1();
		}catch(Exception e) {}
		System.out.println("display2 method");
	}
	public static void main(String args[]) {
		display2();
		System.out.println("The main method");
	}
}
