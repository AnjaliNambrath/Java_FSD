package Project2;
import java.util.*;
public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("EMAIL VALIDATION\n");
		ArrayList<String> email = new ArrayList<String>();
		email.add("arun@xyz.com");
		email.add("raju@xyz.com");
		email.add("priya@xyz.com");
		email.add("sethu@xyz.com");
		email.add("sree@xyz.com");
		email.add("ramu@xyz.com");
		email.add("akhil@xyz.com");
		System.out.println("Enter the EmailID to be Searched:\n");
		String search=null;
		Scanner in = new Scanner(System.in);
		search=in.nextLine();
		if (email.contains(search)){
			System.out.println("Email Found");
		}
		else {
			System.out.println("Email Not Found");
		}
		
	}

}
