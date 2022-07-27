package practice34;

import java.util.Scanner;

public class InsertionSort {

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
		for(int i=1;i<n;i++) {
			int key = a[i];
			int j=i-1;
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=key;
		}
		System.out.println("\nAfter Sorting\n");
		for(int x=0;x<n;x++) {
			System.out.print(a[x]+" ");
		}
	}

}
