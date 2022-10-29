package lesson004;

import java.util.Scanner;

public class Question35 {

	public static void main(String[] args) {
		// kullanıcıdan veri al
		//java
		//0. indeksi j
		//1. indeksi a
		// 2. indeksi v ....
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen veri giriniz:");
		String veri=scanner.nextLine();
		int i=0;
		for(;i<veri.length();i++) {
			System.out.println(i +". indeks " + veri.charAt(i));
		}

	}

}
