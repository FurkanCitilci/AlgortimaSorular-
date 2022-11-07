package lesson007;

public class Question61 {

	public static int donusum(int sayi) {
		
		String deger=String.valueOf(sayi);
		int sonuc=deger.length();
		return sonuc;
	}
	
	//sayinin büyüklüğünü koşulla
	public static void sayininBuyuklugu(int sayi){
		int basamak = donusum(sayi);
		if(basamak >=4)
			System.out.println("Sayı bin den büyüktür");
		else
			System.out.println("Sayı bin den küçüktür");
	}
	
	public static void main(String[] args) {
		// parametre olarak int alan ve int döndüren
        // girilen ifadenini kaç basamaklı olduğunu bulan method
        // type casting işlemi kullanalım
        // int Stringe çevirip öyle bulalım

        // kacBasamakli("500")
        //
        // girilen değeri stringe çevirip, çevirdiğimiz ifadenin uzunluğunu bulcaz.

		int sayi = 1121;
				
		System.out.println(donusum(sayi));
		
		sayininBuyuklugu(sayi);
	}

}
