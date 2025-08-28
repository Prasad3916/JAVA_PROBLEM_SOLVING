package com.example.collections;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
//import java.util.Set;
public class MapIteration {
	public static void main(String[] args) {
		Hashtable<Integer, String> hashtable = new Hashtable<>();
		hashtable.put(101, "ABC");
		hashtable.put(102, "XYZ");
		hashtable.put(103, "IJK");
		
//		Set<Entry<Integer, String>> entrySet = hashtable.entrySet();
//		for (Entry<Integer, String> entry : entrySet) {
//			System.out.println(entry.getKey()+" >>> "+entry.getValue());
//		}
		
//		for (Entry<Integer, String> entry : hashtable.entrySet()) {
//			System.out.println(entry.getKey()+" >>> "+entry.getValue());
//		}
		
//		for (Map.Entry<Integer, String> entry : hashtable.entrySet()) {
//		System.out.println(entry.getKey()+" >>> "+entry.getValue());
//	}
		
//		for (Integer ele : hashtable.keySet()) {
//			System.out.println(ele+" >>> "+hashtable.get(ele).toLowerCase());
//		}
		
		
		Enumeration<Integer> keys = hashtable.keys();
		while(keys.hasMoreElements()) {
			
			Integer s=keys.nextElement();
			System.out.println(s+" >>> "+hashtable.get(s));
			
		}
		
//		hashtable.forEach((k,v)->System.out.println(k+" >>> "+v));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
