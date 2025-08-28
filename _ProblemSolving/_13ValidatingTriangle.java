package _ProblemSolving;

public class _13ValidatingTriangle {

	
	public static void main(String[] args) {
		int a=10,b=10,c=10;
		if(a==b && b==c) {
			System.out.println("equilateral triangle");
		}
		else if(a==b && c>0 ) {
			System.out.println("isosilas triangle");
		}
	}
}
 