package com.vivek.algorithms.sorting;

import com.vivek.SampleInput;
import com.vivek.Time;

public class RecursiveBubbleSort
{

	public void recursiveBubbleSorting(int arr[], int n)
	{
			if(n == 1)
				return;
			
			for(int j=0; j<n-1; j++)
			{
				//Print the status of the elements after each iteration
				for(int k=0; k< arr.length; k++)
					System.out.print(arr[k]+" ");
				
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
				System.out.println();
				recursiveBubbleSorting(arr, n-1);
			}
		}
	public static void main(String args[])
	{
		Time t = new Time();
		long s = t.startTime();
		RecursiveBubbleSort bs = new RecursiveBubbleSort();
		SampleInput si = new SampleInput();
		bs.recursiveBubbleSorting(si.getInput(), si.getInput().length);
		long e = t.endTime();
		System.out.println("\nTime taken for the program to execute: "+(e - s)+" milliseconds");
	}

}
