package com.example.strings;
import java.util.Scanner;
public class ReplaceSpaceWithSymbols {
	public static void main(String[] args) {
		System.out.println("Enter String To Replace Spaces With %20");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		String repstr="";
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
				repstr+="%20";
			}
			else {
				repstr+=ch[i];
			}
		}
		System.out.println(repstr);
		sc.close();
	}
}
