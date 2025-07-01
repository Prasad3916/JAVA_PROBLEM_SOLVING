package com.example.strings;
import java.util.Scanner;
public class ReplaceVowelsWithCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str=sc.nextLine();
		System.out.println("Enter A Character To Replace With Vowel : ");
		char ch=sc.next().charAt(0);
		char ele;
		for(int i=0;i<str.length();i++) {
			ele=str.charAt(i);
			if(ele=='a' || ele=='e' || ele=='i' || ele=='o' || ele=='u' || ele=='A' || ele=='E' || ele=='I' || ele=='O' || ele=='U')
			{
				str=str.replace(ele, ch);
			}
		}
		System.out.println(str);
		sc.close();
	}
}
