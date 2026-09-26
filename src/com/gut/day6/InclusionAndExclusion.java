package com.gut.day6;

import java.util.Arrays;
import java.util.Scanner;

public class InclusionAndExclusion {

//	1. Find the Inclusions and Exclusions of the 1D Array in 2D Array
//	Example:
//	Input:
//	arr = [ [1, 2], [2, 10], [3, 9], [5, 8] ]
//	Output:
//	Inclusion = 0 1 1 0
//	Exclusion = 0 0 1 1
//
//	Explination: 
//	Inclusion = 1  -> Interval is contained in another interval
//	Inclusion = 0  -> Interval is not contained in any other interval
//
//	Exclusion = 1  -> Interval contains at least one other interval
//	Exclusion = 0  -> Interval does not contain any other interval
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int n =  sc.nextInt();
		int arr[][] = new int[n][2];
		for(int i = 0; i < n ; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				System.out.println("enter "+i+""+j+ "th element in an array");
				arr[i][j] = sc.nextInt();
			}
		}
		
		int[] inclusion = new int[n];
		int[] exclusion = new int[n];
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				if(arr[i][0] > arr[j][0] && arr[i][1] < arr[j][1])
				{
					inclusion[i] = 1;
					break;
				}
			}
			
			for(int j = 0; j < arr.length; j++)
			{
				if(arr[i][0] < arr[j][0] && arr[i][1] > arr[j][1])
				{
					exclusion[i] = 1;
					break;
				}
			}
		}
		System.out.println("inclusion : "+Arrays.toString(inclusion));
		System.out.println("exclusion : "+Arrays.toString(exclusion));
	}

}
