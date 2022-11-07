package lesson002;

import java.util.Scanner;

public class Q17ForEx3 {

	public static void main(String[] args) {
		// Girilen sayı için çarpım tablosu
		
		//nx1=n
		//nx2=2n
		//...
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		int sayi=scanner.nextInt();
		int carp=1;
		
		for(int i=1;i<=10;i++) {
			carp=sayi*i;
			System.out.println(sayi + "x" + i + "=" + carp);
		}
	}

}
