package streamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApiOrnek3 {

	public static void main(String[] args) {


		Kisi kisi1 = new Kisi("Ahmet", 51, ECinsiyet.ERKEK);
		Kisi kisi2 = new Kisi("zeynep", 18, ECinsiyet.KADIN);
		Kisi kisi3 = new Kisi("can", 25, ECinsiyet.ERKEK);
		Kisi kisi4 = new Kisi("aslı", 32, ECinsiyet.KADIN);
		Kisi kisi5 = new Kisi("veli", 65, ECinsiyet.ERKEK);
		
		List<Kisi> kisiler = new ArrayList<>();
		kisiler.add(kisi1);
		kisiler.add(kisi2);
		kisiler.add(kisi3);
		kisiler.add(kisi4);
		kisiler.add(kisi5);
		
		System.out.println("Kadın olanların olduğu liste:");
		
		List<Kisi> filtrelenmisListeForKadin = kisiler.stream().filter(kisi -> kisi.getCinsyiye()==ECinsiyet.KADIN).collect(Collectors.toList());
		filtrelenmisListeForKadin.stream().forEach(user ->System.out.println(user));
		
		//Kişilerin yaşlarına göre sıralayalım farklı bir liste atıp yazdıralım
		//-sorted comparator
		System.out.println("Sıralanmış Liste");
		List<Kisi> sortListe = kisiler.stream().sorted(Comparator.comparing(kisi -> kisi.getAge())).collect(Collectors.toList()); 	//Comparator.comparing(Kisi::getAge)
		sortListe.forEach(System.out::println);
		
		//isim ve yas değerlerini bir map yapısına yazdıralım
		System.out.println("Yeni liste");
		Map<String,Integer> kisiMap = kisiler.stream().collect(Collectors.toMap(kisi -> kisi.getName(), kisi -> kisi.getAge())) ;
		kisiMap.forEach((key,value) -> System.out.println(key + "  " + value));
		
	
		System.out.println("\n50 YAŞ ÜSTÜ\n");
		//50 yaş üstü
		List<Kisi> filtrelenmisListeForElli = kisiler.stream().filter(kisi -> kisi.getAge()>50).collect(Collectors.toList());
		System.out.println("* * * *");
		
		filtrelenmisListeForElli.stream().forEach(kisi -> kisi.elliYasUstuMesaji());

	}

}
