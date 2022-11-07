package lesson006;

public class Question51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2 matris verilecek
		// verilen matrisdeki sayıları topla

		int matris1[][] = { { 5, 6, 2 }, { 9, 1, 6 } };
		int matris2[][] = { { 3, 4, 1 }, { 1, 3, 6 } };

		int topMatris[][] = new int[2][3];

		for (int i = 0; i < matris1.length; i++) {

			for (int j = 0; j < matris2.length + 1; j++) {

				topMatris[i][j] = matris1[i][j] + matris2[i][j];
				System.out.print(topMatris[i][j] + " ");
			}
			System.out.println();

		}
	}

}
