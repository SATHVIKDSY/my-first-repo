package patterns;
public class prog10 {
	public static void main(String[] args) {
		long pT = System.currentTimeMillis();
		String name = "abc";
		for(int i =1;i<=1000000;i++) {
			name = name + 1;
		}
		long cT = System.currentTimeMillis();
		long diff = cT - pT;
		System.out.println("diff--->"+diff);
		long pT1 = System.currentTimeMillis();
		StringBuffer name1 = new StringBuffer("abs");
		for(int i =1;i<=1000000;i++) {
			name1 = name1.append("i");
		}
		long cT1 = System.currentTimeMillis();
		long diff1 = cT1 - pT1;
		System.out.println("diff1--->"+diff1);
	}

}