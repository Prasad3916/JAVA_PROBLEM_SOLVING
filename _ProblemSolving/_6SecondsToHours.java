package _ProblemSolving;
public class _6SecondsToHours {
	void secondsToHours(int sec) {
		String time="";
		if(sec>=3600) {
			int hours=sec/3600;
			sec=sec-(hours*3600);
			time+=hours+" hour ";
		}
		if(sec>=60) {
			int mins=sec/60;
			sec=sec-(mins*60);
			time+=mins+" minutes ";
		}
		if(sec<=60){
			time+=sec+" seconds";
		}
		System.out.println(time);
	}
	public static void main(String[] args) {
		new _6SecondsToHours().secondsToHours(86399); //23 hour 59 minutes 59 seconds
	}
}