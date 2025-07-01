package com.example.strings;
public class LongestPrefix {
	static void longestPrefix(String s[]) {
		String shortest=s[0];
		for(String ele:s) {
			if(shortest.length()>ele.length()) {
				shortest=ele;
			}
		}
		int len=shortest.length();
		int i=0;
		String prefix="";
		for(String ele:s) {
			if(i<len) {
				if(shortest.charAt(i)==ele.charAt(i)) {
					prefix+=shortest.charAt(i);
					i++;
				}
				else {
					break;
				}
			}
		}
		if(prefix.length()!=0) {
			System.out.println(prefix);
		}
		else {
			System.out.println("Bhavani Prasad");
		}
	}
	public static void main(String[] args) {
		String str[]= {"0flower","flow","flo","flood","flooook"};
		longestPrefix(str);
	}

}
