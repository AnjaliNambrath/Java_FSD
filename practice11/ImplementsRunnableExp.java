package practice11;

class X implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("i:"+i);
		}
	}
}
class Y implements Runnable{
	public void run() {
		for(int j=0;j<10;j++) {
			System.out.println("j:"+j);
		}

		
	}
}
public class ImplementsRunnableExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X ob1 = new X();
		Y ob2 = new Y();
		Thread t1 = new Thread(ob1);	//it will create the thread class reference.
		Thread t2 = new Thread(ob2);
		t1.start();
		t2.start();
	}

}

