package lesson002;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		// girilen sayıların toplamını veren program
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		
		int sayi=scanner.nextInt();
		int toplam=0;
		
		int i =0;
		
		for(;i<=sayi;i++) {
			toplam=toplam+i;
		}
		System.out.println("TOPLAM=" + toplam);

	}

}
