package Practice4;

import java.util.Scanner;

class Stud{
	int rollno;
	String name;
	public Stud(int rollno,String name) {
		this.rollno=rollno;
		this.name=name;
	}
	public void show() {
		System.out.println(rollno+" "+name);
	}
}
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		for(int i=0;i<2;i++) {
		System.out.println("enter roll no");
		int r=in.nextInt();
		in.nextLine();
		System.out.println("enter name");
		String str=in.nextLine();
		Stud a =new Stud(r,str);
		a.show();
		}

	}

}
