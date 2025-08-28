package _ProblemSolving;
public class _10DivisibleBy3And11 {
	void divisibleBy3And11() {
		for(int i=1;i<=500;i++) {
			if(i%3==0 && i%11==0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		new _10DivisibleBy3And11().divisibleBy3And11();
	}
}
