package lesson004;

import java.util.Scanner;

public class Question38 {

	public static void main(String[] args) {
		// kelimeyi kullanıcıdan al
		// kullanıcıdan alınan kelimede istenilen harfin kaç tane olduğunu bul

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Kelimeyi giriniz");
		String kelime = scanner.nextLine();

		System.out.println("Bulmak istediğiniz harfi giriniz");
		String harf = scanner.nextLine();
		int sayac = 0;
		for (int i = 0; i < kelime.length(); i++) {
			if (harf.charAt(0)==kelime.charAt(i)) {
				sayac++;
				
			}

		}
		System.out.println(sayac);
	}

}
