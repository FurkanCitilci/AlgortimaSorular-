package lesson007;

public class Question57 {

	public static void main(String[] args) {
		// max ve min değeri bulucaz
		// string den int
		// array in uzunluğu kadar int array oluşturalım

		// java string to int

		String[] array = { "5", "2", "3", "4", "99", "85" };

		int sayilar[] = new int[array.length];
		int min= Integer.MIN_VALUE;
		int max= Integer.MAX_VALUE;
		for (int i = 0; i < sayilar.length; i++) {

			sayilar[i] = Integer.parseInt(array[i]);
			

		}
		for (int i = 0; i < sayilar.length; i++) {

		}

	}

}
