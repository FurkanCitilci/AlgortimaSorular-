package lesson005;

public class Question45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2 ve 4 ün kaç kere geçtiğini
		//hangisinin daha fazla olduğunu
		
		int[] sayilar= {1, 3, 4, 4, 4, 4, 2, 2, 9, 8, 8};
		int j=0;
		int k=0;
		for(int i=0;i<sayilar.length;i++) {
			if(sayilar[i]==2) {
				
				j++;
				
			}else if(sayilar[i]==4) {
				
				k++;
			}
		}
		if(k>j) {
			System.out.println("4 ler 2 den fazla");
			
		}
		else if(j>k){
			System.out.println("2 ler 4 den fazla");
		}
		System.out.println("2 lerin sayisi :" + j);
		System.out.println("4 lerin sayisi :" + k);

	}

}
