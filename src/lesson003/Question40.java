package lesson003;

import java.util.Scanner;

public class Question40 {

	public static void main(String[] args) {
		//email
        //password
        //ikinci paswword
        
        //email "@" kontrol (contains)
        //password ikiside eşitmi
        // password 8 karakterden fazla mı
        // kayıt oldunuz 
        // email formatı uygun değil
        // passwordlar uyuşmuyosa ve ya 8 karakterden az  ise passwordu tekrar kontrol edin 
        
        //boolean 
        //while()
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sisteme giriş yapmak için Aşağıdaki biligileri Griniz:");
		System.out.println("********************************");
		
		boolean kontrol=true;
		
		while(kontrol) {
			System.out.println("Email inizi Giriniz:");
			String email =scanner.nextLine();
			scanner.nextLine();
			System.out.println("Passwordunuzu Giriniz:");
			int password=scanner.nextInt();
			kontrol=true;
			
			
			
		}
		
		
		
	}
	
	
	

}
