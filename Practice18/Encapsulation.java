package Practice18;
class Empl{
	private int id;
	private String name;
	private float salary;
	public void display(int id,String name,float salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public void displayinfo() {
		System.out.println("id is:"+id);
		System.out.println("name is:"+name);
		System.out.println("salary is:"+salary);
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empl emp = new Empl();
		emp.display(01,"Arun",50000);
		emp.displayinfo();
		

	}

}
