package soru3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class HayvanatBahcesi {
	
	public ArrayList<MemeliHayvan> memeliHayvanlarArrayList = new ArrayList<>();
	public ArrayList<Surungen> surungenlerArrayList = new ArrayList<>();
	public Hayvan hayvan = null;
	
	
	public void bahceyeMemeliHayvanEkle(MemeliHayvan m) {
		memeliHayvanlarArrayList.add(m);
	}
	
	public void bahceyeSurungenEkle(Surungen s) {
		surungenlerArrayList.add(s);
	}
	
	public void hayvanSesCikarsin(Hayvan h) {
		h.sesCikar();
		
	}
	
	public void hayvaninCinsiniBul(String hayvanAdi){
		
		List<Hayvan> filtrelenmisListenMemeli = memeliHayvanlarArrayList.stream().filter(ogrenci -> ogrenci.getAd().contains(hayvanAdi)).collect(Collectors.toList());
		
		List<Hayvan> filtrelenmisListeSurungen = surungenlerArrayList.stream().filter(ogrenci -> ogrenci.getAd().contains(hayvanAdi)).collect(Collectors.toList());
	
		if(filtrelenmisListenMemeli.isEmpty() && filtrelenmisListeSurungen.isEmpty()) {
			System.out.println(hayvanAdi + " adlı hayvan hayvanat bahçesinde yok");
		}else if(filtrelenmisListenMemeli.isEmpty()){
			
			System.out.println(hayvanAdi + " bir sürüngen");
			
		}else {
			System.out.println(hayvanAdi + " bir Memeli Hayvandır");	
		}
			
		
	}
	
	public void hayvaninBilgileriniYazdir(String hayvanAdi) {
		
		
			List<Hayvan> filtrelenmisListenMemeli = memeliHayvanlarArrayList.stream().filter(ogrenci -> ogrenci.getAd().contains(hayvanAdi)).collect(Collectors.toList());
		
			List<Hayvan> filtrelenmisListeSurungen = surungenlerArrayList.stream().filter(ogrenci -> ogrenci.getAd().contains(hayvanAdi)).collect(Collectors.toList());
		
			
			if(filtrelenmisListenMemeli.isEmpty() && filtrelenmisListeSurungen.isEmpty()) {
				System.out.println(hayvanAdi + " adlı hayvan hayvanat bahçesinde yok");
			}else if(filtrelenmisListenMemeli.isEmpty()){
				System.out.println(filtrelenmisListeSurungen);
				
			}else
				System.out.println(filtrelenmisListenMemeli);	
		
	}
	
	public void hayvaniHareketEttir(String hayvanAdi) {
		
	
		List<MemeliHayvan> filtrelenmisListenMemeli = memeliHayvanlarArrayList.stream().filter(ogrenci -> ogrenci.getAd().contains(hayvanAdi)).collect(Collectors.toList());
		
		List<Surungen> filtrelenmisListeSurungen = surungenlerArrayList.stream().filter(ogrenci -> ogrenci.getAd().contains(hayvanAdi)).collect(Collectors.toList());
	
		if(filtrelenmisListenMemeli.isEmpty() && filtrelenmisListeSurungen.isEmpty()) {
			System.out.println(hayvanAdi + " adlı hayvan hayvanat bahçesinde yok");
		}else if(filtrelenmisListenMemeli.isEmpty()){
			
			filtrelenmisListeSurungen.stream().forEach(x -> x.surun());
						
		}else {
			filtrelenmisListenMemeli.stream().forEach(x->x.yuru());
		}
		
		

	
	}

}
