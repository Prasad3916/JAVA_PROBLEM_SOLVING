package com.example.ProblemSolving;
public class NumberInWords {
	void getWords(int i) {
		String zerotonineteen[]= {"Zero","one","two","three","four","five","six",
				"seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen",
				"seventeen","eighteen","nineteen"};
		String tens[]= {"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety","hundred"};
		if(i>=0 && i<=19 ) {
			System.out.println(zerotonineteen[i]);
		}
		else if(i>=20) {
			System.out.println();
		}
	}
	public static void main(String[] args) {
			 NumberInWords numberInWords = new NumberInWords();
			 numberInWords.getWords(19);
	}
}
