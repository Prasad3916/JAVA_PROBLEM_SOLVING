package _ProblemSolving;

public class _14powerbillcalculating {

	public static void main(String[] args) {
		int i=450;
		double total=0;
		if(i>200) {
			i=i-200;  
			total+=(i*4);  
			System.out.println(total+ " "+i);
		}
		if(i>100 && i<=200) {
			i= i-100;    //     150-
			total+=(i*2.5);
			System.out.println(total+ " "+i);

		}
			total+=(100*1.5);
			System.out.println(total);
			
			
			
			
			
	}
}
