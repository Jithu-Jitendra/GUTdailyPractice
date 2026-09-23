package com.gut.day3;

import java.util.Scanner;
public class FindThirdMaxElement {

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
			int firstMax = arr[0];
			int secondMax = Integer.MIN_VALUE;
			for(int i = 1; i < n; i++)
			{
				if(arr[i] > firstMax)
				{
					secondMax = firstMax;
					firstMax = arr[i];
				}
				else if(arr[i] < firstMax && arr[i] > secondMax)
				{
					secondMax = arr[i];
				}
			}
			
			int thirdMax = Integer.MIN_VALUE;
			for(int i = 0; i < n; i++) {
				if(arr[i] < secondMax && arr[i] > thirdMax)
				{
					 thirdMax = arr[i];
				}
			}
			System.out.println("Third Max is : "+thirdMax);
		}

	}
