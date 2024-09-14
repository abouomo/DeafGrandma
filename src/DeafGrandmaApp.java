import java.util.Scanner;

public class DeafGrandmaApp {

	public static void main(String[] args) {
		DeafGrandmaApp app = new DeafGrandmaApp();
		app.launch();
	}
	
	private void launch() {
		// Scanner
		Scanner scanner = new Scanner(System.in);
		// User Prompt
		System.out.println("Say something to grandma\n");
		
		// instantiate Grandma
		Grandma grandma = new Grandma();
		// ... logic here
		while (true) {
			String phrase = scanner.nextLine();
			if (phrase.equals("GOODBYE\n")) {
				System.out.println("SMELL YOU LATER!\n");
				break;
			}
			if (grandma.canGrandmaHearYou(phrase) == true) {
				grandma.grandmaResponds(true); 
				System.out.println("");
			} 
			if (grandma.canGrandmaHearYou(phrase) == false) {
				grandma.grandmaResponds(false);
				System.out.println("");
			}
		}
		scanner.close();
	}
}
