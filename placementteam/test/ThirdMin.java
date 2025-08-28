package placementteam.test;

public class ThirdMin {
	
	public static void main(String[] args) {
		int arr[]= {0,1,2,34,5,7,54,98};
		
		
		int min=Integer.MAX_VALUE;
		int secmin=min;
		int thirdmin=min;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<min) {
				secmin=min;
				min=arr[i];
			}
			
			if(secmin>arr[i] && arr[i]!=min) {
				thirdmin=secmin;
				secmin=arr[i];
			}
			
			if(thirdmin>arr[i] && arr[i]!=secmin) {
				thirdmin=arr[i];
			}
		}
		
		System.out.println(thirdmin);
		
	}

}
