package _ProblemSolving;
import java.util.Scanner;
public class _2SwappingThreeNumbers {
	void swappingThreeNumbers(int a,int b,int c) { //100 200 300
		System.out.println("Before swapping , a : "+a+" ,b : "+b+" ,c : "+c);
		a = a + b + c;
		b = a - (b + c); 
		c = a - (b + c); 
		a = a - (b + c);
		System.out.println("After swapping , a : "+a+" ,b : "+b+" ,c : "+c);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter A Value : ");
		int a=scanner.nextInt();
		System.out.print("Enter B Value : ");
		int b=scanner.nextInt();
		System.out.print("Enter C Value : ");
		int c=scanner.nextInt();
		scanner.close();
		new _2SwappingThreeNumbers().swappingThreeNumbers(a, b, c);
	}
}
