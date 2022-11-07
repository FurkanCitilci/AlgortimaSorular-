package lesson002;

import java.util.Scanner;

public class Q13IfElse {

	public static void main(String[] args) {
		
		// Telefona ve maile bir kod gelecek
		//kullanıcıdan emaile gelen kodu ve telefona gelen kodu alcaz
		//bunları karşılaştır
		
		//ikiside sistme uyuyprsa sisteme kaydoldun
		//telefona gelen mail yanlış ise emaili yanlış girdiniz7
		// emaili doğru telefonu yanlış girmiş olabilir ....telefonu yanlış girdiniz
		// ikiside yanlış girdiyse telefon ve maili yanlış girdiniz
		
		//int mailKod=555
		//int telefonKod=321
		
		int sistemKod=9896;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mail Gelen Kodu Giriniz...");
		int mailKod=scanner.nextInt();
		System.out.println("Telefon Gelen Kodu Giriniz...");
		int telefonKod=scanner.nextInt();
		
		if(telefonKod==sistemKod && mailKod==sistemKod) {
			System.out.println("Sisteme Kayıt Oldunuz");
		}
		else if(telefonKod!=sistemKod && mailKod==sistemKod) {
			System.out.println("Telefon Kodu Yanlış");
		}
		else if(mailKod!=sistemKod && telefonKod ==sistemKod) {
			System.out.println("Mail Kodu Yanlış");
		}
		else if(mailKod!=sistemKod && telefonKod !=sistemKod) {
			System.out.println("İkisinide Yanlış girdiniz");
		}

	}

}
