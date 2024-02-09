package NumberGuess;
import java.util.Scanner;

public class NumberGuess {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int secretNumber = (int) (Math.random() * 100 + 1);
	    boolean game = false;

	        while (!game) {
	            System.out.print("Entrez un chiffre entre 1 et 100: ");
	            int userNumber = scanner.nextInt();

	            if (userNumber > secretNumber) {
	                System.out.println("Le numéro que vous avez saisi est supérieur au numéro secret.");
	            } else if (userNumber < secretNumber) {
	                System.out.println("Le numéro que vous avez saisi est inférieur au numéro secret.");
	            } else {
	                System.out.println("Vous avez gagné le jeu!");
	                game = true;
	            }
	        }

	        scanner.close();
	}
}
