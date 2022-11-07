package lesson002;

import java.util.Scanner;

public class Q16ForEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen sayı giriniz  :");
		int sayi= scanner.nextInt();
		
		int sum=0;
		
		for(int i=0;i<sayi;i++) {
			sum=sum+i;
		}
		
		System.out.println("Girilen sayiların Toplamı:\n" + sum);


	}
}