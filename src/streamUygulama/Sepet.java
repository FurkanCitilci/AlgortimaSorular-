package streamUygulama;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;





public class Sepet {
	
	EUrun product[] = EUrun.values(); 
	
	List<Urun> urunler = new ArrayList<>();
	Map<String, Integer> sepetMap = new HashMap<>();
	Map<String, Double> urunMap = new HashMap<>();
	
	
	public Sepet() {
		urunOlustur();
		urunFiyatMapOlustur();
	}
	
	public void urunOlustur() {
		// product array ini liste çevir
		// daha sonra streame cevircez içinde işlem yapabilecek duruma geleceğiz
		// Urun nesnesi oluştururken değerleri EUrun içinden alcaz
		// .map(nesne uretilecek

//		List<EUrun> eUrun = Arrays.asList(product);
//		this.urunler = eUrun.stream().map((urun -> new Urun(urun.toString(), urun.getFiyat()))).collect(Collectors.toList());
//		
//		eUrun.forEach(s->System.out.println(s.toString()));

		// veritabanına kaydetme gibi birşey
		urunler = Arrays.asList(product).stream().map(s -> new Urun(s.name(), s.fiyat)).collect(Collectors.toList());

		urunler.forEach(s -> System.out.println(s.getName()));

	}
	
	public void fiyatListesi() {
		
		urunMap.forEach((key,value) -> System.out.println(key + "  " + value));
		
		//urunMap.entrySet().forEach(System.out::println);
	}
	
	
	//sepete ürün ekleyelim
	//ürün yoksa sepete ekleyemezsin
	//eğer sepette aynı üründen varsa adet sayısı artır
	
	
	public void sepeteUrunEkle() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Eklemek istediğiniz ürünü giriniz");
		String urun=scanner.nextLine();
		
		
		if(sepetMap.containsKey(urun)) {
			
			sepetMap.put(urun, sepetMap.get(urun)+1);
			System.out.println(urun + "--->Sepete ürün eklendi");
			
		}else {
			if(urunMap.containsKey(urun)) {
				sepetMap.put(urun, 1);
				System.out.println(urun + "--->Sepete ürün eklendi");
			}else
				System.out.println("Listemizde böyle bir ürün bulunmamaktadır");
		}
				
		
	}
	
	public void sepetiAdedi() {
		//sepette kaç adet ürün var
		
//		System.out.println("\nSepetteki Ürün Sayısı:");
//		long adet = sepetMap.entrySet().stream().filter(x -> x.getValue()>0).count();
//		System.out.println(adet);
		System.out.println("\nSepetteki Ürün Sayısı:");
		//reduce metodu toplaya toplaya gidiyor....
		int sum = sepetMap.values().stream().reduce(0, Integer::sum);
		System.out.println(sum);
	
	}
	

	public void urunFiyatMapOlustur() {
		//bir map yapısı oluşturalım isim ve fiyat tutsun
		//cips-20
		//kola-10
		
		urunMap = urunler.stream().collect(Collectors.toMap(urun -> urun.getName(), urun -> urun.getPrice()));
		urunMap.forEach((key,value) -> System.out.println(key + "  " + value));
		
	
	}
	
	public void sepetTutari() {
		//sepete eklenen ürünlerin fiyatı
	
		List<Double> fiyatlar = sepetMap.entrySet().stream().map(s->{
			
			return urunMap.get(s.getKey()) * s.getValue();
		}).collect(Collectors.toList());
		
		Double toplam = fiyatlar.stream().reduce((s1, s2) -> s1 + s2).get();
		System.out.println("Sepet Toplamı:" + toplam);
		
		
		//System.out.println(commonMap);
		//int sum = sepetMap.values().stream().reduce(0, Integer::sum);
		//int sum = sepetMap
	}
	
	public void sepetiGoster() {
		
		System.out.println("\n*****Sepetiniz*****\n");
		
		//sepetMap.forEach((key,value) -> System.out.println(key + "  " + value));
		sepetMap.entrySet().forEach(System.out::println);
		
		}
	
	
	
	public void fiyati50denBuyukOlanlariListele() {
		
		List<Urun> liste = urunler.stream().filter(x->x.getPrice()>50).collect(Collectors.toList());
		System.out.println("50 den büyük liste--->" + liste);
		
		//alternatif çözüm
//		List<Entry<String , Double>> ellidenBuyukler = urunMap.entrySet()
//				.stream().filter(x->x.getValue()>50)
//				.collect(Collectors.toList());
//		System.out.println("50 deb büyük olanlar" + ellidenBuyukler);
		
	}
	public void fiyati50denBuyukOlanlarinOraniListele() {
		List<Urun> liste = urunler.stream().filter(x->x.getPrice()>50).collect(Collectors.toList());
		double result = liste.stream().collect(Collectors.averagingDouble(Urun :: getPrice));
		System.out.println("50 den büyüklerin ortlama fiyatları" + result);
	}
	
	
	  
	

}
