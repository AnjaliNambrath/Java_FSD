package Practice3;

public class MethodOverload {
	 
    static int sum(int x, int y) {
        return x + y;
    }
 
    static double sum(double x, double y) {
        return x + y;
    }
 
    public static void main(String[] args) {
        int int_sum = sum(22, 20);
        double double_sum = sum(6.7,10.2);
 
        System.out.println("int: " + int_sum);
        System.out.println("double: " + double_sum);
    }
 
}
