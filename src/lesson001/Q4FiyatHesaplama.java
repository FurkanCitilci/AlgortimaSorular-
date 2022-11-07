package lesson001;

import java.util.Scanner;

public class Q4FiyatHesaplama {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ürün fiyatı giriniz:");
		int satisFiyati= scanner.nextInt();
		
		float kdvFiyat=satisFiyati-(satisFiyati)*15/100;
		float hamFiyat=kdvFiyat-(kdvFiyat)*18/100;	
		System.out.println("Ham Fiyat :" + hamFiyat);
	}

}
