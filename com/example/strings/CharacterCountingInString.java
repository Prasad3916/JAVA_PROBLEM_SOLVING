package com.example.strings;

public class CharacterCountingInString {
	
	static void characterCountingInString(String s) {
		String str="";
		
		boolean visited[]=new boolean[s.length()];
		for(int i=0;i<s.length();i++) {
			int count=0;
			if(!visited[i]) {
				 count=1;
				for(int j=i+1;j<s.length();j++) {
					if(s.charAt(i)==s.charAt(j)) {
						count++;
						visited[j]=true;
					}
				}
			}
			if(!visited[i]) {
				str=str+s.charAt(i)+count;
			}
		}
		System.out.println(str);
	}
	public static void main(String[] args) {
		characterCountingInString("AAABBCCC");
	}

}
