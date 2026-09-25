package com.gut.day5;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroesToEnd {

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
		int p2 = 0;
		while(p1 < n && p2 < n)
		{
		while(p1 < n)
		{
			if(arr[p1] == 0)
			{
				break;
			}
			p1++;
		}
		p2 = p1;
		while(p2 < n)
		{
			if(arr[p2] != 0)
			{
				int temp = arr[p1];
				arr[p1] = arr[p2];
				arr[p2] = temp;
				p1++;
				break;
			}
			p2++;
		}
		}
		System.out.println(Arrays.toString(arr));
	}

}
