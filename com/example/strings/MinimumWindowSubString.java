package com.example.strings;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumWindowSubString {
	
	
	void minimumWindowSubString() {
		
		String s="ADOBECODEBANC";
		String t="ABC";
		char[] ca = t.toCharArray();
		ArrayList<Character> arrayList = new ArrayList<>();
		for(char ele:ca) {
			arrayList.add(ele);
		}
			
			arrayList.forEach((e)->{
				String minWindow="";
				for (int i = 0; i < s.length(); i++) {

					if(e==s.charAt(i)) {
							
						for (int j = i; j < ca.length; j++) {
							
							minWindow=s.charAt(j)+"";
							
							arrayList.forEach((e1)->{
								
						
								
							});
							
							
							
							
						}
						
					}
					
				}
			});
			
			
			
		
		
		
	}

	public static void main(String[] args) {
		
		
	}
}
