package etut;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// taban sayısı al
		//üs sayısıs al
		
		//taban^üs=sonuc
		
		//for ile çöz
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen taban sayısı giriniz");
		int taban=scanner.nextInt();
		System.out.println("Lütfen üs sayısı giriniz");
		int us=scanner.nextInt();
		int sonuc=1;
		for(int i=0;i<us;i++) {
			sonuc=taban*sonuc;
		}
		System.out.println(sonuc);
		scanner.close();
	}

}
