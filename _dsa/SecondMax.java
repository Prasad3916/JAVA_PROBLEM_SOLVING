package _dsa;

public class SecondMax {
	
	static void secondMax(int arr[]) {
		int max=Integer.MIN_VALUE;//1
		int secondmax=Integer.MIN_VALUE; //0 
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondmax=max;
				max=arr[i];
			}
			if(secondmax<arr[i] && arr[i]!=max) { 
				secondmax=arr[i];
			}
		}
		
		System.out.println(secondmax);
	}
	
	
	static void secondMin(int arr[]) {
		int min=Integer.MAX_VALUE;//1
		int secondmin=Integer.MAX_VALUE; //0 
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				secondmin=min; //i  
				min=arr[i]; //1
			}
			if(secondmin>arr[i] && min!=arr[i]) { 
				secondmin=arr[i];
			}
		}
		System.out.println(secondmin);
	}

	public static void main(String[] args) {
		secondMax(new int[] {1,3,2,4});
		secondMin(new int[] {1,3,2,4});
		secondMax(new int[] {2,3,4,5,2,1});
		secondMin(new int[] {2,3,4,5,2,6});
	}
}
