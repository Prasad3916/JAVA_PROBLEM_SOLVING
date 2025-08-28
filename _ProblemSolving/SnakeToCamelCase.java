package _ProblemSolving;
public class SnakeToCamelCase {
	static void snakeToCamelCase(String str) {
		String snakeCase=str.charAt(0)+"";
		for(int i=1;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>=97 && ch<=122) snakeCase+=(ch+"");
			else {
				while(!(str.charAt(i)>=97 && str.charAt(i)<=122)) {
					i++;
				}
				String ch1=((str.charAt(i)+"").toUpperCase());
				snakeCase+=ch1+"";
			}
		}
		System.out.println(snakeCase);
	}
	
	
	static void camelCaseToSnakeCase(String str) {
		String cctsc=str.charAt(0)+"";
		for(int i=0;i<str.length()-1;i++) {
			char ch=str.charAt(i+1);
			if(ch >=65 && ch <= 90) cctsc+=(("_"+ch).toUpperCase());
			else cctsc+=ch+"";
		}
		System.out.println(cctsc);
	}
	public static void main(String[] args) {
		snakeToCamelCase("this_@#$%^&*(-is problem solving class"); //myVaribleName -> my_variable_name
		camelCaseToSnakeCase("myVaribleName");
		System.out.println((int)'_');
	}
}





































































































































































































