package com.gut.day5;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

	public static void swap(int[] arr, int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	public static int partition(int[] arr, int lowerBound, int upperBound)
	{
		
		int pivot = lowerBound;
		int start = lowerBound;
		int end = upperBound;
		while(start < end)
		{
			while(start <= upperBound && arr[start] <= arr[pivot])
			{
				start++;
			}
			while(end >= lowerBound && arr[end] > arr[pivot])
			{
				end--;
			}
			if(start < end)
			{
				swap(arr,start,end);
			}
		}
		
		swap(arr,pivot,end);
		return end;
	}
	public static void quickSort(int[] arr, int lowerBound,int upperBound)
	{
		if(lowerBound < upperBound)
		{
			int loc = partition(arr,lowerBound, upperBound);
			quickSort(arr,lowerBound,loc-1);
			quickSort(arr,loc+1,upperBound);
		}
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int n =  sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n ; i++)
		{
			System.out.println("enter "+i+ "th element in an array");
			arr[i] = sc.nextInt();
		}
		
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
