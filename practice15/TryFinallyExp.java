package practice15;

public class TryFinallyExp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hai");
		int abc[]= {0,10,11};
		try {
			int res=100/abc[8];						//ArrayIndexOutOfBoundsException
			System.out.println("No Exception"+res);
			//int res1 =100/0;						//ArithmeticException
			}catch(ArithmeticException e) {
				System.out.println("Took care of Exception"+e);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Took care of Exception"+e);
			}finally {
				System.out.println("Finally Block");
			}
			System.out.println("Bye");
	}
}
