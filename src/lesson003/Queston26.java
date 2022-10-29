package lesson003;

import java.util.Scanner;

public class Queston26 {

	public static void main(String[] args) {
		// girilen sayının 5 in kuvveti olup olmadığını bulan program
		// while

		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		double sayi = scanner.nextDouble();
		boolean kontrol = true;
		/*
		 * while(sayi%5==0) { sayi=scanner.nextInt();
		 * System.out.println("Sayı 5 in katı");
		 * 
		 * } System.out.println("Sayı 5 in katı değil");
		 */
		while (kontrol == true) {
			if (sayi % 5 == 0) {
				sayi = sayi / 5;
				if (sayi == 1) {
					System.out.println("5 in kuvvetidir");
					kontrol = false;
				}
			} else {
				System.out.println("5 in kuvveti değildir");
				kontrol = false;
			}
		}
		scanner.close();

	}

}
