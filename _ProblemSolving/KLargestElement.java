package _ProblemSolving;
public class KLargestElement {
	static void approachOne() {
		int arr[]= {5,5,5,5};
		int max=Integer.MIN_VALUE;
		int n=3;
		int x=0; 
		int kvalue=max;
		int count=0;
		System.out.println("Wait ..................");
		for(int j=0;j<n;j++) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>max) {
					max=arr[i];
					x=i;
				}
			}
			if(kvalue==max) {
				j--;
				count++;
				if(count==arr.length-1) {
					System.out.println(arr[arr.length-1]);
					return;
				}
			}
			kvalue=max;
			max=0;
			arr[x]=0;
		}
		System.out.println(kvalue);
	}
	static void approachTwo() {
		int arr[]= {1,2,3,4,76,12,13,34,78,78,12,54,76,76,76,76,76,76};
		int secmax=Integer.MIN_VALUE;
		int max=Integer.MIN_VALUE;
		int n=7;
		int x=0;
		int kvalue=secmax;
		for(int j=0;j<n-1;j++) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>max) {
					secmax=max;
					max=arr[i];
				}
				else if(secmax<arr[i] && max!=arr[i]) {
					secmax=arr[i];
					x=i;
				}
			}
			if(kvalue==secmax) {
				j--;
			}
			arr[x]=0;
			kvalue=secmax;
			secmax=0;
		}
		System.out.println(kvalue);
	}
	public static void main(String[] args) {
		approachOne();
		approachTwo();
	}
}
