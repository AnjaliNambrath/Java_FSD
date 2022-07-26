package practice27;

import java.util.Scanner;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		StackService ss = new StackService();
		String data;
		String con="";
		do {
			System.out.println("Stack Operation\n");
			System.out.println("1.PUSH\n2.POP\n3.Size\n");
			System.out.println("Enter the choice\n");
			int key  = obj.nextInt();
			switch (key) {
			case 1:	System.out.println("Enter the data to push in stack");
            		data = obj.next();
            		System.out.println(ss.push(data));
            		break;
			case 2 : System.out.println("Pop the item from a stack");
						System.out.println(ss.pop());
             			break;
			case 3: System.out.println("Size of stack is "+ss.size());
					break;
			default:System.out.println("Wrong choice");
					break;
			}
			System.out.println("Do you want to continue?");
			con = obj.next();
		} while (con.equalsIgnoreCase("y"));
		System.out.println("Thank You");
	}

}

