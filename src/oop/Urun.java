package oop;

public class Urun {
	
	public String urunAdi;
	public String urunBarkodNumarasi;
	public String urunKategorisi;
	public int urunFiyati;
	
	public void bilgileriGoster() {
		System.out.println(urunBarkodNumarasi + "Barkod Numaralı "
				+ urunAdi + "\n ürünü" + urunKategorisi + " kategorisindedir" 
				+ "\nFiyatı:" + urunFiyati);
		
		
	}
	
	

}
