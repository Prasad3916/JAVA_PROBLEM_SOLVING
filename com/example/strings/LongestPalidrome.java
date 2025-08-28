package com.example.strings;
import java.util.ArrayList;
public class LongestPalidrome {
	static void longestPalidrome() {
		ArrayList<String> arrayList = new ArrayList<>();
		StringBuilder s=new StringBuilder("baygjhhbad");
		for (int i = 0; i < s.length(); i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					int start=i;
					int end=j;
					String str="";
					for(int k=start;k<=end;k++) {
						str=str+s.charAt(k);
					}
					arrayList.add(str);
				}
			}
		}
		System.out.println(arrayList);
		int max=arrayList.get(0).length(),num;
		for(int x=0;x<arrayList.size()-1;x++) {
			if(max<arrayList.get(x+1).length()) {
				max=arrayList.get(x+1).length();
			}
		}
		num=max;
		arrayList.forEach(e->{
			if(e.length()==num) {
				System.out.println(e);
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		longestPalidrome();
	}
}






