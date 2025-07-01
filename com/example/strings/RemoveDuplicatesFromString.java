package com.example.strings;
import java.util.Scanner;
public class RemoveDuplicatesFromString {
	public static void main(String[] args) {
		System.out.println("Enter String To Remove Duplicate Characters");
		Scanner  sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					ch[j]='\0';
				}
			}
		}
		String newstr=new String(ch).replace(" ", "");
		System.out.println(newstr);
	}
}
