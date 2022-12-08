package Lab4;
import java.util.Scanner;

public class QuadtraticPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		int a = scan.nextInt();
		
		System.out.println("Enter b: ");
		int b = scan.nextInt();
		
		System.out.println("Enter c: ");
		int c = scan.nextInt();
		
		System.out.println("\n\nThe value of x is: ");
		System.out.println((-b + Math.sqrt(Math.pow(b, 2) - 4 *a * c)) / 2 * a);
		
		System.out.println("\nOr when subtracting: ");
		System.out.println((-b - Math.sqrt(Math.pow(b, 2) - 4 *a * c)) / 2 * a);
	}

}
