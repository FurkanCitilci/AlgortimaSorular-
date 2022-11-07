package com.furkancitilci;

public class Soru3 {
	
	private static void karakterSayici(String str, char ch) {
		
		int sayac=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==ch) {
				sayac++;
				
			}
			
		}
		System.out.println("Metnin içinde " + ch +" harfi " + sayac + " tane geçiyor");
		
	}

	public static void main(String[] args) {
		
		String metin="Bugün güzel bir gün";
		char ara='u';
		karakterSayici(metin,ara);
		

	}

	

}
