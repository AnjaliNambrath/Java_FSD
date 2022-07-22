package practice14;

public class SimpleTryCatchExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		int abc[]= {5,10,11};
		try {
		int res1=100/abc[5];
		System.out.println(res1);
		}catch(Exception e) {
			System.out.println("Took care of Exception"+e);
			//System.out.println(e.toString());
			//System.out.println(e.getMessage());
		}		
		System.out.println("Bye");
	}

}
