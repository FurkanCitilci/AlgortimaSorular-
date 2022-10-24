package odevler;

import java.util.Scanner;

public class Odev1 {

	public static void main(String[] args) {
		// Girilen kilo değerinni diğer gezegenlerde kaç kilo olduğunu bulan program (en az 5 gezegen)
		
		//1- kilo değerini girdiğimizde bütün gezegenlerdeki değeri hesaplayıp yazdıran
			
		// Ağırlık = kütle * yerçekimi
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kütlenizi Giriniz:");
		
		
		float kutle=scanner.nextFloat();    // kg cinsinden kütle girilir
		float agirlik=kutle/9.81f;				//kütlesi girilen değerin Evrende ki ağırlığı hesaplanır
		
		float kutleAy=agirlik*1.62f;
		float kutleMars=agirlik*3.721f;
		float kutleVenus=agirlik*8.87f;
		float kutleJupiter=agirlik*24.79f;
		float kutleSaturn=agirlik*10.44f;
		
		System.out.println("Ayda ki Kütleniz:" + kutleAy);
		System.out.println("Marsda ki Kütleniz:"+ kutleMars);
		System.out.println("Venüsde ki Kütleniz:" + kutleVenus);
		System.out.println("Jupiterde ki Kütleniz:" + kutleJupiter);
		System.out.println("Satürnde ki Kütleniz:" +  kutleSaturn);
		
		

	}

}
