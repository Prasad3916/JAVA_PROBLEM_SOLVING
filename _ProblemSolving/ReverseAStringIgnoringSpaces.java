package _ProblemSolving;
public class ReverseAStringIgnoringSpaces {
	static void reverseAStringIgnoringSpaces(String str) {
		str=str.toLowerCase();
		StringBuilder removingSpace=new StringBuilder("");
		for(int i=0;i<str.toLowerCase().length();i++) {
			char ch=str.charAt(str.length()-1-i);
			if(ch>=97 && ch<=122) {
				removingSpace.append(ch);
			}
		}
		System.out.println(removingSpace);
	}
	public static void main(String[] args) {
		reverseAStringIgnoringSpaces("Hello World");
	}
}
