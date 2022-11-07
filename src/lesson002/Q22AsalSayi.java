package lesson002;

import java.util.Scanner;

public class Q22AsalSayi {

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
        
        /*
         // diğer alternatif cozum
          Scanner scanner=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num=scanner.nextInt();
        
        int cnt=0;
        
        for(int i=1;i<=num;i++) {
        	if(num%i==0) {
        		cnt++;
        	}
        }
		if(cnt==2) {
			System.out.println("Girdiğiniz sayı asaldır");
		}else
			System.out.println("Girdiğiniz sayı asal değildir");
	
         */
        
}
}