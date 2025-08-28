package _ProblemSolving;

public class PalidromeNNumbers {

	public static void main(String[] args) {
		
		
		int n=5;
		for(int i=1;i<=n;i++) {
			System.out.print(" ".repeat((n-i)));
			int j=1;
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}			
			if(j!=1) {
				for(;j>=1;j--) {
					System.out.print(j);
				}
			}
			
		
		}
	}
}
