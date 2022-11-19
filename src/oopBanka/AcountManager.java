package oopBanka;

public class AcountManager {
	
	public void krediBasvurusuOnayla(Acount acount) {
		if(acount.isKrediBasvurus()) {
			acount.setKrediBasvurus(false);
			System.out.println("Başvurunuz Onaylanmıştır");
			int guncelBakiye=acount.getMoney() + acount.getIstenenKredi();
			acount.setMoney(guncelBakiye);
		}else {
			System.out.println("Kredi başvurusu yapılmamıştır");
		}
		
	}
	
	public void krediBasvurusunuReddet(Acount acount) {
		if(acount.isKrediBasvurus()) {
			System.out.println("Kredis başvurusu reddedilmiştir");
			acount.setKrediBasvurus(false);
			acount.setIstenenKredi(0);
		}else {
			System.out.println("Kredi başvurusu bulunmamaktadır...");
			
		}
			
	}

}
