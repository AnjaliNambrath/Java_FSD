package practice16;

  
class MyException  extends Exception  
{  
	public MyException() {
		
	}
	public MyException (String str)  
	{    
		super(str);  
	}  
}  
 
public class ExceptionHandling  
{  

 static void validate (int age) throws MyException{    
    if(age < 18){    
     throw new MyException("Age is not valid");  // throw an object of user defined exception   
 }  
    else {   
     System.out.println("Valid age");   
     }   
  }    
  
 public static void main(String args[])  
 {  
     try  
     {   
         validate(15);  
     }  
     catch (MyException e)  
     {  
         System.out.println("Caught the exception");  
  
         System.out.println("Exception occured: " + e);  
     }finally {
    	 System.out.println("Finally Block!!!");
     }

     System.out.println("Normal Statement");    
 }  
}  