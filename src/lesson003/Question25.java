package lesson003;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		// girilen sayının faktöriyelini hesapla
		// while ile yap
		
		Scanner scanner=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi=scanner.nextInt();
        int fakt=1;
        
        while(sayi!=0) {
        	fakt=fakt*sayi;
        	sayi--;
        	
        }
        System.out.println("Girilen Sayının Faktöriyeli:" + fakt);
        scanner.close();
	}

}
