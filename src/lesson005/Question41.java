package lesson005;

public class Question41 {

	public static void main(String[] args) {
		// dizide eğer a ile biten bir kelime varsa kelimeyi soru işareti ile değiştir

		// output 1. indeksi değişti

		String[] dizi = { "malta", "Amerika", "Almanya", "İsveç", "Danimarka" };
		for (int i = 0; i < dizi.length; i++) {

			if (dizi[i].endsWith("a")) {
				dizi[i] = "?";
				System.out.println(i + "inci indeks değişti" + dizi[i]);

			}
		}
	}
}
