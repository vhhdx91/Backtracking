package com.vivek.algorithms.sorting;

import com.vivek.SampleInput;
import com.vivek.Time;

public class BubbleSort 
{
	public void bubbleSorting(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length-i-1; j++)
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
			}
		}
	}
	
	public static void main(String args[])
	{
		Time t = new Time();
		long s = t.startTime();
		BubbleSort bs = new BubbleSort();
		SampleInput si = new SampleInput();
		bs.bubbleSorting(si.getInput());
		long e = t.endTime();
		System.out.println("\nTime taken for the program to execute: "+(e - s)+" milliseconds");
	}
}
