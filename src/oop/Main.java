package oop;

import java.util.Arrays;

public class Main {
	
	

	public static void main(String[] args) {
		
		Calisan calisan1= new Calisan();
		//calisan sınıfında new anahtar kelimesini kullanarak calisan() referansı ile calisan1 oluşturuldu
		calisan1.ad="Furkan";
		calisan1.soyAD="Çitilci";
		calisan1.departman="Java Yazılım";
		calisan1.cinsiyet="Erkek";
		calisan1.dogumTarihi= 1996;	//genelde string alınır
		calisan1.maas=17500;
		calisan1.yas=26;
		
		
		//ststic bize nesne kullandırmaz class üzerinden çağırabilirz
		
		
		Urun urun1= new Urun();
		urun1.urunAdi="Iphone14 Plus ";
		urun1.urunBarkodNumarasi="123456789";
		urun1.urunFiyati=1000;
		urun1.urunKategorisi="Telefon ";
		
		urun1.bilgileriGoster();
		
		/*
		 * arda.agdemir@bilgeadamboost.com
			05438567649
		 */
		
		
		
	
		
		
		
		
		
		

	}

}
