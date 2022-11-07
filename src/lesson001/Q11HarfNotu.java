package lesson001;

import java.util.Scanner;

public class Q11HarfNotu {

	public static void main(String[] args) {
		// girilen ortalamanın harf notuna göre geçip geçmediği
		//90 üstü aa
		//80-90 bb
		//70-80 cc
		//60-70 dd
		//60 altı ff kaldın
		Scanner scanner = new Scanner(System.in);
		System.out.println("ortalamanızı Giriniz");
		
		float ort= scanner.nextFloat();
		System.out.println("Ortalamanız:" + ort);
		
		if(ort>90) {
			System.out.println("Geçtiniz Harf notunuz: AA");
		}
		else if(ort<90 && ort>80) {
			System.out.println("Geçtiniz Harf Notunuz BB");
		}
		else if(ort<80 && ort>70) {
			System.out.println("Geçtiniz Harf Notunuz CC");
			
		}
		else if(ort<70 && ort >60) {
			System.out.println("Geçtiniz Harf Notunuz DD");
			
		}
		else
			System.out.println("Kaldınız Harf Notunuz FF");
	}

}
