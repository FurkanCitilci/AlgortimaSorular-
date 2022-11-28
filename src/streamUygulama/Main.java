package streamUygulama;

public class Main {

	public static void main(String[] args) {
		
		//sepet diye class oluştur
		//ürünleri array de tutalım enum array i olsun
		//değerler EUrun sınıfından alacak
		//yine aynı şekilde ürünler diye bir listemiz olsun enum array inden ürünleri taşıycaz
		//map olarak sepeti tutacağız, burda ürün ismi ve adet olacak şekilde(sepetMap)
		//yine ürünleri hem ismini hemde fiyatlarını tutmak için bir map oluştur.
		
		Sepet sepet = new Sepet();
		
		//hazır oluşmasını istersek sepet constructor içinde yazarız
		
		//sepet.sepetiAdedi();
		sepet.sepeteUrunEkle();
		sepet.sepeteUrunEkle();
		sepet.sepeteUrunEkle();
		sepet.sepeteUrunEkle();
		sepet.sepeteUrunEkle();
		sepet.sepetiGoster();
		sepet.sepetiAdedi();
		sepet.sepetTutari();

	}

}
