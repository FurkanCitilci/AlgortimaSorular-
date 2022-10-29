package lesson003;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		// taban sayısı al
		// üs sayısı al
		
		//while
		//sonucu yazdır
		//2^5:32
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Taban sayısıs giriniz: ");
		int taban=scanner.nextInt();
		System.out.print("Üs sayısıs giriniz: ");
		int üs=scanner.nextInt();
		int sayac=0;
		int sonuc=1;
		
		while(sayac<üs) {
			sonuc=taban*sonuc;
			sayac++;
		}
		System.out.println(taban + "'" + üs +":" + sonuc);
		scanner.close();
	}

}
