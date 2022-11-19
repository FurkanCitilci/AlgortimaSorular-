package oopBanka;

import java.util.Random;

import oopPizza.Pizza;

public class Main {

	public static void main(String[] args) {
		// atm uygulaması
		// acount sınıfı---->acountNo,money
		//para yatır para çek metodu
		//para çekerken hesapta o kadar para yoksa para çekemicez
		// hesaba en fazla 10.000 yatır
		//para yatır ve cek de hesabı güncelle
		//user sınıfı oluştur---name,surname,acount
		//mainde user acount bağlayalım
		
//		Random random = new Random();
//		int acountNo=random.nextInt(99999 - 10000)+10000;
//		String acountNoS=Integer.toString(acountNo);
		
		AcountTransaction transaction = new AcountTransaction();
		AcountManager acountManager = new AcountManager();
		Acount acount1 = new Acount();
		transaction.paraYatir(acount1,100);
		transaction.paraYatir(acount1,5000);
		transaction.paraCek(acount1, 250);
		transaction.hesapBilgileri(acount1);
		
		//Acount acount2 = new Acount("55555555");
		
		UserManager manager = new UserManager();

		
		System.out.println("***********************************");
		User user2 = new User("Furkan" , "Çitilci" , new Acount());
		
		manager.mailOlustur(user2);
		manager.userBilgileriGoster(user2);
		transaction.paraYatir(user2.getAccount(), 5000);
		manager.krediBasvursundaBulun(user2.getAccount(), 9000);
		acountManager.krediBasvurusuOnayla(user2.getAccount());
		//acountManager.krediBasvurusuOnayla(user2.getAccount());
		manager.userBilgileriGoster(user2);
		
		
//		User user1 = new User("Hacı Ali" , "Dağlı" , new Acount());
//		user1.getAccount().setAcountNo("12312");
//		manager.mailOlustur(user1);
//		manager.userBilgileriGoster(user1);
		
		//kredi kartı borcunu öde methodu yazalım
        //eğer user'ın çekmiş oldugu kredi yoksa ve ya kredi başvurusu reddedilmiş ise
        // Bu işlemi geçkleştiremiyoruz diye output verelim
        //çekilmiş kredi var ise parametre olarak girilen miktar kadar borç ödenmiş olsun 
        //ve kredi kartı borcundan düşülsün
        //daha sonra güncel kredi kartı borcunuz ... diye output versin
		
		//hesaptan öde
		//hesap seç, hesaptan parayı öde
		
		
		manager.krediKartBorcOde(user2.getAccount(), 2500);
		//manager.hesaptanKrediKartBorcOde(user2.getAccount(), user2.setAccount(acount1));
		//kredi notu hesapla
		//her kredi ödediğinde kredi notunu 10 artır
		
		//nakit avans çek
		//nakit avans için kredi notun>50
		//>50 ise hesaptaki
		
		manager.krediKartBorcOde(user2.getAccount(), 1500);
//		manager.krediKartBorcOde(user2.getAccount(), 500);
//		manager.krediKartBorcOde(user2.getAccount(), 100);
//		manager.krediKartBorcOde(user2.getAccount(), 100);
//		manager.krediKartBorcOde(user2.getAccount(), 500);
		manager.nakitAvans(user2.getAccount());
		
		

	}

}
