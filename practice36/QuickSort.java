package practice36;

import java.util.Scanner;

public class QuickSort {
	public static void quickSort(int[] arr, int low, int high)
	{
	    if (low < high) 
	    {
	        int pi = partition(arr, low, high);
	        quickSort(arr, low, pi - 1);
	        quickSort(arr, pi + 1, high);
	    }
	}
	
	static int partition(int[] arr, int low, int high)
	{

	    int pivot = arr[high]; 
	
	    int i = (low - 1); 
	  
	    for(int j = low; j <= high - 1; j++)
	    {
	        if (arr[j] < pivot) 
	        {
	            i++; 
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }
	    }
	    int temp = arr[i+1];
	    arr[i+1] = arr[high];
	    arr[high] = temp;
	    return (i + 1);
	}

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
		quickSort(a, 0, n - 1);
		System.out.println("\nAfter Sorting\n");
		for(int x=0;x<n;x++) {
			System.out.print(a[x]+" ");
		}
	}

}
