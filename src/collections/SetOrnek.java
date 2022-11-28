package collections;

import java.util.HashSet;
import java.util.Scanner;

public class SetOrnek {
	
	public static void main(String[] args) {
		
		//2 tane set oluşturalım
		//tekrar edenler ve tekrar etmeyenler
		// kullanıcıdan kelime al
		//eğer tekrar harf varsa tekrar edene 
		//tekrar etmeyen varsa etmeynleri yaz
		
		//setlerin içinde unique veri tutarız
		
		HashSet<Character> tekrarEden =  new HashSet<Character>();
		
		HashSet<Character> tekrarEtmeyen =  new HashSet<Character>();
		
		Scanner scanner = new Scanner(System.in);
		String metin=scanner.nextLine();
		
		for(int i=0;i<metin.length();i++) {
			if(tekrarEden.contains(metin.charAt(i))) {
				
			}else {
			
			}
			//tekrarEtmeyen.add(c);
		}
		
		
		System.out.println(tekrarEden);
//		tekrarEden.removeAll(tekrarEtmeyen);
//		System.out.println(tekrarEden);
		System.out.println(tekrarEtmeyen);
		
		
		//alternatif çözüm
		
//		for (int i = 0; i < kelime.length(); i++) {
//            if (!tekrarEden.contains(kelime.charAt(i)) && !tekrarEtmeyen.add(kelime.charAt(i))) {
//                tekrarEden.add(kelime.charAt(i));
//                tekrarEtmeyen.remove(kelime.charAt(i));
//            }
//        }
		
		//alternatif çözüm
//		  Scanner scanner = new Scanner(System.in);
//	        System.out.println("Bir kelime giriniz.");
//	        String kelime = scanner.nextLine();
//	        
//	        HashSet<Character> tekrarEdenler = new HashSet<Character>();
//	        HashSet<Character> tekrarEtmeyenler = new HashSet<Character>();
//	                
//	        
//	        for (int i = 0; i < kelime.length(); i++) {
//	            for (int j = i+1; j < kelime.length(); j++) {
//	                if(kelime.charAt(i)== kelime.charAt(j)) {
//	                    tekrarEdenler.add(kelime.charAt(i));
//	                }
//	            }
//	            if(!tekrarEdenler.contains(kelime.charAt(i))) {
//	                tekrarEtmeyenler.add(kelime.charAt(i));
//	            }
//	        }
//	        System.out.println(tekrarEdenler);
//	        System.out.println(tekrarEtmeyenler);
		
		
	}

}
