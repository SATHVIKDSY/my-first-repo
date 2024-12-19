package patterns;

public class prog2 {
	public static void main(String[] args) {
		/*
		 *   		1
		 *   	  2   2
		 *       3  3  3
		 *     4  4  4  4
		 * 
		 */
		int max=40;
		for(int r = 1;r <=50;r++) {
			
			for(int i=1;i<=max;i++) {
				System.out.print(" ");
			}
			
			for(int c=1;c<=r;c++) {
				System.out.print(r+"  ");
			}
			System.out.println();
			max = max - 2;
			
		}
		
		
		
	}

}