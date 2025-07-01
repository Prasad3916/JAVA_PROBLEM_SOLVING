package com.example.strings;
import java.util.Scanner;
public class FirstLetterCapitalInString {
	public static void main(String[] args) {
		System.out.println("Enter string To Capitalize");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(i==0 && Character.isAlphabetic(ch[i])) {
				ch[i]=Character.toUpperCase(ch[i]);
			}
			else if(ch[i]==' ' && Character.isAlphabetic(ch[i+1])){
					ch[i+1]=Character.toUpperCase(ch[i+1]);
			}
	} 
		System.out.println(new String(ch));
		sc.close();
}
}
