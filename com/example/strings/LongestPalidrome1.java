package com.example.strings;
public class LongestPalidrome1 {
	static boolean validPalidrome(StringBuilder s) {
		
		return s.toString().equals(s.reverse().toString());	
	} 
	static void checkPalidrome() {
		StringBuilder s=new StringBuilder("abababs");
		StringBuilder longestPalidrome=new StringBuilder(s.toString().charAt(0)+"");
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				
				StringBuilder sub=new StringBuilder((s.substring(i,j+1)));	
//				System.out.println(sub+" "+i+" "+j);	
				if(validPalidrome(sub) && sub.length()>longestPalidrome.length()) {
					longestPalidrome=sub;
				}
			}	
		}	
		System.out.println(longestPalidrome);	
	}
	public static void main(String[] args) {
		checkPalidrome();
	}
}