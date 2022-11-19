package oopVeteriner;

import java.util.ArrayList;

public class Veteriner extends Insan {
	
	private String mezunOldOkul;
	private int calismaYili;
	private ArrayList<Musteri> musterilerArrayList;
	
	public Veteriner(String name, String tcKimlikNo,String mezunOldOkul,int calismaYili) {
		super(name, tcKimlikNo);
		this.mezunOldOkul=mezunOldOkul;
		this.calismaYili=calismaYili;
		this.musterilerArrayList= new ArrayList<Musteri>();
		
	}
	
	public void musterileriListele(Veteriner veteriner) {
		System.out.println(veteriner.getName());
		
		for(Musteri musteri : this.musterilerArrayList) {
				musteri.bilgileriGoster();
		}
	}
	
	public void veterinereMusteriEkle(Musteri musteri) {
		this.musterilerArrayList.add(musteri);
		System.out.println(musteri.getName() + " " + super.getName() + " veterinerine eklendi");
	}

	public ArrayList<Musteri> getMusterilerArrayList() {
		return musterilerArrayList;
	}



	public void setMusterilerArrayList(ArrayList<Musteri> musterilerArrayList) {
		this.musterilerArrayList = musterilerArrayList;
	}



	public String getMezunOldOkul() {
		return mezunOldOkul;
	}

	public void setMezunOldOkul(String mezunOldOkul) {
		this.mezunOldOkul = mezunOldOkul;
	}

	public int getCalismaYili() {
		return calismaYili;
	}

	public void setCalismaYili(int calismaYili) {
		this.calismaYili = calismaYili;
	}
	

	@Override
	public String toString() {
		return "Veteriner [mezunOldOkul=" + mezunOldOkul + ", calismaYili=" + calismaYili + ", getName()=" + getName()
				+ ", getTcKimlikNo()=" + getTcKimlikNo() + "]";
	}

	@Override
	public void bilgileriGoster() {
		System.out.println(toString());
		
	}
	
	
	
	
	

}
