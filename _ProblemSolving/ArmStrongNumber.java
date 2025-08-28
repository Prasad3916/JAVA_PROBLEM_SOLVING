package _ProblemSolving;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		int num=153;
		int temp=num;
		int len=String.valueOf(num).length();
		int sum=1;
		int total=0;
		while(num>0) {
			int rem=num%10;
			while(len>0) {
				sum*=rem;
				len--;
			}
			len=String.valueOf(num).length();
			total+=sum;
			sum=1;
			num/=10;
		}
		System.out.println(total==temp?"ArmStrongNumber":"Not a ArmStrong Number");
	}
}
