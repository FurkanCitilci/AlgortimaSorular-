package soru4;

import java.util.HashMap;

public class EkonomiYolcu extends Yolcu {

	private final static int EKONOMIFIYAT = 100;
	HashMap<EFirmaAdi, Integer > hashMap = new HashMap<EFirmaAdi, Integer >();
	
	public EkonomiYolcu(int id, String ad, String soyAd) {
		super(id, ad, soyAd);
		// TODO Auto-generated constructor stub
	}
	
	

	public static int getEkonomifiyat() {
		return EKONOMIFIYAT;
	}



	@Override
	public void yolcuBilgileriniGetir() {

		System.out.println("Yolcu bilgileri-----> Ekonomi Yolcusu " + getAd() + "Biletleri: " + hashMap );
		
	}

	@Override
	public void biletAl(EFirmaAdi firmaAdi) {
		
		if(this.getCheckIn()) {
			System.out.println("Daha önce bilet aldınız, ve check in yaptınız");
			
		}else {
			
			if(hashMap.containsKey(firmaAdi)) {
				
				int toplam = this.getBASEFIYAT() + getEkonomifiyat() ;
				hashMap.put(firmaAdi, hashMap.get(firmaAdi)+toplam);
				System.out.println(getAd() + " adlı yolcu için " + firmaAdi + " Ekonomi sınıfından bilet almıştır----->" + hashMap);
				
			}else {
				
				int toplam = this.getBASEFIYAT() + getEkonomifiyat() ;
				hashMap.put(firmaAdi, toplam);
				System.out.println(getAd() + " adlı yolcu için " + firmaAdi + " Ekonomi sınıfından bilet almıştır----->" + hashMap);
				
			}
				
				
				
				
			
		}
		
		
		
	}

	@Override
	public void checkInYap() {
		
		if(getCheckIn()) {
			System.out.println("Daha önce checkIn yaptınız uçağa geçebilirsiniz");
		}else {
			
			setCheckIn(true);
			System.out.println("Check in yapıldı iyi uçuşlar...");
			
		}
		
	}

	@Override
	public void ucagaBin() {
		
		if(getCheckIn()) {
			System.out.println(getAd() + " " + getKoltukNo() + " numaralı koltkta ucağa binebilirsiniz");
		}else
			System.out.println("Uçağa binmek için lütfen checkIn yapınız!!!!");
		
		
	}

	
}
