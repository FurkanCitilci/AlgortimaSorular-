package lesson004;

public class Question37 {

	public static void main(String[] args) {
		// verilen kelimenin içinde kaç tane e olduğunu bulan program
		//
		
		//for loop
		
		
		String kelime="eseseshdedes";
		int sayac=0;
		for(int i=0;i<kelime.length();i++) {
			if(kelime.charAt(i) =='e') {
				
				sayac++;
			}
			
		}
		System.out.println(sayac);

	}

}
