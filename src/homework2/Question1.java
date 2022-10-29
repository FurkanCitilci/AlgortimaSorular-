package homework2;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// Soru1 (20 puan)
		// kullanıcıdan bir kelime alın
		// eğer kelime a ile başlıyorsa kelimenin son indexini ekrana bastırın

		// eğer kelime b ile başlıyorsa ilk indexi "@" ile değiştirin

		// eğer a veya b ile başlamıyorsa kelimenin birinci indexini bastırın

		// replace("ilk index", "@")
		// charAt()
		// kelime.startsWith("a")
		// length()
		// ********************************************

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütefen Test edilecek kelimeyi giriniz:");
		String kelime = scanner.nextLine();
		System.out.println("Test edilecek kelime :" + kelime);
		System.out.println("****************************************:");

		if (kelime.startsWith("a") || kelime.startsWith("A")) {
			System.out.println(kelime.charAt(kelime.length() - 1));

		} else if (kelime.startsWith("b")) {
			System.out.println(kelime.replaceFirst("b", "@"));
		} else {
			System.out.println(kelime.charAt(0));

		}
		scanner.close();

	}

}
