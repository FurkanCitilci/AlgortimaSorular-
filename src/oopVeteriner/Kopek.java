package oopVeteriner;

public class Kopek extends Hayvan{

	private int asiSayisi;
	private String cins;
	private String karne;
	private String tur;
	
	public Kopek(String name, boolean kayitliMi, String dogumTarihi,String cins) {
		super(name, kayitliMi, dogumTarihi);
		this.tur="Köpek";
		this.cins=cins;
		// TODO Auto-generated constructor stub
	}

	
	
	public String getKarne() {
		return karne;
	}



	public void setKarne(String karne) {
		this.karne = karne;
	}



	public String getTur() {
		return tur;
	}



	public void setTur(String tur) {
		this.tur = tur;
	}



	public int getAsiSayisi() {
		return asiSayisi;
	}

	public void setAsiSayisi(int asiSayisi) {
		this.asiSayisi = asiSayisi;
	}

	public String getCins() {
		return cins;
	}

	public void setCins(String cins) {
		this.cins = cins;
	}

	@Override
	public String toString() {
		return "Kopek [asiSayisi=" + asiSayisi + ", cins=" + cins + ", karne=" + karne + ", getName()=" + getName() + ", isKayitliMi()="
				+ isKayitliMi() + ", getDogumTarihi()=" + getDogumTarihi() + "]";
	}

	@Override
	public void bilgileriGoster() {
		System.out.println(toString());
		
	}

	@Override
	public void karneOlustur() {
		setKarne("Cinsi" + getCins() + "Türü " + getTur());
		this.karne=cins + " " +tur ;
	}
	
	

}
