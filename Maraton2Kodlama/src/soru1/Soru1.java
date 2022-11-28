package soru1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {


		List<Rehber> rehberList = new ArrayList<Rehber>();
		
		System.out.println("Lütfen Aramak istediğiniz İsim ve soyismi giriniz");
		Scanner sc = new Scanner(System.in);
		String kisi = sc.nextLine();
		
		try(Scanner scanner = new Scanner(new FileReader("rehber.txt"))){
			
			while(scanner.hasNextLine()) {
				
				String okunanSatir=scanner.nextLine();
				String[] arr = okunanSatir.split(";");
				
				if(arr[0].equalsIgnoreCase(kisi)) {
					Rehber rehber = new Rehber(arr[0], arr[1],Integer.parseInt(arr[2].trim()));
					rehberList.add(rehber);
					
				}
							
			}	
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya Bulunamadı");
		}

		if(rehberList.isEmpty()) {
			System.out.println("Tüm liste tarandı kişi bulunamadı");
			System.out.println("Lütfen -isim soyisim- şeklinde giriniz");
		}else
			System.out.println(rehberList);
			
		
		
	
		
	

	}

}
