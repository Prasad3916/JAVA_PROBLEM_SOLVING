package placementteam.test;

class BankAccount{
	private int balance;
	BankAccount(int balance){
		this.balance=balance;
		}
	public synchronized void withdraw(int amount,String personName){
		if(balance>amount){
			balance-=amount;
			System.out.println(personName +": Withdraw Amount Remaining Balance: "+balance);
		}
		else{
			System.out.println(personName+": Tried To Withdraw But Insufficient Balance.");
		}
	}  
}
public class BankApplication{
	public static void main(String args[]){
		BankAccount ba=new BankAccount(1000);
		Runnable r1=new Runnable(){
			public void run(){
				ba.withdraw(700,"USER1");
				}
			};
		Runnable r2=new Runnable(){
			public void run(){
				ba.withdraw(500,"USER2");
		}};
		Thread t1=new Thread(r1); 
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
	}
}
