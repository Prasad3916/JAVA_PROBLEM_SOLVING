package com.example.strings;

import java.util.Scanner;

public class RemovingCharacterFromAString {
	public static void main(String[] args) {
		System.out.println("Enter String To Replace Character : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String newstr="";
		System.out.println("Enter Character To Remove : ");
		char removingchar=sc.next().charAt(0);
		char[]ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==removingchar) {
				newstr+="";
			}
			else {
				newstr+=ch[i];
			}
		}
		System.out.println(newstr);
		sc.close();
	}
}
