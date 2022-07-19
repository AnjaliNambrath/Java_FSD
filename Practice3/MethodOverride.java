package Practice3;

class A {
	   public void disp() {
	      System.out.println("This is Class A");
	   }
	}

	class B extends A {
	   @Override
	   public void disp() {
	      System.out.println("This is Class B");
	   }
	}

	class MethodOverride {
	   public static void main(String[] args) {
	      B d1 = new B();
	      d1.disp();
	   }
	}
