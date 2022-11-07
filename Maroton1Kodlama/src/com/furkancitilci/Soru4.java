package com.furkancitilci;

import java.security.AlgorithmConstraints;
import java.util.Scanner;

public class Soru4 {
	
	public static final double PI=3.14;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*************************************");
		System.out.println("*       Geometrik Hesaplayıcı       *");
		System.out.println("*************************************");
		System.out.println("1- Kare Alan Hesaplama\n"
				+ "2- Kare Çevre Hesaplama\n"
				+ "3- Dikdörtgen Alan hesaplama\n" 
				+ "4- Dikdörtgen Çevre hesaplama\n"
				+ "5- Daire Alan hesaplama\n"
				+ "6- Daire Çevre hesaplama\n"
				+ "7- Çıkış");
		
		int tercih=0;
		
		while(tercih !=7 ) {
			System.out.println("Hangi işlemi Yapmak istiyorsunuz:");
			tercih=scanner.nextInt();
			
			if(tercih==7) {
				System.out.println("Programdan Çıkılıyor....");
			}
			
			switch (tercih) {
			case 1:
				System.out.println("Tercih 1-Kare Alan Hesaplama");
				System.out.println("****************************");
				System.out.println("Lütfen Karenin bir kenarını giriniz:");
				int kenarKare=scanner.nextInt();
				int alanKare=kenarKare*kenarKare;
				System.out.println("Karenin alanı = " + alanKare);
				
				break;
			case 2:
				System.out.println("Tercih 1-Kare Çevre Hesaplama");
				System.out.println("*****************************");
				System.out.println("Lütfen Karenin bir kenarını giriniz:");
				kenarKare=scanner.nextInt();
				int cevreKare=4*kenarKare;
				System.out.println("Karenin Çevresi = " + cevreKare);
				
				break;
			case 3:
				System.out.println("Tercih 3-Dikdörtgen Alan Hesaplama");
				System.out.println("**********************************");
				System.out.println("Lütfen Dikdörtgenin Kısa Kenarını giriniz:");
				int kısaKenar=scanner.nextInt();
				System.out.println("Lütfen Dikdörtgenin Uzun Kenarını giriniz:");
				int uzunKenar=scanner.nextInt();
				int alanDikdortgen=uzunKenar*kısaKenar;
				System.out.println("Dikdörtgenin Alanı = " + alanDikdortgen);
				
				break;
				
			case 4:
				System.out.println("Tercih 4-Dikdörtgen Çevre Hesaplama");
				System.out.println("***********************************");
				System.out.println("Lütfen Dikdörtgenin Kısa Kenarını giriniz: ");
				kısaKenar=scanner.nextInt();
				System.out.println("Lütfen Dikdörtgenin Uzun Kenarını giriniz: ");
				uzunKenar=scanner.nextInt();
				int cevreDikdortgen=(2*kısaKenar) + (2*uzunKenar);
				System.out.println("Dikdörtgenin Alanı = " + cevreDikdortgen);
					
					break;
			case 5:
				System.out.println("Tercih 5-Daire Alan Hesaplama");
				System.out.println("*****************************");
				System.out.println("Lütfen Dairinin yarı çapını giriniz :");
				int yariCap=scanner.nextInt();
				double daireAlan= PI*yariCap*yariCap;
				System.out.println("Dairenin Alanı= " + daireAlan);
				
				break;
			case 6:
				System.out.println("Tercih 5-Daire Çevre Hesaplama");
				System.out.println("******************************");
				System.out.println("Lütfen Dairinin yarı çapını giriniz :");
				yariCap=scanner.nextInt();
				double daireCevre= 2*PI*yariCap;
				System.out.println("Dairenin Çevresi= " + daireCevre);
				
				
				break;

			default:
				break;
			}
		}
		

	}

}
