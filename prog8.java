package patterns;
import java.util.Scanner;
public class prog8 { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 names");
	
		String name1 = sc.next();
		String name2 = sc.next();
		
		System.out.println("Before Swapping");
		System.out.println("name1------->"+name1);
		System.out.println("name2------->"+name2);

		name1 = name1+name2;// ---name1.len   name2.len
		name2 = name1.substring(0, name1.length()-name2.length());
		name1 = name1.substring(name2.length());
		
		System.out.println("After Swapping");
		System.out.println("name1------->"+name1);
		System.out.println("name2------->"+name2);
	}

}
