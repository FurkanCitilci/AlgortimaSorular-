package com.furkancitilci;

public class Soru2 {

	private static void tekrarEdenSayiyiBul(int dizi[]) {

		int tekrarEdenSayi = 0;
		boolean flag = true;											//tekrar eden sayı için bir flag

		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi.length - 1; j++) {
				if (i == j) {											//her sayı kendi ile kıyaslanma koşulu

				} else {												//her sayının kendisi haricinde ile kıyaslanması
					if (dizi[i] == dizi[j]) {							// dizide tekrar eden sayıyı bul
						if (flag == false) {							// sonraki tekrar edenleri almamak için geçmek için flag kullandım
								
							break;										
						}
						tekrarEdenSayi = dizi[i];
						flag = false;
						break;
					}

				}

			}

		}

		if (flag == false) {
			System.out.println("Dizide ilk tekrar eden sayı : " + tekrarEdenSayi);
		} else {
			System.out.println("Dizide Tekrar eden sayı yok!");
		}

	}

	public static void main(String[] args) {

		//int sayiDizisi[] = { 9, 5, 7, 3, 18, 2, 0, 7 };
		int sayiDizisi[] = { 0, 1, 5, 3 };

		tekrarEdenSayiyiBul(sayiDizisi);

	}

}
