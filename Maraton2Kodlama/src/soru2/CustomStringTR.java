package soru2;

public class CustomStringTR {

	private String ifade;
	
	

	public CustomStringTR(String ifade) {
		super();
		this.ifade = ifade;
	}
	
	public int uzunluk() {
		
		return ifade.length();
	}
	public char karakterBul() {
		
		if(ifade.length()<=2) {
			System.out.println("İfade 3 karakterden küçüktür");
			return ' ';
		}else {
			return ifade.charAt(3);
		}
			
		
	}
	
	public int ilkGecenKarakter() {
		
		if(!ifade.contains("b")) {
			System.out.println("b karakteri mevcut değil");
			return 0;
			
		}else {
			System.out.println("b karakterinin ilk geçtiği index:");
			return ifade.indexOf('b');
		}
			
		
	}
	
	public String ilkBesKarakter() {
		
		if(ifade.length()>= 5) {
			System.out.println("İlk 5 karakter");
			return ifade.substring(0, 5);
		}else {
			System.out.println("İfade 5 karakterden küçük");
			return ifade.substring(0, ifade.length());
		}
		
	}
	
	public String bosluklariSil() {
		
		System.out.println("İfade den boşluklar silindi");
		return ifade.trim();
	}
	
	public String karakterleriKucult() {
		
		System.out.println("Karakterler küçültüldü");
		return ifade.toLowerCase();
	}
	
	public String karakterleriBuyut() {
		
		System.out.println("Karakterler büyütüldü");
		return ifade.toUpperCase();
	}
	
	public String yerDegistirme() {
		
		
		return ifade.replace("i", "ı");
	}
	
	public boolean icerikKontrol() {
		
		System.out.println("İfade içerisinde sil var mı");
		if(ifade.contains("sil")) {
			return true;
		}else
			return false;
		
	}
	
	public boolean esitlik(String ifade) {
		System.out.println("İfadeler eşit mi?");
		if(this.ifade.equals(ifade)) {
			return true;
		}else
			return false;
	}
	
	public boolean ifadeBuykKuckOlmkszn(String ifade) {
		System.out.println("İfadeler eşit mi?");
		if(this.ifade.equalsIgnoreCase(ifade)) {
			return true;
		}else
			return false;
	}
	

	public String getIfade() {
		return ifade;
	}

	public void setIfade(String ifade) {
		this.ifade = ifade;
	}
	
	

}
