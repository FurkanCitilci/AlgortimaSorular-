package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiOrnek2 {

	public static void main(String[] args) {
		
		List<Integer> sayilar = new ArrayList<>();
		sayilar.add(48);
		sayilar.add(30);
		sayilar.add(25);
		sayilar.add(15);
		
		//5 ile bölünebilen sayıları bir listeye atalım bir listeye atalım
		
		List<Integer> beseBolunen =sayilar.stream().filter(sayi -> sayi%5==0).collect(Collectors.toList());
		System.out.println(beseBolunen);
		
		//sayıların kendisi ile çarpımını bul
		//içerde işlem yapmak için map kullan
		List<Integer> carpimListe =sayilar.stream().map(sayi -> sayi*sayi).collect(Collectors.toList());
		System.out.println(carpimListe);
		
		//kaç tane 5 ebölüne sayı var onu bul
		//System.out.println(beseBolunen.size());
		//long alıyoruz çünkü count long return eder
		long beseBolunenler = sayilar.stream().filter(sayi -> sayi%5==0).count();
		System.out.println(beseBolunenler);

	}

}
