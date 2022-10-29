package lesson004;

public class Question36 {

	public static void main(String[] args) {
		// java
		//spring
		//postgre
		//react
		
		String string="Java,Spring,Postgre,React";
		
		//substring
		
		/*
		
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i) ==',') {
				System.out.println();
			}
			else {
				System.out.print(string.charAt(i));
			}
			
			
		}
		*/
		//substring ile çöz
		
		int index=0;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)==',') {
				System.out.println(string.substring(index, i));
				index=i+1;
			}
		}
		
		System.out.println(string.substring(index));

	}

}
