package lesson005;

public class deneme {

	public static void main(String[] args) {
		
		
		String[] dizi = { "Amerika", "Almanya", "İsveç", "Danimarka" };
		for (int i = 0; i < dizi.length; i++) {

			if (dizi[i].endsWith("a")) {
				
				System.out.println(i + "inci indeks değişti" );
				for(int j=0;j<dizi[i].length();j++) {
					if(j==(dizi[i].length()-1)) {
						
					}
				}

			}
		}
	}

}
