package mockjava;
import java.util.Scanner;
public class SubArrayTarget {
	static void subArrayTarget(Scanner sc) {
		int count=0;
		System.out.print("Enter Target Value : ");
		int target=sc.nextInt();
		System.out.print("Enter Array Size : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+i+" index value : ");
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<n-1;j++) {
			int sum=arr[j];
			for(int k=j+1;k<n;k++) {
				sum+=arr[k];
				if(sum==target) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		subArrayTarget(sc);
		sc.close();
	}
}
