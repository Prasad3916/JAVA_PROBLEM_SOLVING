package _50DSAProblemSolving.com.exam;
public class Exam4 {
	public static void main(String[] args) {
		int n=11;
		for(int i=1;i<=n;i++) {
			if(i==1 || i==n) {
				System.out.println("*".repeat(n));
			}
			else {
				for(int j=1;j<=n;j++) {
					if(j==1 || j==n || j==i || j==n-i+1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
}

 









