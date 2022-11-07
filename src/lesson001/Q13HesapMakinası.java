package lesson001;

import java.util.Scanner;

public class Q13HesapMakinası {

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
		int sayi1=scanner.nextInt();
		int sayi2=scanner.nextInt();
		
	}

}
