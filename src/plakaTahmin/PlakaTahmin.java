package plakaTahmin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PlakaTahmin {
	
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	
	 int oyunSayisi=1;
	 int hak=3;
	
	 HashMap<Integer, String> sehirler = new HashMap<>();
	 HashMap<Integer, List<String>> tahminler = new HashMap<>();
	
	
	 public PlakaTahmin() {
		 mapOlustur();
	 }
	
	public void mapOlustur() {
		
		//alt+shift+r ile ilgili part tıklayıp seçilir
		sehirler.put(1, "Adana");
        sehirler.put(2, "Adıyaman");
        sehirler.put(3, "Afyonkarahisar");
        sehirler.put(4, "Ağrı");
        sehirler.put(5, "Amasya");
        sehirler.put(6, "Ankara");
        sehirler.put(7, "Antalya");
        sehirler.put(8, "Artvin");
        sehirler.put(9, "Aydın");
        sehirler.put(10, "Balıkesir");
        sehirler.put(11, "Bilecik");
        sehirler.put(12, "Bingöl");
        sehirler.put(13, "Bitlis");
        sehirler.put(14, "Bolu");
        sehirler.put(15, "Burdur");
        sehirler.put(16, "Bursa");
        sehirler.put(17, "Çanakkale");
        sehirler.put(18, "Çankırı");
        sehirler.put(19, "Çorum");
        sehirler.put(20, "Denizli");
        sehirler.put(21, "Diyarbakır");
        sehirler.put(22, "Edirne");
        sehirler.put(23, "Elazığ");
        sehirler.put(24, "Erzincan");
        sehirler.put(25, "Erzurum");
        sehirler.put(26, "Eskişehir");
        sehirler.put(27, "Gaziantep");
        sehirler.put(28, "Giresun");
        sehirler.put(29, "Gümüşhane");
        sehirler.put(30, "Hakkari");
        sehirler.put(31, "Hatay");
        sehirler.put(32, "Isparta");
        sehirler.put(33, "Mersin");
        sehirler.put(34, "İstanbul");
        sehirler.put(35, "İzmir");
        sehirler.put(36, "Kars");
        sehirler.put(37, "Kastamonu");
        sehirler.put(38, "Kayseri");
        sehirler.put(39, "Kırkareli");
        sehirler.put(40, "Kırşehir");
		
	}
	
	public void tahmin() {
		int plaka= random.nextInt(1,41);
		System.out.println(plaka + " Hangi ilimize aittir");
		List<String> tahminler = new ArrayList<>();
		for(int i=hak; i>0;i--) {
			System.out.println(hak-i + 1 + ". hakkınız");
			String sehirTahmin= scanner.nextLine();
			tahminler.add(sehirTahmin);
			
			if(sehirTahmin.equalsIgnoreCase(sehirler.get(plaka))) {
				String message ="Tebrikler" + sehirTahmin + " adlı şehri" + ( hak-i+1);
			}
		}
		
		
		
	}
	
	public void tahminListem() {
		
	}
	
	
	

}
