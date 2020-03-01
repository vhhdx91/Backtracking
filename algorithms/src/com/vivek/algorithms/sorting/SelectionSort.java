package com.vivek.algorithms.sorting;

import com.vivek.SampleInput;
import com.vivek.Time;

public class SelectionSort 
{
	public void selectionSorting(int arr[])
	{
		for(int i=0; i<arr.length-1; i++)
		{
			int minimumIndex = i;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j] < arr[minimumIndex])
					minimumIndex = j;
			}
					int temp = arr[minimumIndex];
					arr[minimumIndex] = arr[i];
					arr[i] = temp;
				
					//Print the status of the elements after each iteration
					for(int k=0; k< arr.length; k++)
						System.out.print(arr[k]+" ");
					System.out.println();
		}
	}
	
	public static void main(String args[])
	{
		Time t = new Time();
		long s = t.startTime();
		SelectionSort ss = new SelectionSort();
		SampleInput si = new SampleInput();
		ss.selectionSorting(si.getInput());
		long e = t.endTime();
		System.out.println("\nTime taken for the program to execute: "+(e - s)+" milliseconds");
	}

}
