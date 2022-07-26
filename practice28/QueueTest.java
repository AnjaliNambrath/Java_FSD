package practice28;

import java.util.Scanner;

public class QueueTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		QueueOperation qu = new QueueOperation();
		String data;
		String con="";
		do {
			System.out.println("Queue Operation\n");
			System.out.println("1.ADD\n2.REMOVE\n3.Size\n");
			System.out.println("Enter the choice\n");
			int key  = obj.nextInt();
			switch (key) {
			case 1:	System.out.println("Enter the data to add");
            		data = obj.next();
            		System.out.println(qu.addelement(data));
            		break;
			case 2 : System.out.println("Remove the item");
						System.out.println(qu.removeelement());
             			break;
			case 3: System.out.println("Size of queue is "+qu.size());
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
