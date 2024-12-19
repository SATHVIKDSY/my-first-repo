package patterns;

public class prog6 {

		static void degign(int r,int p) {
			int res = p;
			for(int c=1;c<=r;c++) {
				//System.out.print(res+" ");// 3 % 2----1
				 //res = res> 0?0:1;
				System.out.print((p++ % 2)+" ");// 3 % 2----1
				
			}
		}
		
		
		public static void main(String[] abc) {
			
			/*
			 * 1
			 * 0 1
			 * 1 0 1
			 * 0 1 0 1
			 * 
			 */
			
			
			for(int r =1 ;r<=4;r++) {
					degign(r,r % 2);
				System.out.println();
			}
			
		}

	}