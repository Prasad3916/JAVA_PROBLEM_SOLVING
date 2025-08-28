package _ProblemSolving;
public class _2DArray {
	static void twoDArray() {
		int arr[][]= {{1,2,3,4,5},{9,8,7,6,5},{1,3,5,7,9}};
		int sum=0;
		int prod=1;
		for(int i=0;i<arr.length;i++) {
//			System.out.print("{");
			for(int j=0;j<arr[i].length;j++) {
//				if(j==arr[i].length-1) {
//					System.out.print(arr[i][j]);
//				}
//				else {
//					System.out.print(arr[i][j]+",");
//				}
				sum+=arr[i][j];
				prod*=arr[i][j];
			}
			System.out.println(sum);
			System.out.println(prod);
			sum=0;
			prod=1;
//			System.out.print("}");
//			System.out.println();
		}
	}
	static void threeDArray() {
		int arr[][][]= {
							{
								{1,2,3},{7,8,9}
							},
							{
								{1,3,5},{2,4,8}
							},
							{
								{4,5,6},{4,5,6}
							}
						};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("{");
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.print("}");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		twoDArray();
		threeDArray();
	}
}
