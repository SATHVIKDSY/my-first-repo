package patterns;

public class prog9 {

	public static void main(String[] args) {

				//String str = "Welcome to Java World. do not laugh. some One Monotoring You";
				
				// Welcome to java world. Do not laugh. Some one monotoring you
				
				String name = "ramu";
				// RAMU
				
				char ch = name.charAt(0);
				int diff = (int)('d'-'D');
				
				diff = diff<0?-1 * diff:diff;
				
				if(ch >='a' && ch <='z') {
					ch = (char)(ch -diff);
				}
				System.out.println(ch);
				
				
				
			}

		
		
	}


