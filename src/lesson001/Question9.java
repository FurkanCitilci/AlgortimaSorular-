package lesson001;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// kenarları verilen üçgenin nasıl olduğunu bulun
		Scanner scanner = new Scanner(System.in);
		System.out.println("Üçgenin Kenar Uzunluklarını giriniz");
		
		float kenar1=scanner.nextFloat();
		float kenar2=scanner.nextFloat();
		float kenar3=scanner.nextFloat();
		
		if(kenar1==kenar2 && kenar3==kenar1 && kenar2==kenar3) {
			System.out.println("Eşkenar üçgen");
		}
		else if(kenar1 != kenar2 && kenar2 != kenar3 && kenar1 != kenar3) {
			System.out.println("Çeşitkenar Üçgen");
			
		}
		else
			System.out.println("İkizkenar Üçgen");
	}
	
	


}
