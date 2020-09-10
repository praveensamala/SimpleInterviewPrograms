package com.training.interviewprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NumberOfDuplicateWordsInString {
	public static void main (String xargs[]) {
		duplicateWordsCount("testing the duplicate the string counts in the entire string");
		duplicateWordsCount("again again again testing 123 literal string");
	}
	
	public static void duplicateWordsCount(String text){
		String words[] = text.split(" ");
		Map<String, Integer> wordscount = new HashMap<String, Integer>();
		
		for (String word:words) {
			if (wordscount.containsKey(word.trim())) {
				wordscount.put(word.trim(), wordscount.get(word)+1);
			}
			else {
				wordscount.put(word.trim(), 1);
			}
		}
		
		Set<String> wordslist = wordscount.keySet();
		for (String word: wordslist) {
			System.out.println(word + " : "+wordscount.get(word));
		}
		System.out.println("-----");
	}
}
