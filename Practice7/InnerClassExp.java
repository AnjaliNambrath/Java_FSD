package Practice7;

class OuterClass {
	void outerMethod() {
	      int x = 10;
	      System.out.println("inside outerMethod");
	      class Inner {
	         void innerMethod() {
	        	System.out.println("Inside InnerMethod");
	            System.out.println("x= "+x);
	         }
	      }
	      Inner y = new Inner();
	      y.innerMethod();
	   }
	}
	class InnerClassExp {
	   public static void main(String[] args) {
	      OuterClass x=new OuterClass();
	      x.outerMethod();
	   }
}
