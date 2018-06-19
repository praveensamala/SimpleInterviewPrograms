package com.training.interviewprograms;

import java.util.Arrays;

public class BubbleSorting
{
	public void bubblesorting(int values[]) {
		int i, j, temp = 0;
		int size = values.length;
		for (i=0; i<size; i++) {
			for (j=0; j<size-i-1; j++) {
				if (values[j] > values [j+1]) {
					temp = values[j];
					values[j] = values[j+1];
					values[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String args[]) {
		BubbleSorting bs = new BubbleSorting();
		int values[] = {9,1,2,1,0,8};
		//int values[] = {64, 34, 25, 12, 22, 11, 90};
		
		System.out.println(Arrays.toString(values));
		bs.bubblesorting(values);
		System.out.println(Arrays.toString(values));
	}
}
