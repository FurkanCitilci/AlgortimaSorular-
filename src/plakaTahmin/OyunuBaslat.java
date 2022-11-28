package plakaTahmin;

import java.util.Scanner;

public class OyunuBaslat {

	
	public static void menu() {
		PlakaTahmin plaka = new PlakaTahmin();
		
		int secim=0;
		
		do {
			System.out.println("=========================");
			System.out.println(plaka.oyunSayisi + " oyun"
							+ "\n1 Oyuna Başla" 
							+ "\n2 Tahminlerim"
							+ "\n0 Çıkış");
	
			
			Scanner scanner = new Scanner(System.in);
			secim = scanner.nextInt();
			
			switch (secim) {
			case 1:
				plaka.tahmin();
				break;
			case 2:
				plaka.tahminListem();
				break;

			case 0:
				System.out.println("Oyun kapandı");
				break;
			

			default:
				break;
			}
			
		}while(secim !=0);
		
		
	}
	
	
}



