package com.gut.day4;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

	public static void divide(int[] arr)
	{
		
		if(arr.length == 1)
		{
			return;
		}
		int leftArr[] = new int[arr.length/2];
		int rightArr[] = new int[arr.length-leftArr.length];
		
		int index = 0;
		
		for(int i = 0;i < leftArr.length; i++)
		{
			leftArr[i] = arr[index++];
		}
		
		for(int j = 0;j  < rightArr.length; j++)
		{
			rightArr[j] = arr[index++];
		}
		
		divide(leftArr);
		divide(rightArr);
		
		merge(arr,leftArr,rightArr);
		
	}
	
	public static void merge(int[] arr,int[] leftArr, int[] rightArr)
	{
		
		int p1 = 0;
		int p2 = 0;
		int index = 0;
		
		while(p1 < leftArr.length && p2 < rightArr.length)
		{
			if(leftArr[p1] < rightArr[p2])
			{
				arr[index++] = leftArr[p1];
				p1++;
			}
			else
			{
				arr[index++] = rightArr[p2];
				p2++;
			}
		}
		
		while(p1 < leftArr.length)
		{
			arr[index++] = leftArr[p1];
			p1++;
		}
		while(p2 < rightArr.length)
		{
			arr[index++] = rightArr[p2];
			p2++;
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
		
		divide(arr);
		System.out.println(Arrays.toString(arr));
	}

}
