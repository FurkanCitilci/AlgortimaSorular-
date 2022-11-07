package lesson009;

import java.util.Arrays;

public class Question65 {

	public static void main(String[] args) {
		// dizi öğelerini tersten yazdır
		//tersCveir metodu----> parametre olarak int[] tipinde
		
		//diziyi kullanıcıdan iste öyle çöz.....
		
		int[] dizi = {10, 20, 30, 40, 50};
		
		tersCevir(dizi);

	}

	public static void tersCevir(int[] dizi) {
		int[] tersDizi= new int[dizi.length];
		int j=dizi.length-1;
		for (int i = 0; i < dizi.length; i++) {
			tersDizi[j]=dizi[i];
			j--;
		}
		//System.out.println("Yeni dizi: " + Arrays.toString(tersDizi));
		for (int i = 0; i < tersDizi.length; i++) {
			System.out.print(tersDizi[i] + " " );
			
		}
	}

}
