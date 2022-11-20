package com.furkancitilci.odevOOP;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ucak extends HavaArarci implements IStandart {
	
	private int camSayisi;
	private int kapasite;
	private String tipi;
	private ArrayList<Koltuk> koltuklar = new ArrayList<>();


	public Ucak(String id, int agirlik, int menzil, String gorevAlani,int camSayisi,int kapasite,String tipi) {
		super(id, agirlik, menzil, gorevAlani);
		
		this.camSayisi=camSayisi;
		this.kapasite=kapasite;
		this.tipi=tipi;
		
		
		
	}
	public void oturmaBolumu(Koltuk koltuk) {
		if(koltuk.getBussines()+koltuk.getEconmy()+koltuk.getFirstClass() < this.kapasite) {
			koltuklar.add(koltuk);
			System.out.println("Bölüm oluşturuldu");
		}else
			System.out.println("Girilen koltuk sayısı kapasiteyi aşıyor!!");
		
	}
	public void camSayisiDegistir(Ucak ucak, int miktar) {
		ucak.setCamSayisi(ucak.getCamSayisi()+ miktar);
		System.out.println("Uçağın cam sayısı" + miktar + " kadar artırıldı");
		
	}

	public int getCamSayisi() {
		return camSayisi;
	}

	public void setCamSayisi(int camSayisi) {
		this.camSayisi = camSayisi;
	}

	public int getKapasite() {
		return kapasite;
	}

	public void setKapasite(int kapasite) {
		this.kapasite = kapasite;
	}


	public String getTipi() {
		return tipi;
	}

	public void setTipi(String tipi) {
		this.tipi = tipi;
	}

	@Override
	public String yakitTipi() {
		// TODO Auto-generated method stub
		return "Jet yakıtı";
	}

	@Override
	public String motorTipi() {
		// TODO Auto-generated method stub
		return "gaz türbinli motor";
	}

	@Override
	public int maxYukseklik() {
		
		return 12000;
		
	}

	@Override
	public void sertifika() {
		
		System.out.println("SHGMI ONAYI");
		System.out.println("ICAO ONAYI");
		
	}

	@Override
	public void ucusIzni() {
		
		System.out.println("ULUSALARASI UÇU İZNİ");
		
	}
	
	

}
