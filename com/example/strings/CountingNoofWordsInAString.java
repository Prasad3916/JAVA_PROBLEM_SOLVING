package com.example.strings;
import java.util.Scanner;
public class CountingNoofWordsInAString {
	public static void main(String[] args) {
		System.out.println("Enter String To Find Number of Words");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch[]=str.trim().toCharArray();
		int noofwords=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
				noofwords++;
			}
		}
		System.out.println("Number of Words In String : "+(noofwords+1));
		sc.close();
	}
}
