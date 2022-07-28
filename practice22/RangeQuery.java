package practice22;

import java.util.*;
public class RangeQuery
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int n=in.nextInt();
		int a[]= new int[n];
		System.out.println(("Enter elements:"));
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		System.out.println("Enter the starting range:");
		int L=in.nextInt();
		System.out.println("Enter the ending range:");
		int R=in.nextInt();
		int sum=0;
		for(int i=L;i<=R;i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum of Range:"+sum);
		
	}
}
