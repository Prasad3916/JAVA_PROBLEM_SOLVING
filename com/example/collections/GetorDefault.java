package com.example.collections;
import java.util.TreeMap;
public class GetorDefault {
	public static void main(String[] args) {
		TreeMap<Character, Integer> treeMap = new TreeMap<>();
		String str= "Bhavani_Prasad_Pambi";
		char[] charArray = str.toCharArray();
		for(char ele: charArray) {
			treeMap.put(ele, treeMap.getOrDefault(ele, 0)+1);
		}
		System.out.println(treeMap);
	}
}
