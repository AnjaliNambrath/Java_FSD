package Project1;

import java.util.*;
class Calc{
	int a,b;
	Calc(int num1,int num2){
		this.a=num1;
		this.b=num2;		
	}
	int add() {
		return (a+b);
	}
	int sub() {
		return (a-b);
	}
	int mul() {
		return (a*b);
	}
	float div() {
		return (a/b);
	}
}
public class Calculator{
	public static void main(String[] args) {
		System.out.println("WELCOME TO SIMPLE CALCULATOR\n");
		while(true) {
		int a,b,choice;
		float result=0;

        Scanner buf=new Scanner(System.in); 
         
        System.out.print("Enter first number: ");
        a=buf.nextInt();
        System.out.print("Enter second number: ");
        b=buf.nextInt();
        
        System.out.print("\n1: Addition.\n2: Subtraction.");
        System.out.print("\n3: Multiplication.\n4: Divide.");
        System.out.print("\n5: Exit.");
         
        System.out.print("\nEnter your choice: ");
        choice=buf.nextInt();
        Calc ob = new Calc(a,b);
        
        switch(choice)
        {
            case 1:
                result=ob.add(); break;
            case 2:
                result=ob.sub(); break;
            case 3:
                result=ob.mul(); break;
            case 4:
                result=ob.div(); break;
            case 5:
            	System.out.println("Exited!!!");
            	break;
            default:
                System.out.println("An Invalid Choice!!!\n");
        }
        if(choice>=1 && choice<=4) {
            System.out.println("Result is: " + result);
        }
        else {
        	break;
        }
        
		}
	}
}

