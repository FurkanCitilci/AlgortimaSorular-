package lesson003;

import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) {
		// Saynın mükemmel sayı olup olmadığını bulan program
		//
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		int sayi = scanner.nextInt();
		int i=0;
		int top=0;
	
		while (i<=sayi) {
			i++;
			if(sayi%i==0) {
				top=top+i;
			}
		}
		if(top==(2*sayi)) {
			System.out.println("Mükemmel sayı");
		}
		else
			System.out.println("Mükemmel sayı değil");
		
		scanner.close();
	}

}

