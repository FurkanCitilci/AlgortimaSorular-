package oopMac;

import java.util.Arrays;
import java.util.Random;

public class TakimManager {
	
	
	public void playFotball(Takim takim1, Takim takim2) {
		
		Random random = new Random();
		int durum=random.nextInt(3);
		
		if(durum==1) {
			takim1.setPuan(takim1.getPuan()+3);
			takim1.setKasa(takim1.getKasa()+10000);
			System.out.println("kazanan takım: " + takim1.getName());
		}else if(durum==2) {
			takim2.setPuan(takim2.getPuan()+3);
			takim2.setKasa(takim2.getKasa()+10000);
			System.out.println("kazanan takım: " + takim2.getName());
		}else {
			takim1.setPuan(takim1.getPuan()+1);
			takim1.setKasa(takim1.getKasa()+5000);
			takim2.setPuan(takim2.getPuan()+3);
			takim2.setKasa(takim2.getKasa()+5000);
			System.out.println("Sonuç berabere: " );
		}
	}
	
	public void kasaDurumu(Takim takim) {
		System.out.println(takim.getName() + " takımın kasa durumu.. " + takim.getKasa());
	}
	
	public void puanDurumu(Takim[] takimlar) {
		 System.out.println("\n****Puan Listesi****\n");
		for (int i = 0; i < takimlar.length; i++) {
			System.out.println(takimlar[i].getName() + ": " + takimlar[i].getPuan());
			
		}
		
	}
	
	public void iflasEtmeDurumu(Takim[] takimlar) {
		
		System.out.println("\n****İflas Eden Takımlar****\n");
		for (int i = 0; i < takimlar.length; i++) {
			if(takimlar[i].getKasa()<15000) {
				System.out.println(takimlar[i].getName() + " takımı iflas etmiştir...");
			}
			
		}
		
	}
	
//	public void sampiyonTakim(Takim[] takimlar) {
//		System.out.println("\n****Şampiyon Takım****\n");
//		
//		Takim sampiyon=takimlar[0];
//		for (int i = 0; i < takimlar.length; i++){
//            if (takimlar[i].getPuan() > sampiyon.getPuan()) {
//            	sampiyon = takimlar[i];
//            		
//            }
//        }
//		
//		System.out.println("Şampiyon takım---->" + sampiyon.getName());
//		
//		
//		
//	}
	
	public void sampiyonTakim(Takim[] takimlar) {
		
		System.out.println("\n****Şampiyon Takım****\n");
		Integer[] sampiyon= new Integer[takimlar.length];
		Takim[] sampiyonS= new Takim[takimlar.length];
		for (int i = 0; i < takimlar.length; i++){
			sampiyon[i]=takimlar[i].getPuan();
				   
        }
		
		
		
		
		
		
		
	}
	

}
