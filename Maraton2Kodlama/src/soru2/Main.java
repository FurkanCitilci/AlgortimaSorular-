package soru2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


	
		CustomStringTR customStr = new CustomStringTR("Nasilsiniz");
		
		System.out.println(customStr.uzunluk());
		System.out.println("4. Karakter:" + customStr.karakterBul());
		System.out.println( customStr.ilkGecenKarakter());
		System.out.println(customStr.ilkBesKarakter());
		System.out.println(customStr.bosluklariSil());
		System.out.println(customStr.karakterleriBuyut());
		System.out.println(customStr.karakterleriKucult());
		System.out.println(customStr.yerDegistirme());
		System.out.println(customStr.icerikKontrol());

		String yeniiIfade = "NasILsınız";
		System.out.println(customStr.esitlik(yeniiIfade));		
		System.out.println(customStr.ifadeBuykKuckOlmkszn(yeniiIfade));		
		
		//11 metod yazıldı

	}

}
