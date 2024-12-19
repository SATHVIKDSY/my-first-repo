package patterns;

public class prog5 {

	public static void main(String[] args) {
		/*
		 *   **************************
		 *   *                        *
		 *   *                        *
		 *   *                        *
		 *   *                        *
		 *   *                        *
		 *   *                        *
		 *   * 
		 *   *                        *
		 *   *                        *
		 *   *                        *
		 *   *************************
		 *
		 */
for(int rows=1;rows<=20;rows++) {
			System.out.print("\t");
	
			if(rows == 1 || rows == 20) {
				for(int cols=1;cols<=35;cols++) {
					System.out.print("*");
				}
			}
			else {
				for(int cols=1;cols<=35;cols++) {
					if(cols== 1 || cols == 35) {
						System.out.print("*");	
					}
					else {
						System.out.print(" ");
					}
					
				}
			}
			System.out.println();
		}
		
		
		
		
	}

}