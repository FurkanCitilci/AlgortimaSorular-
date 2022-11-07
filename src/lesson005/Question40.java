package lesson005;

import java.util.Scanner;

public class Question40 {

	public static void main(String[] args) {
		
		//Bizden bir kelime istenecek
		//hangi harf değiştirmek istediğimizi soracak
		//eğer değiştirmek istediğimiz kelime yoksa,
		//döngü başa sar ve yeni kelime iste
		//varsa harf değiştir
		//yeni kelime ekrana bas
		
		//java
		//değiştirmek istediğin harf---> a
		//neyle değiştirmek istediğiniz harf--->b
		
		Scanner scanner = new Scanner(System.in);
		
		boolean karar=true;
		
		while(karar) {
			System.out.println("Lütfen kelimeyi giriniz:");
			String kelime=scanner.nextLine();
			System.out.println("Lütfen değiştirmek istediğiniz harfi giriniz:");
			String harf=scanner.next();
			
		}
		

	}

}
