package _ProblemSolving;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayRotation {
	static void arrayRotation(int n,String rotation,int ...arr){
		if(n<0) {
			System.out.println("Invalid");
			return;
		}
		else if(n==0) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		else if(rotation.equals("left")){
			n=n%arr.length;
			int temp=0;
			for(int i=0;i<n;i++) {
				int j=0;
				temp=arr[0];
				for(j=0;j<arr.length-1;j++) {
					arr[j]=arr[j+1];
				}
				arr[j]=temp;
			}
			System.out.println(Arrays.toString(arr));
		}
		else if(rotation.equals("right")){
			n=n%arr.length;
			int temp=0;
			for(int i=0;i<n;i++) {
				int j=0;
				temp=arr[arr.length-1];
				for(j=arr.length-1;j>0;j--) {
					arr[j]=arr[j-1];
				}
				arr[j]=temp;
			}
			System.out.println(Arrays.toString(arr));
		}
		else {
			System.out.println("Invalid Input");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Rotation Direction left or right only : ");
		String string = scanner.nextLine();
		System.out.print("Enter n Value : ");
		int n = scanner.nextInt();
		System.out.println("Enter size of the array");
		int size=scanner.nextInt();
		int array[]=new int[size];
		System.out.println("Enter Array Elements");
		for(int i=0;i<array.length;i++) {
			array[i]=scanner.nextInt();
		}
		arrayRotation(n,string,array);
		scanner.close();

	}
}
