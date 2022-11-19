package oopInterface;

public abstract class Bina {
	
	private String adres;
	private String sehir;
	private String postaKodu;
	private double aylikKira;
	private String contactName;
	private String contactPhone;
	private final static int TEMEL_ODEME=1500;
	
	
	public Bina(String adres, String sehir, String postaKodu, double aylikKira, String contactName, String contactPhone) {
		super();
		this.adres = adres;
		this.sehir = sehir;
		this.postaKodu = postaKodu;
		this.aylikKira = aylikKira;
		this.contactName = contactName;
		this.contactPhone = contactPhone;
	}
	
	public abstract void kiraOdeme();


	public String getAdres() {
		return adres;
	}


	public void setAdres(String adres) {
		this.adres = adres;
	}


	public String getSehir() {
		return sehir;
	}


	public void setSehir(String sehir) {
		this.sehir = sehir;
	}


	public String getPostaKodu() {
		return postaKodu;
	}


	public void setPostaKodu(String postaKodu) {
		this.postaKodu = postaKodu;
	}


	public double getAylikKira() {
		return aylikKira;
	}


	public void setAylikKira(double aylikKira) {
		this.aylikKira = aylikKira;
	}


	public String getContactName() {
		return contactName;
	}


	public void setContactName(String contactName) {
		this.contactName = contactName;
	}


	public String getContactPhone() {
		return contactPhone;
	}


	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}


	public static int getTemelOdeme() {
		return TEMEL_ODEME;
	}


	@Override
	public String toString() {
		return "Bina [adres=" + adres + ", sehir=" + sehir + ", postaKodu=" + postaKodu + ", aylikKira=" + aylikKira
				+ ", contactName=" + contactName + ", contactPhone=" + contactPhone + "]";
	}
	
	
	
	

}
