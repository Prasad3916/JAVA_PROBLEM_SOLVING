package _ProblemSolving;
public class _7SumAnAverageOfNSubjects {
	void sumAndAverageOfNSubjects(int ...subjects) {
		int total=0;
		for(int sub:subjects) {
			total+=sub;
		}
		System.out.println("Total Marks : "+total);
		System.out.println("Average Of Marks : "+(total)/subjects.length);
	}
	public static void main(String[] args) {
		new _7SumAnAverageOfNSubjects().sumAndAverageOfNSubjects(89,100,91,100,87,95);
	}
}
