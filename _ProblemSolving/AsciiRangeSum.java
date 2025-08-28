package _ProblemSolving;
import java.util.Scanner;
public class AsciiRangeSum {
	static void asciiRangeSum(String s) {
		if(s.length()<=2) {
			System.out.println("Invalid");
			return;
		}
		for(int i=0;i<s.length();i++) {
			int i1=s.indexOf(s.charAt(i));
			int i2=s.length()-1;
			if(i>i1) continue;
			else {
				for(int j=s.length()-1;j>=0;j--) {
					if(s.charAt(i)==s.charAt(j)) { i2=j; break; }
				}
				if(i1==i2) continue;
				String substr=s.substring(i1+1, i2);
				int sum=0;
				for(int k=0;k<substr.length();k++) {
					sum+=substr.charAt(k);
				}
				System.out.println(substr+" "+sum);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		asciiRangeSum(str);
		sc.close();
	}
}
 