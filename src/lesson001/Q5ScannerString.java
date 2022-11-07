package lesson001;

import java.util.Scanner;

public class Q5ScannerString {

	public static void main(String[] args) {
		//verilen isim ve soy isim degerini hello (isim) (soyisim)
		/*
		String isim ="Furkan";
		String soyisim= "Çitilci";
			
		System.out.println("Hello " + isim +" " + soyisim);
		*/
		//kullanıcıdan iste
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("isim ve soyisim giriniz");
		String isimSoyisim= scanner.nextLine();
		
		System.out.println("Hello " +"" + isimSoyisim);
		
	
	}

}
