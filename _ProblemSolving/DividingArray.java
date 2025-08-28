package _ProblemSolving;
import java.util.Arrays;

public class DividingArray {

	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3,4,5,6,7,8};
		int n=arr.length/2;
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=arr[i];
			arr2[i]=arr[n+i];
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
}
