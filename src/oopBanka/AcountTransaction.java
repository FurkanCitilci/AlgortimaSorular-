package oopBanka;

public class AcountTransaction {
	
	public void paraYatir(Acount acaount , int miktar) {
		if(miktar<=10000) {
		acaount.setMoney(acaount.getMoney() + miktar);
		System.out.println("Yatırılan miktar: " + miktar + " \nGüncel miktar :"  
							+ acaount.getMoney() );
		}else
			System.err.println("Yatırmak istedğiniz miktar 10.000 tl den fazla:" 
								+ miktar);
		
	}

	public void paraCek(Acount acaount ,int miktar ) {
		if(miktar>acaount.getMoney()) {
			System.err.println("Bakiyeniz çekmek istediğiniz miktar için yetersiz.."
								+ "\n Güncel bakiyeniz: " + acaount.getMoney());
		}else {
			acaount.setMoney(acaount.getMoney() - miktar);
			System.out.println("Hesaptan Çekilen miktar: " + miktar 
								+ "\nGüncel miktar :"  + acaount.getMoney() );
			
		}
		
		
	}
	
	public void hesapBilgileri(Acount acaount) {
		
		System.out.println("Hesap No : " + acaount.getAcountNo() 
							+ "\nHesapta ki Bakiye : " + acaount.getMoney() );
		
	}

}
