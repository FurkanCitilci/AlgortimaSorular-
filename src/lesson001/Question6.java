package lesson001;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// girilen tele değerini usd ye cevir
		//1 usd=18.25
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen para miktarını giriniz:");
		
		float paraMiktari=scanner.nextFloat();
		System.out.println("Para Miktarı:" + paraMiktari);
		float usd= paraMiktari / 18.25f;
		System.out.println("Pararnızın USD karşılığı");
		
		System.out.println(":" + usd);
		
		

	}

}
