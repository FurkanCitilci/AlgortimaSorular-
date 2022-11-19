package oopKitaplik;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class SecimEkrani {
	
	static Kutuphane kutuphane;
	static Scanner scanner = new Scanner(System.in);
	
	public static void ekranGoster() {
		menuGoster();

		// while döngüsü kullanalım
		// switch case
		// 8 e basınca menuyu göster
		// 0 a basınca döngüden çıksın ve sistemden çıktınız diye yazdırsın

		boolean check = true;
		while (check) {
			System.out.println("Seçimiz (Menüyü Görmek için 8)");
			
			int secim = scanner.nextInt();

			switch (secim) {
			case 1:
				
				kitaplikOlustur();
				break;
			case 2:
				
				kitapEkle();
				break;
			case 3:
				
				kitapIsmiAra();
				break;
			case 4:
				
				yazarIsmiAra();
				break;
			case 5:
				
				kitaplariListele();
				break;
			case 8:
				menuGoster();
				break;
			case 0:
				check = false;
				System.out.println("Sistemden çıktınız");
				break;

			}
		}
	}
	
	
	public static void kitaplariListele() {
		
		kutuphane.kitaplariListele();
		
	}


	public static void yazarIsmiAra() {
		
		scanner.nextLine();
		System.out.println("Aramak istediğiniz yazarı Giriniz");
		String yazar = scanner.nextLine();
		kutuphane.kitapIsmiAra(yazar);
		
		
	}
	public static void kitapEkle() {
		scanner.nextLine();
		System.out.println( "Lütfen yazar ismi giriniz");
		String yazar=scanner.nextLine();
		System.out.println( "Lütfen Kitap ismi giriniz");
		String kitap=scanner.nextLine();
		kutuphane.kitapEkle(yazar, kitap);
	}

	public static void kitaplikOlustur() {
		
		if(kutuphane==null) {
			String boyut = JOptionPane.showInputDialog("Lütfen kütüphane boyutunu giriniz");
			int i = Integer.parseInt(boyut);
			System.out.println( " Kitaplığın boyutunu giriniz");
			kutuphane = new Kutuphane(i);
			System.out.println(boyut + " elemanlı kitaplığımız oluşmuştur");
			
			
		}else {
			System.out.println("Kütüphanede kitaplık oluşturulmuştur");
		}
		
	}
	
	public static void kitapIsmiAra() {
		scanner.nextLine();
		System.out.println("Aramak istediğiniz Kitabı Giriniz");
		String kitap = scanner.nextLine();
		kutuphane.kitapIsmiAra(kitap);
	}

	public static void menuGoster() {
		System.out.println("***MENU***");
		System.out.println("1-Kitaplık Oluştur");
		System.out.println("2-Kitap Ekle");
		System.out.println("3-Kitap ismi Ara");
		System.out.println("4-Yazar ismi Ara");
		System.out.println("5-Kitapları Listele");
		System.out.println("6-Yazarları Listele");
		System.out.println("7-Girilen Harfe Göre yazar ara");
		System.out.println("8-Menu Goster");
		System.out.println("0-Sistemden çık");

	}
	}