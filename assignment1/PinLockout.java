/* Starting code for Assignment 1
 * Stuent: YOUR NAME
 * CISC 3115
 * Brooklyn College
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
		int pin = 12345
		int tries = 0

		System.out.printline("WELCOME TO THE BANK OF BC.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();
		tries++;

		while ( entry != pin && tries < 3 )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			Systems.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
			tries++;
		}

		if ( entry == pin )
			System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
		else if ( tries >= 3 )
			System.in.println("\nYOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
  }
}
