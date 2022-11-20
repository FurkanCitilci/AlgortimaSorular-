package com.furkancitilci.odevOOP;

public abstract class HavaArarci {
	
	private String id;
	private int agirlik;
	private int menzil;
	private String gorevAlani;
	
	
	
	
	public HavaArarci(String id, int agirlik, int menzil, String gorevAlani) {
		super();
		this.id = id;
		this.agirlik = agirlik;
		this.menzil = menzil;
		this.gorevAlani = gorevAlani;
	}
	
	public abstract String yakitTipi();
	public abstract String motorTipi();
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAgirlik() {
		return agirlik;
	}
	public void setAgirlik(int agirlik) {
		this.agirlik = agirlik;
	}
	public int getMenzil() {
		return menzil;
	}
	public void setMenzil(int menzil) {
		this.menzil = menzil;
	}
	public String getGorevAlani() {
		return gorevAlani;
	}
	public void setGorevAlani(String gorevAlani) {
		this.gorevAlani = gorevAlani;
	}
	
	
	

}
