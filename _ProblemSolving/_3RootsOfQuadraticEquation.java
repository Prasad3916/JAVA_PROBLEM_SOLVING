package _ProblemSolving;
import java.util.Scanner;
public class _3RootsOfQuadraticEquation {
	void rootsOfQuadraticEquation(int a,int b,int c) {
//		x² - 4x + 3 = 0
//		x² + x  + 1 = 0
		var discriminant=(b*b)-(4*a*c);
		if(discriminant>0) {
			double root1=((-b)+Math.sqrt(discriminant))/(2*a);
			double root2=((-b)-Math.sqrt(discriminant))/(2*a);
			System.out.println("Roots Are Distinct And Real");
			System.out.println("root1 : "+(int)root1);
			System.out.println("root2 : "+(int)root2);
		}
		else if(discriminant<0) {
			String complex1="i\u221A"+-discriminant;
			String complex2="i\u221A"+-discriminant;
			String root1="("+-b+"+"+complex1+")/2";
			String root2="("+-b+"-"+complex2+")/2";
			System.out.println("Roots Are Not Real and complex");
			System.out.println("root1 : "+root1);
			System.out.println("root2 : "+root2);
		}
		else {
			double root=((-b)+Math.sqrt(discriminant))/(2*a);
			System.out.println("Roots Are Equal");
			System.out.println("root1 : "+(int)root+"\nroot2 : "+(int)root);
		}
	}
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		System.out.print("Enter X square Coefficient : ");
		var a=scanner.nextInt();
		System.out.print("Enter X Coefficient : ");
		var b=scanner.nextInt();
		System.out.print("Enter Value Of Constant : ");
		var c=scanner.nextInt();
		scanner.close();
		new _3RootsOfQuadraticEquation().rootsOfQuadraticEquation(a, b, c);
	}
}