package oopKitaplik;

public class Kutuphane {

	private String[] kitaplar;
	private int index;

	public Kutuphane(int boyut) {
		kitaplikOlustur(boyut);

	}

	public void kitaplikOlustur(int boyut) {
		kitaplar = new String[boyut];
	}

	public void kitapEkle(String yazar, String kitap) {
		if (index < kitaplar.length) {
			kitaplar[index] = yazar + "," + kitap;
			// index++;
			for (String string : kitaplar) {
				System.out.println(string);
			}
			index++;
		} else {
			System.out.println("Kitaplık dolmuştur");
		}

	}

	public void kitapIsmiAra(String kitapIsmi) {
		boolean kontrol = false;
		for (String kitap : kitaplar) {
			if (kitap.toLowerCase().contains(kitapIsmi.toLowerCase())) {
				kontrol = true;

			}
			if (kontrol) {
				System.out.println(kitapIsmi + " isimli kitap kütüphaneizde vardır");

			} else
				System.out.println(kitapIsmi + " isimli kitap kütüphaneizde yoktur");

		}

	}

	public void kitapIsmiAraAlternatif(String kitapIsmi) {
		boolean kontrol = false;
		for (int i = 0; i < kitaplar.length; i++) {
			if (kitaplar[i] != null) {
				String kitap = kitaplar[i].substring(kitaplar[i].indexOf(",") + 1);
				if (kitap.equalsIgnoreCase(kitapIsmi.trim())) {
					kontrol = true;
				}
			}
		}
		if (kontrol) {
			System.out.println(kitapIsmi + " isimli kitap kütüphaneizde vardır");

		} else
			System.out.println(kitapIsmi + " isimli kitap kütüphaneizde yoktur");

	}

	public void yazarIsmiAra(String yazarIsmi) {

		boolean kontrol = false;
		for (int i = 0; i < kitaplar.length; i++) {
			if (kitaplar[i] != null) {
				String kitap = kitaplar[i].substring(0, kitaplar[i].indexOf(","));
				if (kitap.equalsIgnoreCase(yazarIsmi.trim())) {
					kontrol = true;
				}
			}
		}
		if (kontrol) {
			System.out.println(yazarIsmi + " isimli kitap kütüphaneizde vardır");

		} else
			System.out.println(yazarIsmi + " isimli kitap kütüphaneizde yoktur");

	}

	public void kitaplariListele() {
		
		System.out.println("\n*****Kütüphanemizdeki Kitaplar*****\n");
		for (int i = 0; i < kitaplar.length; i++) {
			System.out.println(kitaplar[i].substring(kitaplar[i].indexOf(",") + 1));
			
		}

	}

}