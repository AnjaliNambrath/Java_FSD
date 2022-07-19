package Practice9;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args){
    	System.out.println("Single Dimentional Array\n");
    	int a[]= {10,20,30,40,50};
    	for(int i=0;i<5;i++) {
    	System.out.println("Elements of array a: "+a[i]);
    	}
    	System.out.println("Multi Dimentional Array\n");
    	int[][] b = {
                {2, 4, 6, 8}, 
                {3, 6, 9} };
          
        System.out.println("Length of row 1: " + b[0].length);
        System.out.println("Array Operation Example:\n");
        System.out.println("Enter no of Elements:");
       int n;
       Scanner in = new Scanner(System.in);
       n = in.nextInt();
       int ar[] = new int[n];
       System.out.println("Enter Elements:\n");
       for(int i=0;i<n;i++){
           ar[i]=in.nextInt();
       }
       int sum=0;
       for(int i=0;i<n;i++){
           sum=sum+ar[i];
       }
       System.out.println("Sum is"+sum);
    }
}
