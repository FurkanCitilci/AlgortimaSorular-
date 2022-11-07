package lesson008;

import java.util.Scanner;

public class Question63 {



	private static void asalMi(int sayi) {

    
        int sayac = 0;
        int temp=0;
        for(int i = 2; i < sayi; i++)
        {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        if(sayac == 1) {
        	temp=sayi;
        	System.out.println("Girilen değer asaldır");
        }else
        	System.out.println("Girilen değer asal değildir");
        
	
	}
	
	public static void main(String[] args) {
		// asalMi methodu yazaLIM, sayının asal olup olmadığını kontrol
		// daha sonra main içinde for işlemi yapacağız
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
	    int sayi = scan.nextInt();
		asalMi(sayi);
		


	}
}
