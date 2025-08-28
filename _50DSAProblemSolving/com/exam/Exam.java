package _50DSAProblemSolving.com.exam;
import java.util.Scanner;
public class Exam {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StringBuilder upperCase=new StringBuilder("");
		StringBuilder lowerCase=new StringBuilder("");
		StringBuilder spcCharacters=new StringBuilder("");
		StringBuilder digits=new StringBuilder("");
		int spaceCount=0;
		System.out.println("Enter String");
		String string=s.nextLine();
		for(int i=0;i<string.length();i++) {
			char ch=string.charAt(i);
			if(Character.isLowerCase(string.charAt(i))) {
				lowerCase.append(ch);
			}
			else if(Character.isUpperCase(string.charAt(i))) {
				upperCase.append(ch);
			}
			else if(ch==' ') {
				spaceCount+=1;
			}
			else if(Character.isDigit(ch)) {
				digits.append(ch+"");
			}
			else {
				spcCharacters.append(ch);
			}
		}
		System.out.println(upperCase);
		System.out.println(lowerCase);
		System.out.println(spcCharacters);
		System.out.println(digits);
		System.out.println(spaceCount);

		s.close();
	}
}
