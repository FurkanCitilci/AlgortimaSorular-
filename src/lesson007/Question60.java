package lesson007;

public class Question60 {

	
	public static int toplama(String val1, int val2) {
		int toplam=Integer.parseInt(val1)+val2;
		return toplam;
	}
	public static void main(String[] args) {
		// parametre olarak girilen bir string ve int değerini toplayan metod yaz
		//daha sonra bu değeri konsola yaz
		
		String deger= "2";
		int sayi=5;
		int sonuc=toplama(deger,sayi);
		
		System.out.println(sonuc);
		
		;
	}

}
