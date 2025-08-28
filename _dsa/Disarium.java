package _dsa;

import java.util.ArrayList;

public class Disarium {
		

	public static void main(String[] args) {
		int num=135;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		int first=0; //0
		int second=1; //1
		arrayList.add(first);
		arrayList.add(second);
		for(int i=0;i<8;i++) {
			int next=first+second; // 1
//			System.out.print(next+" ");
			arrayList.add(next);
			first=second;
			second=next;
		}
		
		System.out.println(arrayList);
		int count=4;
		int j=0;
			for(int k=1;k<=count;k++) {
				for(;j<k;j++) {
					System.out.print(arrayList.get(j));
					j++;
				}
				System.out.println();
			}
//			count++;

			

		
	}
}
