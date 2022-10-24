package odevler;

import java.util.Scanner;

public class Odev3 {
	public static void main(String[] args) {
		// 1-Toplama
		//2-Çıkarma
		//3 -Çarpma
		//4-Bölme
		
		//kullanıcıdan 2 sayı al tercihe göre işlem yap
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1-Toplama:");
		System.out.println("2-Çıkarma:");
		System.out.println("3-Çarpma:");
		System.out.println("4-Bölme:");
		
		System.out.println("Hangi İşlemi Yapmak İstersiniz");
		int tercih=scanner.nextInt();
		System.out.println("Teşekkürler...");
		
		System.out.println("Lütfen İki Sayı Giriniz");
		float sayi1=scanner.nextInt();
		float sayi2=scanner.nextInt();
		
		if(tercih==1) {
			System.out.println("Toplama işlemi yapıyorsunuz:");
			System.out.println("Sonuç=" + " " + (sayi1+sayi2));
		}
		else if(tercih==2) {
			System.out.println("Çıkarma işlemi yapıyorsunuz:");
			System.out.println("Sonuç=" + " " + (sayi1-sayi2));
		}
		else if(tercih==3) {
			System.out.println("Çarpma işlemi yapıyorsunuz:");
			System.out.println("Sonuç=" + " " + (sayi1*sayi2));
		}
		else if(tercih==4) {
			System.out.println("Bölme işlemi yapıyorsunuz:");
			System.out.println("Sonuç=" + " " + (sayi1/sayi2));
		}
		
		
	}
	

}
