package _dsa;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class NextNumber {
	   public static int[] plusOne(int[] digits) {
			 BigInteger num = BigInteger.ZERO;
			for(int i=0;i<digits.length;i++) {
		           num = num.multiply(BigInteger.TEN).add(BigInteger.valueOf(digits[i]));
			}
			num=num.add(BigInteger.valueOf(1));
			String n=num+"";
	        int array[]=new int[n.length()];
			for(int j=0;j<array.length;j++) {
				int number=(char)n.charAt(j)-'0';
				array[j]=number;
			}
	        return array;  
	    }
	 
	   public static int[] plusOne1(int[] digits) {
//			int count=0;
//			for(int i=digits.length-1;i>=0;i--) {
//				if(digits[i]!=9) {
//					digits[i]=digits[i]+1;
//					break;
//				}
//				else {
//					count++;
//					digits[i]=0;
//				}
//			}
//			if(count==digits.length) {
//				digits=new int[count+1];
//				digits[0]=1;
//			}
//	        return digits; 
	
//				for(int i=digits.length-1;i>=0;i--) {
//					if(digits[i]<9) {
//						digits[i]++;
//						return digits;
//					}
//						digits[i]=0;
//				}
//				digits=new int[digits.length+1];
//				System.out.println("1234567890");
//				System.out.println(Arrays.toString(digits));
//				digits[0]=1;
//		        return digits; 
		        
		        
		        
		        
				int count=0;
				for(int i=digits.length-1;i>=0;i--) {
					if(digits[i]<9) {
						digits[i]=digits[i]+1;
						return digits;
					}
					else {
						count++;
						digits[i]=0;
					}
				}
				if(count==digits.length) {
					digits=new int[count+1];
					System.out.println(Arrays.toString(digits));

					digits[0]=1;
				}
				System.out.println(Arrays.toString(digits));
				return digits;
	    }
	    

	public static void main(String[] args) {

		System.out.println(Arrays.toString(plusOne1(new int[] {8,9,9,9})));; 
//		System.out.println(Arrays.toString(plusOne1(new int[] {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,
//				4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6})));
		


	}
}

