package _ProblemSolving;
import java.util.Scanner;
public class _9FindingLowerOrUpperCharacter {
	void isLowerOrUpper(char ch) {
		if(ch>='A' && ch<='Z') {
			System.out.println("Given Character "+ch+" is UpperCase");
		}
		else if(ch>='a' && ch<='z') {
			System.out.println("Given Character "+ch+" is LowerCase");
		}
		else {
			System.out.println("It Is Not a Character");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Character");
		char ch=scanner.next().charAt(0);
		new _9FindingLowerOrUpperCharacter().isLowerOrUpper(ch);
		scanner.close();
	}
}
