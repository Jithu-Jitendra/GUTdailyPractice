package com.gut.day6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIsSortedOrNot {

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
		
		boolean found = true;
		for(int i = 0; i < n-1; i++)
		{
			if(arr[i] > arr[i+1])
			{
				found = false;
			}
		}
		System.out.println(found);
	}

}
