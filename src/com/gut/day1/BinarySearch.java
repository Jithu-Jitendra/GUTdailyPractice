package com.gut.day1;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static int BS(int arr[],int target)
	{
		int low = 0;
		int high = arr.length-1;
		while(low <= high)
		{
			int mid = (low+(high-low)/2);
			if(arr[mid] == target)
			{
				return mid;
			}
			else if(arr[mid] < target)
			{
				low = mid+1;
			}
			else
			{
				high = mid-1;
			}
		}
		return -1;
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
		Arrays.sort(arr);
		System.out.println("enter the element you want to search for :");
		int k = sc.nextInt();
		int ans = BS(arr,k);
		System.out.println(ans);
		

	}

}
