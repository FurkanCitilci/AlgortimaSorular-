package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamOrnek1 {

	public static void main(String[] args) {
		
		List<User> users = new ArrayList<>();
		users.add(new User("Ahmet", 100));
		users.add(new User("Ahmet", 107));
		users.add(new User("Ahmet", 108));
		users.add(new User("Aslı", 101));
		users.add(new User("Hasan", 102));
		users.add(new User("Zeynep", 103));
		users.add(new User("Mustafa", 104));
		users.add(new User("Can", 105));
		
		//bütün userların tostring methodunu çağıralım
		
		users.stream().forEach(user -> System.out.println(user));
		
		//herbir user için bilgileri göster metodu çağır
		users.stream().forEach(user -> user.bilgileriGoster());
		
		
		//id si 3 den büyük olanları listele
		//liste içindeki userları gilgileri göster i çağır yaz
		
		System.out.println("Filtrelenmis liste...");
		List<User> filtrelenmisListe = users.stream().filter(user -> user.getId()>103).collect(Collectors.toList());
		System.out.println("* * * *");
		filtrelenmisListe.stream().forEach(user -> user.bilgileriGoster());

		
		// id si 2 den küçük  olanları set e at
		// set i yazdır
		
		System.out.println("ID si 102 den küçük olanlar");
		Set<User> id2DenKucuk =  users.stream().filter(user -> user.getId()<102).collect(Collectors.toSet());
		id2DenKucuk.stream().forEach(user -> user.bilgileriGoster());
		
		//ismi ahmet olanları listeye at yazdır
		System.out.println("İsmi Ahmet olanlar...");
		List<User> filtrelenmisListeForAhmet =users.stream()
						.filter(user-> user.getName().trim().equalsIgnoreCase("ahmet"))
						.collect(Collectors.toList());
		filtrelenmisListeForAhmet.stream().forEach(User::bilgileriGoster);
		
		System.out.println("\n****Yeni Düzenlenmiş Liste****\n");
		List<User> yeniListe = users.stream().map(user -> new User(user.getName()+"!!", user.getId()))
							.collect(Collectors.toList());
		yeniListe.stream().forEach(User::bilgileriGoster);
	
	}
	
	//user sınıfı oluşturalım
	//id ve name olsun
	// to string methodu olsun
	//bilgileri göster metodu olsun sadce ---->ismi olsun
	//mainde users diye bir nesne oluşturalım
	//user nesneleri oluşturup users listesine atalım

}
