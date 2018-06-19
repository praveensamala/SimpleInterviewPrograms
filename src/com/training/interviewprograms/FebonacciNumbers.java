package com.training.interviewprograms;

public class FebonacciNumbers
{
	public static int fibnums(int n) {
		if (n<=1) {
			return n;
		}
		else {
			return fibnums(n-1) + fibnums(n-2);
		}
	}
	
	public static void main(String args[])
	{	
		System.out.println("Febonacci number : "+fibnums(6));
	}
}
