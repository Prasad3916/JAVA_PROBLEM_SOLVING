package _ProblemSolving;
public class _5AmountToDenominations {
	void denominationsInfo(int amount) {
		if(amount>=500) {
			int fiveHundredNotes=amount/500;
			amount=amount-(fiveHundredNotes*500);
			System.out.println("FiveHundredNotes : "+fiveHundredNotes);
		}
		if(amount>=200) {
			int twoHundredNotes=amount/200;
			amount=amount-(twoHundredNotes*200);
			System.out.println("TwoHundredNotes : "+twoHundredNotes);
		}
		if(amount>=100) {
			int hundredNotes=amount/100;
			amount=amount-(hundredNotes*100);
			System.out.println("HundredNotes : "+hundredNotes);
		}
		if(amount>=50) {
			int fiftyNotes=amount/50;
			amount=amount-(fiftyNotes*50);
			System.out.println("FiftyNotes : "+fiftyNotes);
		}
		if(amount>=20) {
			int twentyNotes=amount/20;
			amount=amount-(twentyNotes*20);
			System.out.println("TwentyNotes : "+twentyNotes);
		}
		if(amount>=10) {
			int tenNotes=amount/10;
			amount=amount-(tenNotes*10);
			System.out.println("TenNotes : "+tenNotes);
		}		
		if(amount>=5) {
			int fiveRupeeCoins=amount/5;
			amount=amount-(fiveRupeeCoins*5);
			System.out.println("FiveRupeeCoins : "+fiveRupeeCoins);
		}		
		if(amount>=2) {
			int twoRupeeCoins=amount/2;
			amount=amount-(twoRupeeCoins*2);
			System.out.println("TwoRupeeCoins : "+twoRupeeCoins);
		}		
		if(amount>=1) {
			int oneRupeeCoins=amount/1;
			amount=amount-(oneRupeeCoins*1);
			System.out.println("OneRupeeCoins : "+oneRupeeCoins);
		}
	}
	public static void main(String[] args) {
		new _5AmountToDenominations().denominationsInfo(47626);
	}
}