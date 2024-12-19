package patterns;

public class prog12 {

	public static void main(String[] args) {
		String data = "Hello";
		StringBuffer str = new StringBuffer("Welcome");
		
		long pT = System.currentTimeMillis();
		for(int i=1;i<=10000;i++) {
			data = data + i;
		}
		long cT = System.currentTimeMillis();
		long diffT = cT - pT;
		
		long pT1 = System.currentTimeMillis();
		for(int i=1;i<=10000;i++) {
			str = str.append(""+i);
		}
		long cT1 = System.currentTimeMillis();
		System.out.println("From String --->"+diffT);
		System.out.println("From StringBuffer --->"+diffT);
		
		
		
		
	}

}	
	