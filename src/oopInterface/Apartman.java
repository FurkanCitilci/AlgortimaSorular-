package oopInterface;

import java.util.ArrayList;

public class Apartman extends Bina implements IBinaIslemer {
	
	private String gorevli;
	private final static int Aidat_Odemesi=500;
	private final static int Gorevli_Odemesi=500;
	private ArrayList<User> kisilerArrayList;
	
	
	public Apartman(String adres, String sehir, String postaKodu, int aylikKira, String contactName,
			String contactPhone,String gorevli) {
		super(adres, sehir, postaKodu, aylikKira, contactName, contactPhone);
		this.setGorevli(gorevli);
		kisilerArrayList = new ArrayList<>();
		
		
	}


	public String getGorevli() {
		return gorevli;
	}


	public void setGorevli(String gorevli) {
		this.gorevli = gorevli;
	}


	@Override
	public void kiraOdeme() {
		System.out.println(Aidat_Odemesi + Gorevli_Odemesi + this.getAylikKira());
		
	}


	@Override
	public void binaBilgileriGoster() {
		//adres,şehir,gorevli ismi
		System.out.println("Adres : " + getAdres() + " Şehir : " + getSehir() + " Gorevli : " + getGorevli());
		
	}


	@Override
	public void iletisimBilgileriGoster() {
		//isim ve numara
		System.out.println("İlgili Kişi: " + getContactName() + " iletişim numarası :" + getContactPhone());
		
	}


	@Override
	public void gorevliMaasOde() {
		System.out.println(getGorevli() + "'nin maaşı ödendi "  + (getAylikKira()) + Gorevli_Odemesi );
	
		
	}


	@Override
	public void insanEkle(User user) {
		
		if(user.getClass()== Aile.class) {							//if(user instanceof Aile)
			System.out.println("Aapartmana aile eklenemez!!");
		}else {
			kisilerArrayList.add(user);
		}
		
		
	}


	@Override
	public void yasayanlariGoster() {
		
		
	}
	
	

}
