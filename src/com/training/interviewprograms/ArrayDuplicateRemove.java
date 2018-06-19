package com.training.interviewprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicateRemove
{
	public static void main(String args[]) {

		//one way of eliminating duplicates is using the sets
		Integer arr1[] = {1,2,2,2,2,2,2,2,2,3,4,4,5};
		Set<Integer> arr2 = new HashSet<Integer>();
		
		for (int i=0; i<arr1.length; i++) {
			arr2.add(arr1[i]);
		}
		for (Integer i:arr2) {
			System.out.print(i+",");
		}
		System.out.println();
		
		//other way of eliminating duplicates is to do it manually
		int arr3[] = {1,2,2,2,2,2,2,2,2,3,4,4,5};
		
		Arrays.sort(arr3);
		int n = removeduplicates(arr3);
		
		for (int i=0; i<n; i++) {
			System.out.print(arr3[i]+",");
		}
	}
	
	//removing duplicate elements using temp array
	public static int removeduplicates(int arr[])
	{
		int n = arr.length;
		if (n==0 || n==1) {
			return n;
		}
		
		int temp[] = new int[n];
		int j=0;
		
		for (int i=0; i<n-1; i++) {
			if (arr[i] != arr[i+1]) {
				temp[j]=arr[i];
				j++;
			}
		}
		
		//temp[j] = arr[n-1];
		//j++;
		
		for (int i=0; i<j; i++) {
			arr[i] = temp[i];
		}
		
		return j;
	}
}
