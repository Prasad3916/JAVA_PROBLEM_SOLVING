package com.example.strings;

public class LongestPalidrome2 {
	
	
	boolean validPalidrome(StringBuilder s) {
	
	return s.toString().equals(s.reverse().toString());
	
	}

	void checkPalidrome() {
		
		StringBuilder s=new StringBuilder("abababs");
		
		StringBuilder longestPalidrome=new StringBuilder(s.charAt(0));
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				
				StringBuilder sub=new StringBuilder(s.substring(i,j+1));
				
				if(validPalidrome(sub) && longestPalidrome.length()<sub.length()) {
					longestPalidrome=sub;
				}
				
				
			}
			
		}
		System.out.println(longestPalidrome);
		
	}

	public static void main(String[] args) {
		new LongestPalidrome2().checkPalidrome();
	}
}

