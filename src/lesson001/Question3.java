package lesson001;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		//verilen iki sayıdan hangisinin büyük olduğunu bulan
		/*int sayi1=5;
		
		int sayi2=5;
		System.out.println("sayi1: " + sayi1 + "sayi2:" + sayi2);
		
		if(sayi1>sayi2) {
			System.out.println("sayi1 sayi2 den büyüktür");
			
		}
		else{
			System.out.println("sayi2 sayi1 den büyüktür");
		}
		*/
		
		//kullanıcıdan sayı iste
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. sayyıyı giriniz");
		int sayi1= scanner.nextInt();
		
		System.out.println("2. sayyıyı giriniz");
		int sayi2= scanner.nextInt();
		
		if(sayi1>sayi2) {
			System.out.println("sayi1 sayi2 den büyüktür");
			
		}
		else if(sayi2>sayi1){
			System.out.println("sayi2 sayi1 den büyüktür");
		}
		else
			System.out.println("sayilar eşittir");
	}

}
