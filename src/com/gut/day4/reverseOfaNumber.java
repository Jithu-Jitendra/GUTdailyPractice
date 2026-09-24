package com.gut.day4;

import java.util.Arrays;
import java.util.Scanner;

public class reverseOfaNumber {

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
		int p1 = 0;
		int p2 = n-1;
		while(p1 < p2)
		{
			arr[p1] = arr[p1]^arr[p2];
			arr[p2] = arr[p1]^arr[p2];
			arr[p1] = arr[p1]^arr[p2];
			p1++;
			p2--;
		}
		System.out.println("Reverse of the Array is : "+Arrays.toString(arr));
	}

}
