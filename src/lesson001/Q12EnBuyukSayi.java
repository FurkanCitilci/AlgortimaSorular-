package lesson001;

import java.util.Scanner;

public class Q12EnBuyukSayi {
	public static void main(String[] args) {
		//girilen 3 sayıdan en büyük olan
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("3 tane sayı giriniz");
		
		int sayi1= scanner.nextInt();
		int sayi2= scanner.nextInt();
		int sayi3= scanner.nextInt();
		
		int enBuyuk=sayi1;
		
		if(enBuyuk<sayi2) {
			enBuyuk=sayi2;
			
		}
		if(enBuyuk<sayi3) {
			enBuyuk=sayi3;
		}
		
		System.out.println("En büyük sayi:" + enBuyuk);
			
	}
	
}
