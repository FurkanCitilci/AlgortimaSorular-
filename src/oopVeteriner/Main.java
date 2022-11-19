package oopVeteriner;

public class Main {
	
	public static void main(String[] args) {
		
		//hem kedi sınıfında hemde köpek sınıfında 
		//bu nesneleri oluştururken tür kediyse kedi köpekse köpek atanacak
		
		//hayvan sınıfında 2 abstract metod yaz
		//bilgileri göster
		//tostring metodu ile bilgileri göster
		//diğer metodda karneOluştur
		//kopeğin cinsini ve türünü al otomatik karne oluştur
		
		Kedi kedi = new Kedi("Boncuk", true, "2010", "Tekir");
		Kedi kedi2 = new Kedi("Şanslı", false, "2005", "van kedisi");
		Kedi kedi3 = new Kedi("Karabaş", false, "2010", "ankara kedi");
		kedi.karneOlustur();
		kedi.bilgileriGoster();
		
		Kopek kopek = new Kopek("xyz", true, "2010", "golden");
		Kopek kopek2 = new Kopek("Şanslı", false, "2005", "Tekir");
		Kopek kopek3 = new Kopek("Karabaş", false, "2010", "Tekir");
		
		
		//insan sınıfında bilgileri göster abstract
		Veteriner veteriner1 = new Veteriner("Ankara veteriner", "626265", "ESOGU", 5);
		Musteri musteri1 = new Musteri("Furkan", "26526512", "Sivas");
		Musteri musteri2 = new Musteri("Büşra", "26526512", "Sivas");
		
		musteri1.bilgileriGoster();
		veteriner1.bilgileriGoster();
		
		musteri1.musteriyeHayvanEkle(kedi);
		musteri2.musteriyeHayvanEkle(kopek);
		
		veteriner1.veterinereMusteriEkle(musteri2);
		veteriner1.veterinereMusteriEkle(musteri1);
		
		veteriner1.musterileriListele(veteriner1);
		
		//main dışında karne oluştur diye metod oluştur
		//gelen parametreye göre hangi sınıfın metodunu çağırdığını anlasın
		//müşterinin hayvanları olabilir
		//müşteri sınıfına arraylist aç
		//daha sonra bu sınıf içinde hayvan ekle metodu açalım
		//bu hayvanları arraylist içinde saklayalım
		
		//vetirnerlerinde müsterileri olsun
		// veterinerin müşterilerini listele
	}

}
