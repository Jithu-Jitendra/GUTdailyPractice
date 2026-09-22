package com.gut.day2;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void swap(int arr[],int i,int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
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
		
		for(int i = 0; i < n-1; i++)
		{
			int min = i;
			for(int j = i+1; j < n; j++)
			{
				if(arr[min]> arr[j])
				{
					min = j;
				}
			}
			swap(arr,i,min);
		}
		System.out.println(Arrays.toString(arr));

	}


}
