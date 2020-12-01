import java.util.Scanner;

public class RockPaperScissors {

	Scanner scan = new Scanner(System.in);
	RandomMoveGenerator random = new RandomMoveGenerator();

	private int wins = 0;
	private int losses = 0;
	private int draws = 0;

	private String computermove = random.randomGenerator();
	private String move;
	int w = 0;

	private String answer;
	private int i = 0;
	private int f = 0;

	public void runGame() {
		System.out.println("Välkommen till sten sax påse. Skriv in ditt drag för att utmana datorn!");
		do {

			computermove = random.randomGenerator();
			while (true) {
				if (i > 0 && f > 0) {
					
					move = scan.next();

				} else if (i > 0) {
					move = this.answer;
				} else {
					move = scan.next();
				}

				if (move.equalsIgnoreCase("Sten") || move.equalsIgnoreCase("Sax") || move.equalsIgnoreCase("Påse")) {
					System.out.println("Du valde " + move);
					break;
				} else if (move.equalsIgnoreCase("Pistol")) {
					System.out.println("Den gubben går inte! Skriv in ditt drag igen.");
					f++;
				} else {
					System.out.println("Ditt drag är ogiltigt, skriv in ditt svar igen!");
					f++;
				}
			}
			System.out.println("Datorn valde " + computermove);
			if ((move.equalsIgnoreCase("sten") && computermove.equalsIgnoreCase("sten"))
					|| ((move.equalsIgnoreCase("sax") && computermove.equalsIgnoreCase("sax"))
							|| ((move.equalsIgnoreCase("påse") && computermove.equalsIgnoreCase("påse"))))) {
				System.out.println("Matchen slutade lika");
				draws++;

			} else if ((move.equalsIgnoreCase("sten") && computermove.equalsIgnoreCase("påse"))
					|| (move.equalsIgnoreCase("påse") && computermove.equalsIgnoreCase("sax"))
					|| move.equalsIgnoreCase("sax") && computermove.equalsIgnoreCase("sten")) {
				System.out.println("Datorn vann matchen");
				losses++;

			} else {
				System.out.println("Grattis, du vann matchen!");
				wins++;
			}
			System.out.println("Skriv in ditt drag för att fortsätta spela, skriv nej för att avsluta");
			this.answer = scan.next();
			f=0;
			i++;
			
		} while (!answer.equalsIgnoreCase("nej") && i > 0);

		System.out.println("Spelet avslutas");

	}

// Statistiken för rundan
	public String getStats() {
		return (this.wins + " / " + this.losses + " / " + this.draws);

	}
}