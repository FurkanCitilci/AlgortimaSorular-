package lesson002;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		// girilen sayıya kada çift sayıları yazdıran program
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı Giriniz");
		
		int sayi=scanner.nextInt();
		
		for(int i=0;i<=sayi;i=i+2) {
			System.out.print(i + " ");
			
		}
		

	}

}
