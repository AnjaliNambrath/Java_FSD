package practice15;

class MyException extends Exception{
	MyException(){
		
	}
	MyException(String msg){
		super(msg);
	}
}
public class CustomExceptionExp{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=5;
		try {
			if(a>b) {
				//throw new MyException();//custom exception
				throw new MyException("a>b");//custom exception with custom message
			}
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}