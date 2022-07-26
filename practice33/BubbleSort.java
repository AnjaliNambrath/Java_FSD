package practice33;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int n=in.nextInt();
		int a[]= new int[n];
		System.out.println(("Enter elements:"));
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		System.out.println("Before Sorting\n");
		for(int x=0;x<n;x++) {
			System.out.print(a[x]+" ");
		}
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		System.out.println("\nAfter Sorting\n");
		for(int x=0;x<n;x++) {
			System.out.print(a[x]+" ");
		}
	}

}
