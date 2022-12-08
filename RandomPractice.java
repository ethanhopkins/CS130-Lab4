package Lab4;
import java.util.Random;

public class RandomPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int number = generator.nextInt(3, 11);
		System.out.println(number);
		
		int num2 = generator.nextInt(-20, 31);
		while (num2 >= 20 && num2 <=45) {
			num2 = generator.nextInt(-20, 31);
		}
		System.out.println(num2);
	}

}
