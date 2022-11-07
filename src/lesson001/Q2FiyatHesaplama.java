package lesson001;

public class Q2FiyatHesaplama {

	public static void main(String[] args) {
		//verilen ürünün satış fiyatının içinde %18 kdv ve %15 kar var
		//verilen ürünün ham fiyatını bul
		
		int hamFiyat, kdvFiyat, satisFiyat;
		satisFiyat=2000;
		kdvFiyat=satisFiyat-(satisFiyat)*15/100;
		hamFiyat=kdvFiyat-(kdvFiyat)*18/100;	
		System.out.println("Ham Fiyat :" + hamFiyat);
		

	}

}
