package com.furkancitilci;

import java.util.Scanner;

public class Main {
	static Kanal kanal;													//Kanal türünden kanal nesnesi oluşturldu
	static Televizyon televizyon = new Televizyon();					//Televizyon sınıfına ulaşmak için televizyon nesnesi
	static boolean tvAcik = false;										//tv nin açık olup olmadığı kontrolü yapılır

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		boolean check = true;
		while (check) {
			System.out.println("Seçiminiz: (Menüyü Görmek için 8 i tuşlayın)");

			int secim = scanner.nextInt();

			switch (secim) {
			case 1:

				televizyonKur();					//televizyon nesnesi oluştuğunda case 1 içinde kanlları oluşturdum
				kanllariOlustur();
				break;
			case 2:
				televizyonuAc();

				break;
			case 3:
				sesArtir();
				break;
			case 4:

				sesAzalt();
				break;
			case 5:

				kanalDegistir();
				break;
			case 6:

				kanalBilgisiGoster();
				break;
			case 7:

				televizyonuKapat();
				break;
			case 8:

				menu();
				break;

			case 0:
				check = false;
				System.out.println("Sistemden çıktınız");
				break;

			}
		}

	}

	public static void televizyonuKapat() {

		if (tvAcik == true) {
			televizyon.televizyonKapat();

		} else
			System.out.println("Televizyon zaten kapalı");

	}

	public static void kanalBilgisiGoster() {
		if (tvAcik == false) {
			System.out.println("Televizyon açık değil");
		} else {
			System.out.println("\n***Kanal Listesi***\n");
			televizyon.kanalBilgisi();
		}

	}

	public static void kanalDegistir() {
		if (tvAcik == false) {
			System.out.println("Televizyon açık değil");
		} else {
			
			System.out.println("Hangi Kanalı Açmak istiyorsunuz");
			int kanalNo = scanner.nextInt();
			televizyon.kanalDegis(kanalNo);

		}

	}

	public static void sesAzalt() {
		if (tvAcik == false) {
			televizyon.sesKis();
		} else {
			televizyon.sesKis();
			System.out.println("Televizyonun sesi: " + televizyon.getSes());
		}

	}

	public static void sesArtir() {
		if (tvAcik == false) {
			televizyon.sesAc();
		} else {
			televizyon.sesAc();
			System.out.println("Televizyonun sesi: " + televizyon.getSes());
		}

	}

	public static void televizyonuAc() {

		if (tvAcik == false) {
			televizyon.televizyonAc();
		} else
			System.out.println("Televizyon zaten açık");

	}

	public static void kanllariOlustur() {
		// Haber Kanalları oluşturuldu
		televizyon.kanallariOlustur(new HaberKanali("CNN", 1));
		televizyon.kanallariOlustur(new HaberKanali("NTV", 2));
		televizyon.kanallariOlustur(new HaberKanali("HABERTURK", 3));
		televizyon.kanallariOlustur(new HaberKanali("TRT Spor", 4));

		// Muzik Kanalı oluşturuldu
		televizyon.kanallariOlustur(new MuzikKanali("Kral", 5));
		televizyon.kanallariOlustur(new MuzikKanali("PowerTurk", 6));
		televizyon.kanallariOlustur(new MuzikKanali("NumberOne", 7));
		televizyon.kanallariOlustur(new MuzikKanali("Super FM", 8));

	}

	public static void televizyonKur() {

		scanner.nextLine();
		System.out.println("Televizyon Markasını Giriniz");
		String marka = scanner.nextLine();
		System.out.println("Televizyon Boyutunu Giriniz");
		String boyut = scanner.nextLine();
		televizyon.televizyonuKur(marka, boyut);
		System.out.println(televizyon);

	}

	public static void menu() {

		System.out.println("***MENU****");
		System.out.println("0- Çıkış \n" + "1-- Televizyon Kur\n" + "2-- Televizyonu Aç\n" + "3-- Sesini Artır\n"
				+ "4-- Sesi Azalt\n" + "5-- Kanal Değiştir\n" + "6-- Kanal Bilgisi Goster\n" + "7-- Televizyonu Kapat\n"
				+ "8-- Menüyü Goster\n");

	}

}
