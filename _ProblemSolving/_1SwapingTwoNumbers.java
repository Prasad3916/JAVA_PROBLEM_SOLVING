package _ProblemSolving;
import java.util.Scanner;
public class _1SwapingTwoNumbers {
	void swapingTwoNumbers(int a,int b) {
		System.out.println("Before Swapping a : "+a+" b : "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping a : "+a+" b : "+b);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A Value ");
		int a=scanner.nextInt();
		System.out.println("Enter B Value ");
		int b=scanner.nextInt();
		scanner.close();
		new _1SwapingTwoNumbers().swapingTwoNumbers(a, b);
	}

}




