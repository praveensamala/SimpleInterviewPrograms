package com.training.interviewprograms;

public class StringAnagram
{
	public static void main(String args[]) 
	{	
		String text1 = "ABC";
		String text2 = "XCB";
		boolean angram = true;
		
		for (int i=0; i<text1.length(); i++) {
			Character x = text1.charAt(i);
			int counter1 = 0;
			int counter2 = 0;
			
			for (int j=0; j<text1.length(); j++) {
				if (x.equals(text1.charAt(j))) {
					counter1++;
				}
			}
			
			for (int k=0; k<text2.length(); k++) {
				if (x.equals(text2.charAt(k))) {
					counter2++;
				}
			}
			
			if (counter1 != counter2) {
				angram = false;
			}
			
			if (!angram) {
				break;
			}
		}
		
		if (angram) {
			System.out.println("given strings are anagram");
		}
		else {
			System.out.println("given strings are not anagram");
		}
	}
}
