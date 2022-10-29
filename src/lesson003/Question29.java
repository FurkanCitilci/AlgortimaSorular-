package lesson003;

import java.util.Scanner;

public class Question29 {

	public static void main(String[] args) {
		// Girilen sayıya kadar olan tek sayıların toplamını bul

		// while

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen sayı giriniz");
		int sayi = scanner.nextInt();
		int i = 0;
		int tek=0;

		while (i<=sayi) {
			i++;
			if(i%2==0) {
				
			}else {
				tek=tek+i;
			}
				
						//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
		}

		System.out.println("Girilen Tek sayıların Toplamı:" + tek);
		scanner.close();
	}

}



