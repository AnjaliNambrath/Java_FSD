package practice32;

import java.util.Scanner;

public class SelectionSort {

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
			int min_index=i;
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[min_index]) {
					min_index=j;
				}
			}
			int t=a[min_index];
			a[min_index]=a[i];
			a[i]=t;
		}
		System.out.println("\nAfter Sorting\n");
		for(int x=0;x<n;x++) {
			System.out.print(a[x]+" ");
		}
	}

}
