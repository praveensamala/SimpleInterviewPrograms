package com.training.interviewprograms;

import java.util.Arrays;

public class BubbleSortingWithoutTempVariable
{
	public static void main(String args[]) {
		int values[] = {1,3,2,5,4};
		System.out.println("before : "+Arrays.toString(values));
		values = bubbleSort(values);
		System.out.println("after  : "+Arrays.toString(values));
	}
	
	public static int[] bubbleSort(int values[]) {
		for (int i=0; i<values.length; i++) {
			for (int j=0; j<values.length-1-i; j++) {
				if (values[j] > values[j+1]) {
					values[j] = values[j] + values[j+1];
					values[j+1] = values[j] - values[j+1];
					values[j] = values[j] - values[j+1];
				}
			}
		}
		return values;
	}
}
