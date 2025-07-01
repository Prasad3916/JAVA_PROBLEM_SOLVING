package com.example.strings;

public class SubString {
	
	
	static void subString1(String s) {
		StringBuilder sb=new StringBuilder(s);
		for(int i=0;i<sb.length();i++) {
			for(int j=i;j<sb.length();j++) {
				System.out.println(sb.substring(i, j+1));
			}
		}
	}
	static void subString2(String s) {
		StringBuilder sb=new StringBuilder(s);
		for(int i=0;i<sb.length();i++) {
			for(int j=i;j<sb.length();j++) {
				 String str=sb.substring(i, j+1);
				 if(str.length()==4) {
					 System.out.println(str);
				 }
			}
		}
	}

	public static void main(String[] args) {
		subString1("ABCDEFGH");
		System.out.println("*********************");
		subString2("ABCDEFGH");
	}

}
