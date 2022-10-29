package lesson002;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		// Kullanıcan kaçıncı aydan doğdun ve hangi gün doğdun
		//verilere göre burcunu yazdıran program 
		
		/*
        Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        1. Ay Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart
      */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kaçıncı ay da doğdunuz");
		int ay=scanner.nextInt();
		
		System.out.println("hangi gün de doğdunuz");
		int gün=scanner.nextInt();
		
		switch (ay) {
		case 1:
			if(gün==21) {
				System.out.println("Oğlak Burcu");
			}
			else
				System.out.println("Kova Burcu");
			
			break;
		case 2:
			if(gün==19) {
				System.out.println("Kova Burcu");
			}
			else
				System.out.println("Balık Burcu");
			
			break;
		case 3:
			if(gün==20) {
				System.out.println("Balık Burcu");
			}
			else
				System.out.println("Koç Burcu");
			
			break;
		case 4:
			if(gün==19) {
				System.out.println("Kova Burcu");
			}
			else
				System.out.println("Balık Burcu");
			
			break;

		default:
			System.out.println("1-12 arasında bir ay giriniz");
			break;
		}
		
		
		
	}

}
