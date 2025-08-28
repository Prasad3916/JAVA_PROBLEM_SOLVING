package _dsa;
import java.util.Arrays;
public class MovingZerosToRight {
	static int[] movingZerosToRight(int arr[]) {
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				if(j!=i) {
					arr[j]=arr[i];
					arr[i]=0;
				}
				j++; 
			} 
		}
		return arr;
	}
	static int[] movingZerosToLeft(int arr[]) {
		int j=arr.length-1;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=0) {
				if(j!=i) {
					arr[j]=arr[i];
					arr[i]=0;
				} 
				j--;
			} 
		}
		return arr;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(movingZerosToRight(new int[] {1,1,0,2,5,0,0,4})));
		System.out.println(Arrays.toString(movingZerosToRight(new int[] {1, 0, 2, 0, 3})));
		System.out.println(Arrays.toString(movingZerosToRight(new int[] {0,2,4,5,6,1,2,5,7,2,5,0,0,1,2,3,4})));
		System.out.println(Arrays.toString(movingZerosToLeft(new int[] {0,1,0,2,5,0,1,2,3,4,5})));
		System.out.println(Arrays.toString(movingZerosToLeft(new int[] {0,2,4,5,6,1,2,5,7,2,5,0,0})));
	}
}
