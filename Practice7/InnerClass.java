package Practice7;
class Outer{
	class Inner{
		public void display() {
			System.out.println("Inside the Inner Class");
		}
	}
}

public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner msg =new Outer().new Inner();
		msg.display();

	}

}
