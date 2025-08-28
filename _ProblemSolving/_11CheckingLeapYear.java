package _ProblemSolving;
import java.util.Scanner;
public class _11CheckingLeapYear {
	void isLeapYear(int year) {
		if((year%4==0 && year%100!=0) || year %400==0) {
				System.out.println("Leap Year");
		}
		else {
			System.out.println("Not A Leap Year");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter year");
		int year=scanner.nextInt();
		new _11CheckingLeapYear().isLeapYear(year);
		scanner.close();
	}
}
