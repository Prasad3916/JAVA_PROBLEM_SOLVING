package com.example.collections;

import java.util.ArrayList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(30);
		arrayList.add(50);
		
		
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            Integer current = arrayList.get(i);
            if (!uniqueList.contains(current)) {
                uniqueList.add(current);
            }
        }
//		for (int j=0;j<arrayList.size();j++) {
//			for (int i=j+1;i<arrayList.size();i++) {
//				
//				if(arrayList.get(j).equals(arrayList.get(i))) {
//					arrayList.remove(i);
//				}
//				
//			}
//		}
		
		System.out.println(arrayList);
		System.out.println(uniqueList);
		
	}
}
