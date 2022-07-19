package Practice3;

import java.util.Scanner;

public class Method {

	public int addition(int a, int b) {
	    int sum = a + b;
	    // return value
	    return sum;
	  }

	  public static void main(String[] args) {
	    
		  Scanner buf=new Scanner(System.in); 
	         
	        System.out.print("Enter first number: ");
	        int a=buf.nextInt();
	        System.out.print("Enter second number: ");
	        int b=buf.nextInt();

	    // create an object of Main
	    Method obj = new Method();
	    // calling method
	    int result = obj.addition(a, b);
	    System.out.println("Sum : " + result);
	  }

}
