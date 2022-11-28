package soru3;

public class Main {

	public static void main(String[] args) {
		
		HayvanatBahcesi hayvanatBahcesi = new HayvanatBahcesi();
		Aslan aslan = new Aslan("Simba", 100, 120, true);
		Yilan yilan = new Yilan("Terminator", 40, 225, false);
		
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(aslan);
		hayvanatBahcesi.bahceyeSurungenEkle(yilan);
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Aslan("Leo", 120, 140, true));
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Maymun("Çiko", 45, 50, true));
		hayvanatBahcesi.bahceyeSurungenEkle(new Yilan("Cobra", 35, 200, true));
		hayvanatBahcesi.bahceyeSurungenEkle(new Kertenkele("Kermit", 2, 35, true));
		
		hayvanatBahcesi.hayvanSesCikarsin(aslan);
		hayvanatBahcesi.hayvanSesCikarsin(yilan);
		System.out.println("\n+-+-+-+-+-+-+-+-+");
		hayvanatBahcesi.hayvaninBilgileriniYazdir("Simba");
		hayvanatBahcesi.hayvaninBilgileriniYazdir("Tiger");
		System.out.println("\n-----------------");
		hayvanatBahcesi.hayvaniHareketEttir("Cobra");
		hayvanatBahcesi.hayvaniHareketEttir("Leo");
		hayvanatBahcesi.hayvaniHareketEttir("Çiko");
		hayvanatBahcesi.hayvaniHareketEttir("Kermit");
		hayvanatBahcesi.hayvaniHareketEttir("Tomy");
		System.out.println("\n*****************");
		hayvanatBahcesi.hayvaninCinsiniBul("Cobra");
		hayvanatBahcesi.hayvaninCinsiniBul("Leo");
		hayvanatBahcesi.hayvaninCinsiniBul("Çiko");
		hayvanatBahcesi.hayvaninCinsiniBul("Kermit");
		hayvanatBahcesi.hayvaninCinsiniBul("Tomy");

	}

}
