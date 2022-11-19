package oopMac;

public class Takim {
	
	private String name;
	private int puan;
	private int kasa;
	private String sampiyonTakim;
	
	
	
	
	public String getSampiyonTakim() {
		return sampiyonTakim;
	}

	public void setSampiyonTakim(String sampiyonTakim) {
		this.sampiyonTakim = sampiyonTakim;
	}

	public Takim(String name) {
		this.name=name;
		this.puan=0;
		this.kasa=0;
		
	}
	
	public int getKasa() {
		return kasa;
	}
	public void setKasa(int kasa) {
		this.kasa = kasa;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPuan() {
		return puan;
	}
	public void setPuan(int puan) {
		this.puan = puan;
	}
	
	

}
