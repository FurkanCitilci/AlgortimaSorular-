package oopBanka;

import java.util.Locale;
import java.text.Normalizer;

public class UserManager {
	
	private final String emailFormat="@xbank.com";
	
	public void mailOlustur(User user) {
		String mail=user.getName().concat(user.getSurName()).toLowerCase(Locale.ENGLISH).replace(' ', '.');
		mail=mail.concat(emailFormat);
		mail=Normalizer.normalize(mail, Normalizer.Form.NFD);
		mail=mail.replaceAll("\\p{M}", "");
		user.setEmail(mail);						//veri tabanına kaydedildi
		//System.out.println(mail);
		
	}

	
	public void krediBasvursundaBulun(Acount acount, int para) {
		acount.setKrediBasvurus(true);
		acount.setIstenenKredi(para);
		
		System.out.println(para + " Değerinde Kredi Başvurusu yaptınız" 
							+ "\nLütfen onay bekleyiniz.....");
		
		
		
		
	}
	
	public void userBilgileriGoster(User user) {
		System.out.println("\n*****Hesap Bilgileri*****\n");
		System.out.println("Hesap Sahibi Ad Soyadı= " + user.getName() + " " + user.getSurName()
							+ "\n" + user.getEmail()+ "\n" +"Hesap NUMARASI: "+ user.getAccount().getAcountNo() 
							+ "\n" +"Hesaptaki Güncel Bakiye= "+ user.getAccount().getMoney());
		
		
		
	}
	
	public void krediKartBorcOde(Acount acount, int miktar) {
		
		
		
		if(acount.getIstenenKredi()==0) {
			System.out.println("Bu işlemi gerçekleştiremiyoruz");
		
		
		}else {
			
				int kalan=acount.getIstenenKredi()-miktar;
				System.out.println("Kalan kredi borcunuz: " + kalan);
				acount.setMoney(acount.getMoney()-miktar);
				acount.setKrediNotu(acount.getKrediNotu()+10);
			
			
			
		}
		
	}
	
	public void hesaptanKrediKartBorcOde(Acount acount, int taksit) {
		
		
		
		if(taksit<acount.getMoney()) {
			acount.setIstenenKredi(acount.getIstenenKredi()-taksit);
			acount.setMoney(acount.getMoney()-taksit);
			acount.setKrediNotu(acount.getKrediNotu()+10);
			System.out.println(taksit + " kadar borç ödediniz, güncel kredi kartı borcunuz : " 
								+ acount.getIstenenKredi() + " Güncel bakiye: " + acount.getMoney());
		
		
		}else {
			System.out.println("Bu işlemi gerçekleştiremiyoruz");
		}
		
	}
	
	public void nakitAvans(Acount acount) {
		if(acount.getKrediNotu()>50) {
			int nakitAvans=acount.getMoney()/2;
			acount.setMoney(acount.getMoney()/2);
			System.out.println("Hesaptan çekilen nakit avans: " + nakitAvans);
		}else {
			System.out.println("Nakit avans çekmek için kredi notunuz düşüktür...\n"
								+ "Kredi notunuz:" + acount.getKrediNotu());
		}
	}

}
