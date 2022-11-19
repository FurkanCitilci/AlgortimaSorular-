package lesson010;

import java.util.Random;

public class Question1 {

	public static void main(String[] args) {
		String[] sinif = {
                "İrfan Mert Namsal",
                "Oguz Furkan TOPRAK",
                "Fatih Çetin",
                "Melihcan ÖZTÜRK",
                "MUSTAFA CAN MAVİLİ",
                "Oğuz TAŞGIN",
                "Buse Çankaya",
                "Sevcan Aslan",
                "Metehan Ölçer",
                "Merve Adler",
                "Mert Taser",
                "Abdulkadir Dilmen",
                "Muhamed Furkan Türkmen",
                "Furkan Çitilci",
                "Ali Öğütçen"
        };
		
		Random random = new Random();
		int sayi=random.nextInt(sinif.length);
		System.out.println(sinif[sayi]);

	}

}
