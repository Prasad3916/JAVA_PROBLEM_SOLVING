package _ProblemSolving;
import java.util.Scanner;
public class _12TimeTable {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Day");
		String day=scanner.next().toLowerCase().substring(0, 3);
		String result=switch(day) {
		case "sun"->"Rest";
		case "mon"->"Java";
		case "tue"->"Python";
		case "wed"->"JS";
		case "thu"->"SQL";
		case "fri"->"Spring";
		case "sat"->"JDBC";
		default ->"Invalid";
		};
		System.out.println(result);
		scanner.close();
	}
}
