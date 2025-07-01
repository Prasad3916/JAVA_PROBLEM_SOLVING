package com.example.strings;
import java.util.Arrays;
import java.util.Scanner;
public class StringToCharArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		char ch[]=new char[str.length()];
		for(int i=0;i<ch.length;i++) {
			ch[i]=str.charAt(i);
		}
		sc.close();
		System.out.println(Arrays.toString(ch));
	}
}
