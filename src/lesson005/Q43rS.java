package lesson005;

import java.util.Scanner;

public class Q43rS {

	public static void main(String[] args) {
		// 
		
		String[] dizi = { "Türkiye", "Japonya", "Moğolistan", "Fransa", "Danimarka" };
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen aramak istediğiniz metni giriniz:");
		String metin=scanner.nextLine();
		
		boolean check=true;
		for(int i=0;i<dizi.length;i++) {
			
			if(dizi[i].equalsIgnoreCase(metin)) {
				System.out.println("Girdiğiniz metni içeren indeks  " + dizi[i]);
				check=false;
			}else
				System.out.println("Girdiğiniz metin eşleşmiyor");
			
			
		}
	}

}
