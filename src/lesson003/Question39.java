package lesson003;

import java.security.spec.EncodedKeySpec;
import java.util.Scanner;

public class Question39 {

	public static void main(String[] args) {
		// girilen kelimenin ilk önce hepsini büyük harfe çevir
		//daha sonra küçük harfe çevir
		
		//
		//çıktı
		//hepsi büyük--->JAVA
		//hepsi küçük---> java
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Kelimeyi giriniz");
		String kelime=scanner.nextLine();
		
		String enBuyuk=kelime.toUpperCase();
		String enKucuk=kelime.toLowerCase();
		
		System.out.println("Hepsi Büyük:" + enBuyuk);
		System.out.println("Hepsi Küçük:" + enKucuk);

	}

}
