package _dsa;
import java.util.ArrayList;
import java.util.Scanner;
public class FibonocciPattern {
	
	FibonocciPattern(int noof_rows){
		ArrayList<Integer>  arrayList= new ArrayList<>();
		int first=5;
		int second=7;                                      
		arrayList.add(first);
		arrayList.add(second);
		int noofValues=((noof_rows)*(noof_rows+1))/2;  //x^2+x=2*(values)
		for(int i=0;i<noofValues-2;i++) {
			int next=first+second;
			arrayList.add(next);
			first=second;
			second=next;
		} 
		
		for(int i=0;i<noof_rows;i++) {
			int count=i;
			for(int j=0;j<=i;j++) {
				System.out.print (arrayList.get(count)+" ");
				count+=(noof_rows)-(j+1);
			}
			System.out.println(); 
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Noof Rows");
		int rows=scanner.nextInt();
		new FibonocciPattern(rows); 
		scanner.close();
	}
} 



