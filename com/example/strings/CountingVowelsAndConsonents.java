package com.example.strings;
import java.util.Scanner;
public class CountingVowelsAndConsonents {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String To Find Vowels and Consonents Count : ");
		String str=sc.nextLine();
		char[] arr=str.toCharArray();
		int vowelscount=0;
		int consonentscount=0;
		for(char ele:arr) {
			if(Character.isAlphabetic(ele)) {
				if(ele=='a' || ele=='e' || ele=='i' || ele=='o' || ele=='u' || ele=='A' || ele=='E' || ele=='I' || ele=='O' || ele=='U')
					vowelscount++;
				else
					consonentscount++;
			}	
		}
		System.out.println("Vowels Count : "+vowelscount);
		System.out.println("Consonents Count : "+consonentscount);
		sc.close();
	}
}
