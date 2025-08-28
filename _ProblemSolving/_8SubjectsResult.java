package _ProblemSolving;
import java.util.ArrayList;
import java.util.Scanner;
public class _8SubjectsResult {
	void result(ArrayList<Integer> a) {
		for (int ele:a) {
			if(ele<35) {
				System.out.println("😓Fail");
				System.exit(0);
			}
		}
		System.out.println("Hurry I Passed All The Subjects");
	}
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Noof Subjects ");
		int n=scanner.nextInt();
		while(n!=0) {
			System.out.println("Enter Subject "+(arrayList.size()+1)+" marks");
			arrayList.add(scanner.nextInt());
			n--;
		}
		new _8SubjectsResult().result(arrayList);
		scanner.close();
	}
}
