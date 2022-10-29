package lesson003;

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
		// Kullanıcıdan sürekli sayı al 
		// 0 a bastığında aldığın sayıların çarpımı
		//while
		//ilk program başladığında 0 girme durumu 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen sayıları giriniz");
		int sayi=scanner.nextInt();
		int temp=1;
		if(sayi==0) {
			System.out.println("Lütfen sıfırdan farklı bir sayı ile başlayınız");
		}else {
		while(sayi!=0) {
			temp=temp*sayi;
			sayi=scanner.nextInt();
			
		}
		System.out.println("Sayların çarpımı:"+ temp);
		
		scanner.close();
		
		}
	}

}










