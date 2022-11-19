package oopInterface;

import java.util.ArrayList;

public class Main {
	
	public static void insanEkle(IBinaIslemer binaIslemer, User user) {
		
		
		
	}

	public static void main(String[] args) {
		
		Apartman apartman1 = new Apartman("Sincan", "ankara", "06524", 3000, "Hasan", "06262", "Mehmet");
		System.out.println(apartman1.toString());
		
		Villa villa1 = new Villa("Umitköy", "Ankara", "05750", 5000, "ali", "0556454", "Hüseyin");
		System.out.println(villa1.toString());
		
		Kisi kisi1 = new Kisi("Çitilci","Furkan", "55555");
		Aile aile1 = new Aile("Çitilci", "Büşra", "Furkan", "cocuk");
		
//		apartman1.insanEkle(kisi1);
//		villa1.insanEkle(aile1);
//		villa1.yasayanlariGoster();
		
		apartman1.insanEkle(aile1);
		villa1.insanEkle(kisi1);
		
		//Bina sınıfından
		//kiraOde abstarct metodu 
		//apartman sınıfında ----
		
		//IBinaislemler diye interface oluştur
		//içinde 
		//void binabilgileri göster
		//void iletişim biliglileri göster
		//void gorevliMaasöde
		
		//apartmanda kişiler oturacak
		//bunları tutabileceğimiz field
		
		//villada aile oturacak
		//bunu tutabilecek field
		
		//ınterface içine 
		//void insanEkle(User user)
		//void yasaynlarıGoster
		
		//apartmana aile ekleyeme
		//villaya da kişi ekleme yasak
		
		//apartman1.kiraOdeme();
		
		
		
		
	}

}
