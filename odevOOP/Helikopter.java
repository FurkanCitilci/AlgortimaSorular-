package com.furkancitilci.odevOOP;

public class Helikopter extends HavaArarci implements IStandart {
	
	private int kapasite;
	private int pervaneSayisi;
	
	

	public Helikopter(String id, int agirlik, int menzil, String gorevAlani,int kapasite,int pervaneSayisi) {
		super(id, agirlik, menzil, gorevAlani);
		this.kapasite=kapasite;
		this.pervaneSayisi=pervaneSayisi;
		
	}

	public void kapasiteArtir(Helikopter helikopter, int artis) {
		helikopter.setKapasite(helikopter.getKapasite() + artis); 
		if(helikopter.getKapasite()<=15) {
			System.out.println("Helikopter kapasitesi " + artis + " kadar artırıldı");
		}else if(helikopter.getKapasite()>15)
			System.out.println("Sağlık helikopteri kapasitesi max 15 olabilir.");
		
		
	}

	public int getKapasite() {
		return kapasite;
	}


	@Override
	public String toString() {
		return "Helikopter [kapasite=" + kapasite + ", pervaneSayisi=" + pervaneSayisi + ", getKapasite()="
				+ getKapasite() + ", getPervaneSayisi()=" + getPervaneSayisi() + ", getId()=" + getId()
				+ ", getAgirlik()=" + getAgirlik() + ", getMenzil()=" + getMenzil() + ", getGorevAlani()="
				+ getGorevAlani() + "]";
	}


	public void setKapasite(int kapasite) {
		this.kapasite = kapasite;
	}




	public int getPervaneSayisi() {
		return pervaneSayisi;
	}


	public void setPervaneSayisi(int pervaneSayisi) {
		this.pervaneSayisi = pervaneSayisi;
	}



	@Override
	public String yakitTipi() {
		// TODO Auto-generated method stub
		return "Jet-A1";
	}


	@Override
	public String motorTipi() {
		// TODO Auto-generated method stub
		return "Turboşaft";
	}


	@Override
	public int maxYukseklik() {
		
		return 6000;
		
	}


	@Override
	public void sertifika() {
		
		System.out.println("Nato sertifikası");
		System.out.println("sağlık güvenliği sertifikası");
		
	}


	@Override
	public void ucusIzni() {
		System.out.println("shgmi uçuş izni");
		
	}
	
	

}
