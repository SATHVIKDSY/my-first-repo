package patterns;

public class prog3 {

	public static void main(String[] args) {
		/*
		 * 1 2 3 4 5
		 * 1 2 3 4
		 * 1 2 3
		 * 1 2
		 * 1
		 */
		for(int r =5;r>=1;r--) {
			for(int c =1;c<=r;c++) {
				System.out.print(c+" ");
				
			}
			System.out.println();
		}
	}

}
