import java.util.Random;

public class TestDemo {

	//Add Positive Method
	public int addPositive(int a, int b) {
		if(a > 0 && b > 0) {
			return a + b;
		}
		else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
	}
	//Random Number Squared Method
	public int randomNumberSquared() {
		
		int random = getRandomInt();
			return random * random;
		}
	
	//Random Method
	protected int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;
	}
		
}
