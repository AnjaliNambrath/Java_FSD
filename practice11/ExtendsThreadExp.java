package practice11;

class A extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("i:"+i);
		}
	}
}
class B extends Thread{
	public void run() {
		for(int j=0;j<10;j++) {
			System.out.println("j:"+j);
		}

		
	}
}
public class ExtendsThreadExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob1 = new A();
		B ob2 = new B();
		ob1.start();	//ready to run
		ob2.start();	//ready to run
	}

}

