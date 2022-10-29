package lesson002;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		// Girilen sayının faktöriyelini hesapla
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		
		int sayi=scanner.nextInt();
		int faktoriyel=1;
		
		for(int i=1;i<=sayi;i++) {
			faktoriyel=faktoriyel*i;
		}
		System.out.println(faktoriyel);

	}

}
