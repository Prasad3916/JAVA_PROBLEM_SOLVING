package com.example.collections;
import java.util.ArrayList;
public class RemoveDuplicatesFromString {
			public static void main(String[] args) {
				String s="Hai how are you";
//				String s1="";
				StringBuilder stringBuilder = new StringBuilder("");
				for (int i = 0; i < s.length(); i++) {
					char ch=s.charAt(i);
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || 
					ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
					stringBuilder.append(""+(ch+0));
				}
				else {
					stringBuilder.append(ch);
				}
				}
				System.out.println(stringBuilder);
				ArrayList<Character> arrayList = new ArrayList<>();
				for (int i = 0; i < stringBuilder.length(); i++) {
					char ch=stringBuilder.charAt(i);
					if(!arrayList.contains(ch) && Character.isDigit(ch)) {
						arrayList.add(ch);
					}
				}
				arrayList.forEach(e->System.out.print(e+" "));
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
//				for (int i = 0; i < s.length(); i++) {
//					char ch=s.charAt(i);
//					if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
//						stringBuilder.append("PambiBhavaniPrasad");
//					}
//					else {
//						stringBuilder.append(ch);
//					}
//				}
//				//HPambiBhavaniPrasadPambiBhavaniPrasad hPambiBhavaniPrasadw PambiBhavaniPrasadrPambiBhavaniPrasad yPambiBhavaniPrasadPambiBhavaniPrasad 1234576
//				System.out.println(stringBuilder);
//				for (int i = 0; i < stringBuilder.length(); i++) {
//					char ch=stringBuilder.charAt(i);
//					if((ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' && 
//							ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U') && (!(Character.isDigit(ch)))) {
//						System.out.print(ch+" ");
//					
//					}
//					
//				}
//				char[] charArray = s.toLowerCase().toCharArray();
//				for (int i = 0; i < charArray.length; i++) {
//					if(Character.isDigit(charArray[i])) {
//						s1=s1+charArray[i];
//					}
//				}
//				for (int i = 0; i < s.length(); i++) {
//					if(Character.isDigit(s.charAt(i))) {
//						s1=s1+charArray[i];
//					}
//				}
//				if(s1.isEmpty()) {
//					System.out.println("No Digits Found");
//				}
//				else {
//					System.out.println(s1);
//				}
//				System.out.println();
//				for(int i=0;i<s.length();i++) {
//					
//					char ch=s.charAt(i);
//					if(ch>='A' && ch<='Z'&& !arrayList.contains(ch)) {
//						arrayList.add(ch);
//					}
//				}
//				for(int i=0;i<s.length();i++) {
//					char ch=s.charAt(i);
//					char c=(char)(ch-32);
//					if(ch>='A' && ch<='Z'&& !arrayList.contains(c)) {
//						arrayList.add(c);
//					}
//				}
//				System.out.println(arrayList);
//				for(int i=0;i<s.length();i++) {
//					char ch=s.charAt(i);
//					char c=(char)(ch-32);
//					if(ch>='a' && ch<='z'&& !arrayList.contains(c)) {
//						arrayList.add(c);
//					}
//				}
//				System.out.println(arrayList);
//				String repeat="";
//				for(int i=0;i<s.length();i++) {
//					char ch=s.charAt(i);
//					char c=(char)(ch-32);
//					if(ch>='a' && ch<='z'&& !arrayList.contains(c)) {
//						arrayList.add(c);
//						repeat+=c;
//					}
//				}
//				repeat+=" ";
//				System.out.println(repeat.repeat(repeat.length()-1));
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
}
