package com.example.collections;

import java.util.ArrayList;
//import java.util.Collections;

public class StringSorting {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Hello");
		arrayList.add("Good");
		arrayList.add("Java");
		arrayList.add("Python");
		arrayList.add("Spring");
//		System.out.println(arrayList);
//		Collections.sort(arrayList);
//		System.out.println(arrayList);
		
		for(int i=0; i<arrayList.size()-1;i++) {
			for(int j=0;j<arrayList.size()-i-1;i++) {
				if((arrayList.get(j).compareTo(arrayList.get(j+1)))>0){
					String str=arrayList.get(j);
					arrayList.set(j, arrayList.get(j+1));
					arrayList.set(j+1, str);
				}
			}
		}
		System.out.println(arrayList);
		
	}
}
