package Practice18;
class Car{
	public void speed() {
		System.out.println("60km/hr");
	}
}
class Innova extends Car{
	public void speed() {
		System.out.println("70km/hr");
	}
	public void color(){
		System.out.println("Black");
	}
}
class Maruthi extends Car{
	public void color() {
		System.out.println("White");
	}
}
class BMW extends Car{
	public void speed() {
		super.speed();
	}
	public void color() {
		System.out.println("Blue");
	}
	
}
public class RuntimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Innova ob1 = new Innova();
		ob1.speed();
		ob1.color();
		Maruthi ob2 = new Maruthi();
		ob2.speed();
		ob2.color();
		BMW ob3 = new BMW();
		ob3.speed();
		ob3.color();

	}

}
