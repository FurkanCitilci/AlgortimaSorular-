package collections;

import java.util.HashMap;
import java.util.Scanner;

public class MapOrnek1 {

	public static void main(String[] args) {
		
		//char ve int tutatn bir hashmap
		//kullanıcıdan kelime al
		//girilen kelimeden hangi harfden kaç tane var onu yaz
		
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		//Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
		
		
		Scanner scanner = new Scanner(System.in);
		String metin=scanner.nextLine();
		
		for(int i=0; i<metin.length();i++) {
			
		}
		
//		for (int i = 0; i < metin.length(); i++) {
//
//			char ch = metin.charAt(i);
//
//			if (hashMap.containsKey(ch)) {
//				hashMap.replace(ch, hashMap.get(ch) + 1); // put ile de olur
//
//			} else {
//				hashMap.put(ch, 1);
//			}
//
//		}
//		System.out.println(hashMap);

	}

}
