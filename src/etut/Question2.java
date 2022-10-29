package etut;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// girilen sayının 2 ve 5 e tam bölünen sayıların ortalaması

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen sayı giriniz");
		int sayi = scanner.nextInt();
		int top = 0;
		int i = 1;
		int j = 0;

		for (; i <= sayi; i++) {
			if (i % 2 == 0 && i % 5 == 0) {
				top = top + i;
				j++;
				
			}

		}
		top = top / j;
		System.out.println(top);
		
		scanner.close();

	}

}
