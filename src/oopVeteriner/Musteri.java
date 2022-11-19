package oopVeteriner;

import java.util.ArrayList;

public class Musteri extends Insan {
	
	private String adres;
	private ArrayList<Hayvan> hayvanlarArrayList;
	
	
	
	public Musteri(String name, String tcKimlikNo,String adres) {
		super(name, tcKimlikNo);
		this.adres=adres;
		this.hayvanlarArrayList = new ArrayList<Hayvan>();
		// TODO Auto-generated constructor stub
	}
	
	public void musteriyeHayvanEkle(Hayvan hayvan) {
		this.hayvanlarArrayList.add(hayvan);
		System.out.println(hayvan.getName() + " " + super.getName() + " müşterisine eklendi");
	}

	public ArrayList<Hayvan> getHayvanlarArrayList() {
		return hayvanlarArrayList;
	}



	public void setHayvanlarArrayList(ArrayList<Hayvan> hayvanlarArrayList) {
		this.hayvanlarArrayList = hayvanlarArrayList;
	}



	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}
	
	

	@Override
	public String toString() {
		return "Musteri [adres=" + adres + ", getName()=" + getName() + ", getTcKimlikNo()=" + getTcKimlikNo() + "]";
	}

	@Override
	public void bilgileriGoster() {
		System.out.println(toString());
		
	}
	
	

	
	

}
