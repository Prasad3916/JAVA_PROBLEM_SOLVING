package com.example.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Strings {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Apple");
		arrayList.add("answer");
		arrayList.add("Boy");
		arrayList.add("Battle");
		arrayList.add("awesome");
		
		
		
		Iterator<String> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			String str=iterator.next();
			if(str.startsWith("a") || str.startsWith("A")) {
				iterator.remove();
			}
		}
		System.out.println(arrayList);
		

	}
}
