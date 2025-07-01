package com.example.strings;

public class LongestPalidromoeOptimum {
	 static String  validPalidrome(String s,int left,int right) {
		while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
				left-=1;
				right+=1;				
		}
		return s.substring(left+1,right);
	}
	static void checkPalidrome(String s) {
		String longestPalidrome=s.charAt(0)+"";
		for(int i=0;i<s.length();i++) {
			String odd=validPalidrome(s,i,i);
			String even=validPalidrome(s,i,i+1);
			
			if(odd.length()>longestPalidrome.length()) {
				
				longestPalidrome=odd;
				
			}
			if(even.length()>longestPalidrome.length()) {
				
				longestPalidrome=even;
				
			}
			
			
		}
		System.out.println(longestPalidrome);
		
	}

	
	public static void main(String[] args) {
		
		checkPalidrome("geeksskeeg");
		
	}
}
