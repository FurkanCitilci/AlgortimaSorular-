package collections;

public class Hasta  implements Comparable<Hasta>{
	
	private String hastaAdi;
	private String sikayet;
	private int oncelik;
	
	
	
	public Hasta(String hastaAdi, String sikayet, int oncelik) {
		super();
		this.hastaAdi = hastaAdi;
		this.sikayet = sikayet;
		this.oncelik = oncelik;
	}


	@Override
	public String toString() {
		return "Hasta [hastaAdi=" + hastaAdi + ", sikayet=" + sikayet + ", oncelik=" + oncelik + "]";
	}
	
	
	public String getHastaAdi() {
		return hastaAdi;
	}
	public void setHastaAdi(String hastaAdi) {
		this.hastaAdi = hastaAdi;
	}
	public String getSikayet() {
		return sikayet;
	}
	public void setSikayet(String sikayet) {
		this.sikayet = sikayet;
	}
	public int getOncelik() {
		return oncelik;
	}
	public void setOncelik(int oncelik) {
		this.oncelik = oncelik;
	}


	@Override
	public int compareTo(Hasta o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
