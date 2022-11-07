package lesson001;

import java.util.Scanner;

public class Q7NotHesaplama {

	public static void main(String[] args) {
		// Kullanıcıdan alınan vize ve final notlarından öğrencinin gecip gecmediğini bul
		// 50 den buyuk ve eşitse geç
		//50 den küçükse kal
		// vize %40
		//final %60
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vize notunu giriniz");
	
		float vize= scanner.nextFloat();
	
		System.out.println("Final notunu giriniz");
		float fnl = scanner.nextFloat();
		
		vize=vize*40/100;
		fnl=fnl*60/100;
		float not=vize+fnl;
		
		if(not<50) {
			System.out.println("kaldın");
			
		}
		else if(not>=50){
			System.out.println("geçtin");
		}
		else
			System.out.println("iyi günler");
		
		
	}
	


}
