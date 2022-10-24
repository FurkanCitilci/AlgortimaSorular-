package lesson001;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// girilen sayının tek mi çift olduğunu bulan program
		Scanner scanner = new Scanner(System.in);
		System.out.println("sayi giriniz");
		
		int sayi= scanner.nextInt();
		
		if(sayi%2==0) {
			System.out.println("çift sayıdır");
			
		}
		else
			System.out.println("tek sayıdır");
	

	}

}
