package com.example.collections;

import java.util.ArrayList;

public class FindingDuplicates {

	public static void main(String[] args) {
		
		StringBuilder stringBuilder = new StringBuilder();
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("abc");
		arrayList.add("abc");
		arrayList.add("xyz");
		arrayList.add("xyz");
		arrayList.add("jhdsk");
		arrayList.add("shfksj");
		int count=0;
//		for (int i = 0; i < arrayList.size(); i++) {
//			if(stringBuilder.indexOf(arrayList.get(i))==-1) {
//				count++;
//			}
//			
//		}
		long count2 = arrayList.stream()
		
		.count();
		System.out.println(count2);


	}
}
