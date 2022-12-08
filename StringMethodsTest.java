package Lab4;

public class StringMethodsTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phrase = "Change is inevitable";
		String mutation1, mutation2, mutation3;
		
		System.out.println(phrase);
		System.out.println(phrase.length());
		
		mutation1 = " except from vending machines";
		System.out.println(phrase + mutation1);
		
		mutation2 = mutation1.toUpperCase();
		mutation3 = mutation1.substring(3);
		
		System.out.println(mutation1.length());
		System.out.println(mutation2.length());
		System.out.println(mutation3.length());
	}

}
