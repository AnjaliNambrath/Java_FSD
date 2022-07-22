package practice19;
interface Abc {
	int A=10;
	void dis1();
}
interface Mno {
	int B=20;
	void dis2();
}
interface Xyz extends Abc,Mno{
	int C=A+B;
	void dis3();
}
class Demo implements Abc,Mno {
		public void dis1() {
			System.out.println("This is Abc interface method");
		}
		public void dis2() {
			System.out.println("This is Mno interface method");
		}
		public void dis3() {
			System.out.println("This is Xyz interface method->C:"+Xyz.C);
		}
}
public class DiamondProblem {

	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.dis1();
		obj.dis2();
		obj.dis3();
	}

}

