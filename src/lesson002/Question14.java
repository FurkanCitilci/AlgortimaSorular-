package lesson002;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		// girilen 3 sayıyı büyükten küçüğe sırala
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen 3 tane sayı giriniz");
		int sayi1=scanner.nextInt();
		int sayi2=scanner.nextInt();
		int sayi3=scanner.nextInt();
		
		if(sayi1>sayi2 && sayi1>sayi3) {
			if(sayi2>sayi3) {
				System.out.println(sayi1 + ">" + sayi2 + " >" + sayi3);
			}
			else if(sayi2>sayi3) {
				System.out.println(sayi1 + ">" + sayi3 + " >" + sayi2);
			}
		}
		else if(sayi2>sayi1 && sayi2>sayi3) {
			if(sayi1>sayi3) {
				System.out.println(sayi2 + ">" + sayi1 + " >" + sayi3);
			}
			else if(sayi3>sayi1) {
				System.out.println(sayi2 + ">" + sayi3 + " >" + sayi1);
			}
		}
		else if(sayi3>sayi1 && sayi3>sayi2) {
			if(sayi1>sayi2) {
				System.out.println(sayi3 + ">" + sayi1 + " >" + sayi2);
			}
			else if(sayi2>sayi1) {
				System.out.println(sayi3 + ">" + sayi2 + " >" + sayi1);
			}
		}
		
		

	}

}
