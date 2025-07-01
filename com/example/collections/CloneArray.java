package com.example.collections;

import java.util.ArrayList;

public class CloneArray {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		ArrayList<String> arrayList2 = new ArrayList<>();
		
		arrayList.add("Hello");
		arrayList.add("good");
		arrayList.add("Java");
		arrayList.add("Python");
		arrayList.add("Spring");
//		arrayList2=(ArrayList<String>) arrayList.clone();
//		System.out.println(arrayList2);
		
		for (int i = 0; i < arrayList.size(); i++) {
			arrayList2.add(i, arrayList.get(i));
		}
		System.out.println("------Original Array------");
		System.out.println();
		System.out.println(arrayList);
		System.out.println();
		System.out.println("------Copy Array------");
		System.out.println();
		System.out.println(arrayList2);
		
	}
}
