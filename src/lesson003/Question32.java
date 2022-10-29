package lesson003;

import java.util.Scanner;

public class Question32 {

	public static void main(String[] args) {
		// Klavyeden 0-100 arasında girilen 5 adet sayı
		//bunların içinden en buyuk ve en küçük olanı yaz
		
		//while
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen 5 tane sayı giriniz");
		int enBuyuk=0;
		int enKucuk=100;
		int i=0;
		while(i<5) {
			int sayi=scanner.nextInt();
			i++;
			if(sayi>enBuyuk) {
				enBuyuk=sayi;
			}
			if(sayi<enKucuk){
				enKucuk=sayi;
			}
					
		}
		System.out.println("En Büyük Sayı: "+enBuyuk);
		System.out.println("En Küçük Sayı: "+enKucuk);
		
		scanner.close();

	}

}
