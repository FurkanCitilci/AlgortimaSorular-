package soru4;

import java.util.Random;

public class Islemler {

	public static void main(String[] args) {


		
		
		Yolcu yolcu = new BusinessYolcu(7755, "Mert", "Kaya",false);
		Yolcu yolcu2 = new EkonomiYolcu(889, "Ahmet", "Demir");
		Yolcu yolcu3 = new BusinessYolcu(555, "Aslı", "Bahar", true);
		
		System.out.println("Bussinnes VIP Yolcu");
		yolcu3.biletAl(EFirmaAdi.ADJ);
		yolcu3.biletAl(EFirmaAdi.THY);
		System.out.println("*************");
		yolcu3.ucagaBin();
		yolcu3.ucagaBin();
		yolcu3.checkInYap();
		yolcu3.checkInYap();
		yolcu3.ucagaBin();
		yolcu3.yolcuBilgileriniGetir();
		
		System.out.println("*******Ekonomi Yolcu*******");
		yolcu2.biletAl(EFirmaAdi.ADJ);
		yolcu2.biletAl(EFirmaAdi.THY);
		yolcu2.biletAl(EFirmaAdi.THY);
		yolcu2.biletAl(EFirmaAdi.THY);
		System.out.println("*************");
		yolcu2.ucagaBin();
		yolcu2.ucagaBin();
		yolcu2.checkInYap();
		yolcu2.checkInYap();
		yolcu2.ucagaBin();
		yolcu2.yolcuBilgileriniGetir();
		
		
		

	}

}
