import java.util.Random;

public class RandomMoveGenerator {

	private Random rand = new Random();

	public String randomGenerator() {
		int randomNumber = rand.nextInt(3);
		if (randomNumber == 0) {
			return "Sten";
		} else if (randomNumber == 1) {
			return "Sax";
		} else {
			return "Påse";

		}
	}

}
