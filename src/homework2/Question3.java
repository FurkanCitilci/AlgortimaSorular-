package homework2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
//Soru3 (40 puan)
	    
	    //Tahmin oyunu 
		//rastGele bir sayı oluşturcaz
	    //rastgele sayı oluşturma--> int rastGeleSayi = (int) (Math.random() * 100);
		// o sayıyı tahmin etmeye çalışcaz
		//tahmin ettiğimiz sayı bulcağımız sayıdan fazla ise tahmini azalt yazdırın
		// az ise tahmini artır yazalım
		//sayıyı bulduğumuzda kaçıncı seferde bulduğumuzu yazdıralım
	    //Her yanlış tahminde döngüden çıkmadan bize tekrar tahminimizi sorsun .
	    
	    //while ile çözüm
		
		Scanner scanner = new Scanner(System.in);
		int rndm=(int) (Math.random() * 100);
		System.out.println("Lütfen bir tahminde bulununuz: ");
		//int tahmin=scanner.nextInt();------->Tahmin edilen sayı kontrol edilir
		
		boolean karar=true;													//dongü kontrolü için doğru ve yanlış karar mekanizması
		
		int i=0;
		while(karar) {
			i++;															//kaç kere döngünün devam ettiği sayaçta tutulur
			
			int tahmin=scanner.nextInt();									//sayi doğru tahmin edilene kadar dongü devam eder
			if(rndm<tahmin) {
				System.out.println("Lütfen tahminizi azaltın...");
				System.out.println("Yeni bir tahminde bulununuz... ");
			}
			else if(rndm>tahmin) {
				System.out.println("Lütfen tahminizi artırın...");
				System.out.println("Yeni bir tahminde bulununuz... ");
			}
			else {
				System.out.println("Tebrikler\n" + i + " kere deneme de Doğru Tahmin ettiniz:)");
				System.out.println("Oluşturulan Sayı: " + rndm);
				karar=false;				
			}
				
		}
		scanner.close();
	}

}
