package Practice18;
class A{
	public void disp() {
		System.out.println("This is class A method");
	}
}
class B{
	public void msg() {
		System.out.println("This is class B method");
	}
	public void disp() {
		System.out.println("This is Overriden method of class A on class B");
	}
}
public class ClassObjectExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		obj.disp();
		B obj1 = new B();
		obj1.msg();
		obj1.disp();
	}

}
