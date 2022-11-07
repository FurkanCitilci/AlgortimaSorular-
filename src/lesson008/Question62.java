package lesson008;

import java.util.Scanner;

public class Question62 {
	
	public static int yasHesapla(int dogumYili) {
		int yas=2022-dogumYili;
		return yas;
	}
	
	public static int yuzyilHesapla(int dogumYili) {
		int yuzyil=dogumYili/100 + 1;
		return yuzyil;
	}
	public static void bilgileriYazdır(int dogumYili) {
	
		
		System.out.println(yasHesapla(dogumYili) + " yaşındasınız " + yuzyilHesapla(dogumYili) + " ncı yüzyılda doğmussunuz");
	}
	

	public static void main(String[] args) {
		// Doğum yılınızı yaşınızı
		//ve hangi yüzyılda doğduğunu hesaplayan metodu yazın
		//3 farklı metod
		
		//yasHesapla /	yuzyılHesapla /	bilgileri yazdır
		
		//bilgileri yazdır çağrıldığında
		
		//24 yaşınndasın 20. yuyzil doğmuşsunuz çıktı alalım
		
		//bilgileriYazdır(1996)
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen doğum yılınızı giriniz:");
		int dogumYili=scanner.nextInt();
		bilgileriYazdır(dogumYili);

	}

}
