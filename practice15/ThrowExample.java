package practice15;
public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=5;
		try {
			if(a>b) {
				//throw new Exception();					//throw exception
				throw new Exception("a>b");					//throw with custom message
				//throw new ArithmeticException();			//throw pre-defined
				//throw new ArithmeticException("a>b");		//pre-defined with custom msg.
			}
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
