package oopInterface;

import java.util.ArrayList;

public class Villa extends Bina implements IBinaIslemer {
	
	private String bahcivan;
	private final static int AIDAT_ODEMESI=1000;
	private final static int GOREVLI_ODEMESI=1000;
	private ArrayList<User> ailelerArrayList;
	
	
	public Villa(String adres, String sehir, String postaKodu, int aylikKira, String contactName, String contactPhone,String bahcivan) {
		
		super(adres, sehir, postaKodu, aylikKira, contactName, contactPhone);
		this.setBahcivan(bahcivan);
		ailelerArrayList = new ArrayList<>(); 
	}


	public String getBahcivan() {
		return bahcivan;
	}


	public void setBahcivan(String bahcivan) {
		this.bahcivan = bahcivan;
	}


	public static int getAidatOdemesi() {
		return AIDAT_ODEMESI;
	}


	public static int getGorevliOdemesi() {
		return GOREVLI_ODEMESI;
	}


	@Override
	public void kiraOdeme() {
		System.out.println(AIDAT_ODEMESI + GOREVLI_ODEMESI + this.getAylikKira());;
		
		
	}


	@Override
	public void binaBilgileriGoster() {
		System.out.println("Adres : " + getAdres() + " Şehir : " + getSehir() + " Gorevli : " + getBahcivan());
		
		
	}


	@Override
	public void iletisimBilgileriGoster() {
		System.out.println("İlgili Kişi: " + getContactName() + " iletişim numarası :" + getContactPhone());
		
	}


	@Override
	public void gorevliMaasOde() {
		System.out.println(getBahcivan() + "'nin maaşı ödendi "  + (getAylikKira()) + GOREVLI_ODEMESI );
		
	}


	@Override
	public void insanEkle(User user) {
		
		if(user.getClass()== Kisi.class) {
			System.out.println("Viilaya Kisi eklenemez!!");
		}else {
			ailelerArrayList.add(user);
		}
		
		
	}


	@Override
	public void yasayanlariGoster() {
		System.out.println("\n***Villa da yaşayan aileler***\n");
		for(int i =0; i<ailelerArrayList.size();i++) {
			System.out.println("Aile soyadı : " + ailelerArrayList.get(i).getSoyad());
			
		}
		
		
	}
	
	

}
