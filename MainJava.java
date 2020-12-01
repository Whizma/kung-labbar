
public class MainJava {

	public static void main(String[] args) {
		RockPaperScissors game = new RockPaperScissors();
		game.runGame();
		System.out.println("Din statistik mot datorn (vinster/förluster/oavgjorda): " + game.getStats());

	}
}