package Practice18;
class Employee{
	int salary=50000;
}
class Developer extends Employee{
	int bonus = 7000;
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer dev = new Developer();
		System.out.println("Annual Salary of Developer: "+(dev.bonus+dev.salary));
	}

}
