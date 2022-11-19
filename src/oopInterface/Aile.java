package oopInterface;

public class Aile extends User {
	
	private String anneAdi;
	private String babaAdi;
	private String cocukAdi;
	
	public Aile(String soyad, String anneAdi, String babaAdi, String cocukAdi) {
		super(soyad);
		this.setAnneAdi(anneAdi);
		this.setBabaAdi(babaAdi);
		this.setBabaAdi(babaAdi);
		
	}

	public String getAnneAdi() {
		return anneAdi;
	}

	public void setAnneAdi(String anneAdi) {
		this.anneAdi = anneAdi;
	}

	public String getBabaAdi() {
		return babaAdi;
	}

	public void setBabaAdi(String babaAdi) {
		this.babaAdi = babaAdi;
	}

	public String getCocukAdi() {
		return cocukAdi;
	}

	public void setCocukAdi(String cocukAdi) {
		this.cocukAdi = cocukAdi;
	}
	
	

}
