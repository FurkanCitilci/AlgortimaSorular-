package lesson006;

public class Question49 {

	public static void main(String[] args) {
		// 3 e 3 lük matris
		
		// 1 1 1
		// 2 2 2
		// 3 3 3
		
		int[][] dizi1= {{1 , 1 , 1}, {2, 2, 2},{3, 3, 3}};
		
		for(int i =0;i<dizi1.length;i++) {
			for(int j=0;j<dizi1[i].length;j++) {
				System.out.print(dizi1[i][j] + " ");
			}
			System.out.println();
		}
		
		// diğer çözüm
		int[][] dizi= new int[3][3];
		for(int i =0;i<dizi.length;i++) {
			for(int j=0;j<dizi[i].length;j++) {
				dizi[i][j]=i+1;
				System.out.print(dizi1[i][j] + " ");
			}
			System.out.println();
		}

	}

}
