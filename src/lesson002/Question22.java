package lesson002;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		// Girilen sayının asal sayı olup olmadığını bulan program
		
		Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi=oku.nextInt();
        int asalDegil = 1;
        for(int i=2; i<sayi; i++){
            if(sayi%i==0){
            	
                  asalDegil=0;
            }
        }
        if(asalDegil==0) {
        	System.out.print(sayi + " Asal Değil ");
        }
        else {
        	System.out.print(sayi + " Asal ");
        }
        
}
}