package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapOrnek2 {

	public static void main(String[] args) {
		
		String[] ogrenci = {"Ayşe" , "Ece", "Mahmut"};
		int[] notlar = {60, 80, 70};
		
		int[][] notlar2 = { {50,60,60}, {80,90,70}, {25,75,85} };
		
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		
		for(int i=0; i<ogrenci.length;i++) {
			for(int j=0;j<notlar.length;j++) {
				hashMap.put(ogrenci[i], notlar[i]);
			}
			
		}
		
		System.out.println(hashMap);
		System.out.println();
		
		//notlar2 yi ekle
		
		//hash code a göre sıralanır:
		HashMap<String, int[]> hashMap2 = new HashMap<String, int[]>();
		
		for(int i=0; i<ogrenci.length;i++) {
			
			hashMap2.put(ogrenci[i], notlar2[i]);	
		}
		
		for(Map.Entry<String, int[]> entry  :  hashMap2.entrySet()) {
			System.out.println(entry.getKey());
			for(int i=0; i<entry.getValue().length;i++) {
				System.out.println(entry.getValue()[i]);
			}
		}
		
		
		HashMap<String, List<Integer>> hashMap3 = new HashMap<>();
		
		for(int i= 0; i<notlar2.length;i++) {
			List<Integer> listNotlar = new ArrayList<>();
			for(int j= 0; j<notlar2[i].length;j++) {
				listNotlar.add(notlar2[i][j]);
				
			}
			hashMap3.put(ogrenci[i], listNotlar);
		}
		
		for(Map.Entry<String, List<Integer>> entry  :  hashMap3.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
			
		}

	}

}
