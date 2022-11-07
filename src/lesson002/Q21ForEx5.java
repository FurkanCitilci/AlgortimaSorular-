package lesson002;

public class Q21ForEx5 {

	public static void main(String[] args) {
		// 1 den 100 e kadar olan sayıların çift sayıların toplamını tek sayıların toplamına oranı bulalım
		int cift=0;
		int tek=1;
		for(int i=0;i<=100;i=i+2) {
			cift=cift+i;
		}
		System.out.println(cift);
		
		
		for(int j=1;j<=100;j=j+2) {
			tek=tek+j;
			
		}
		
		System.out.println(tek);
		System.out.println((double)cift/tek);

	}

}
