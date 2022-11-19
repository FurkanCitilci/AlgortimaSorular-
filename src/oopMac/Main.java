package oopMac;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// takimlar diye array oluştur ve takımları array in içine atıcaz
		
		TakimManager takimManager = new TakimManager();
		Takim[] takimlar = new Takim[4];
		
		
		Takim takim1 = new Takim("Fenerbahçe");
		Takim takim2 = new Takim("Galatasaray");
		Takim takim3 = new Takim("Beşiktaş");
		Takim takim4 = new Takim("Tranzonspor");
		
		
		takimlar[0]=takim1;
		takimlar[1]=takim2;
		takimlar[2]=takim3;
		takimlar[3]=takim4;
		
		
		
		takimManager.playFotball(takim1, takim4);
		takimManager.playFotball(takim3, takim2);
		takimManager.playFotball(takim1, takim4);
		takimManager.playFotball(takim1, takim2);
		takimManager.playFotball(takim4, takim2);
		takimManager.playFotball(takim1, takim4);
		takimManager.playFotball(takim2, takim1);
		takimManager.playFotball(takim1, takim3);
		takimManager.playFotball(takim1, takim4);
		takimManager.playFotball(takim4, takim2);
		takimManager.playFotball(takim1, takim4);
		
//		for(int i=0; i<takimlar.length;i++) {
//			
//		}
		
		takimManager.kasaDurumu(takim2);
		takimManager.kasaDurumu(takim1);
		takimManager.puanDurumu(takimlar);
		takimManager.iflasEtmeDurumu(takimlar);
		
		//takımların kasası 5000 den az ise listele
		//şampiyonu göster
		
		takimManager.sampiyonTakim(takimlar);
		
		
	}

}
