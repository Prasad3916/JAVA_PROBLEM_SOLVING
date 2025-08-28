package _ProblemSolving;
import java.util.Scanner;
public class _15NumberToBinary {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter Number : ");
	int num=scanner.nextInt();
	String res="";
	while(num>=1) {
		res=(num%2)+res;
		num=num/2;
	}
	System.out.println(res);
	int decimal=0;
	for(int i=0;i<res.length();i++) {
		if(res.charAt(i)=='1') {
			decimal+=(Math.pow(2, ((res.length()-1)-i)));
		}
	}
	System.out.println(decimal);
	scanner.close();
}
}
