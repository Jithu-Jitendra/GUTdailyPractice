package com.gut.day3;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

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
		
		for(int i = 1; i < n; i++)
		{
			int temp = arr[i];
			int j = i-1;
			while(j >= 0 && temp < arr[j])
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
//			for(j = i-1; j >= 0; j--)
//			{
//				if(temp < arr[j])
//				{
//					arr[j+1] = arr[j];
//				}
//				else
//				{
//					break;
//				}
//			}
//			arr[j+1] = temp;
//		}
		System.out.println(Arrays.toString(arr));

	}

}
