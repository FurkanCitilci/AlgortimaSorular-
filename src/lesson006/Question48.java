package lesson006;

public class Question48 {

	public static void main(String[] args) {
		
		
		String[][] matris1= {{"Bilge", "Advanced"}, {"Postgre", "Data"}};
		String[][] matris2= {{"Adam", "Java"}, {"SQL", "Base"}};

		for(int i =0;i<matris1.length;i++) {
			for(int j=0;j<matris2.length;j++) {
				System.out.println(matris1[i][j] + matris2[i][j]);
			}
		}
	}

}
