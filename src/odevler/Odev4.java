package odevler;

public class Odev4 {

	public static void main(String[] args) {
		// Odev2

		// bir dizide 13 var ise 13 ve bir sonra ki
		// elemanı toplama eklenmeden toplam souncu bulan program
		// int nums[] = { 13,1,1,13, 1, 1, 13, 1, 1, 13,13,1,1,13,1,1,1,13,13};
		int nums[] = { 13, 13, 13, 13, 13, 2, 13, 13, 1, 13, 5, 6, 7, 8};
		int k = 0;
		int top = 0;
		int temp = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 13) {
				temp = k + 1;
			} else if ((temp - k) == 1) {
				temp = 0;
			}else {
				top = top + nums[i];			
			}

		}
		System.out.println(top);

	}

}
