package lesson003;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		//girilen sayının basamaklarının toplamını bul
		
		// do while
		//755----7+5+5
		
		Scanner scanner=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi=scanner.nextInt();
        
        int kalan=0;
        int top=0;
        
        do {
        	kalan=sayi%10;
        	sayi=sayi/10;
        	top+=kalan;
        	
			
		} while (sayi!=0);
        System.out.println("Basamakların Toplamı:" + top);
        scanner.close();
	}

}
