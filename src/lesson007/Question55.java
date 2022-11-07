package lesson007;

import java.util.Iterator;

public class Question55 {

	public static void main(String[] args) {
		// verilen iki farklı array de tekrar eden sayıları bul

		int dizi1[] = { 50, 60, 3, 4, 3, 9, 8 };
		int dizi2[] = { 1, 2, 50, 60, 3, 8, 9 };
		
		
		
		for (int i = 0; i < dizi1.length; i++) {
			for (int j = 0; j < dizi2.length; j++) {
				if (dizi1[i] == dizi2[j]) {
			
					System.out.println("Tekrar eden sayi: " + dizi1[j]);
				}

			}

		}

	}

}
