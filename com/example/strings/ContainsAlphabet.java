package com.example.strings;

public class ContainsAlphabet {
	
	
	static void containsAlphabet() {
		
		String s="The quick brown fox jumps over the lazy dog".toUpperCase();
		
		boolean flag=true;
//		for (int i = 65; i <=90; i++) {
//			
//			String str=(char)(i+32)+"";
//			
//			if(!s.contains(str) || !s.contains(str)) {
//				
//				flag=false;
//				break;
//				
//			}
//			
//		}
		for (int i = 65; i <=90; i++) {
			
			String str=(char)(i)+"";
			
			if(!s.contains(str)) {
				
				flag=false;
				break;
				
			}
			
		}
		System.out.println(flag);
		
	}

	
	public static void main(String[] args) {
		
		
//		System.out.println((char)66+32);
		
		containsAlphabet();


		
		
		
	}
	
	
	
}
