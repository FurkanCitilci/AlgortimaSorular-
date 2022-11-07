package lesson001;

import java.util.Scanner;

public class Q10DaireninAlani {

	public static void main(String[] args) {
		//Dairenin alanı ve çevresini bul
		//r yi kullanıcıdan al
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dairenin yarıçapını giriniz");
		
		float yariCap=scanner.nextFloat();
		
		double pi = 3.14 ;
		
		float daireninCevresi=(float) (2 * yariCap* pi);
		float daireninAlani= (float) (pi*yariCap*yariCap);
		
		System.out.println("Dairenin Çevresi:");
		System.out.println(daireninCevresi);
		System.out.println("Dairenin Alanı");
		System.out.println(daireninAlani);
		
		

	}

}
