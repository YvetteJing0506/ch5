import java.util.Scanner;
import java.util.Random;
		
public class GuessMyNumber {
	public static int PromptGuess() {
		Scanner input = new Scanner(System.in);
		System.out.println("I'm thinking of a number between 1 and 100 inclusive. Can you guess what it is?");
		System.out.print("Type a number: ");
		return input.nextInt();
		}
		
	public static int PromptGuess2() {
		Scanner input = new Scanner(System.in);
		System.out.print("Try again: ");
		return input.nextInt();
		}
		
	public static void compare (int guess, int number) {
		if (guess>number) {
			 if (Math.abs(guess-number) > 10) {
				 System.out.println("Hint: Your guess is too high!");
				 guess = PromptGuess2();
				 compare(guess, number);
			 } else {
				 System.out.println("Hint: It's a little higher than my number. You are close!");
				 guess = PromptGuess2();
				 compare(guess, number);
			 }
		}
		
		if (guess<number) {
			 if (Math.abs(guess-number) > 10) {
				 System.out.println("Hint: Your guess is too low!");
				 guess = PromptGuess2();
				 compare(guess, number);
			 } else {
				 System.out.println("Hint: It's a little lower than my number. You are close!");
				 guess = PromptGuess2();
				 compare(guess, number);
			 }
		 }
		 
		 if (guess == number) {
			 System.out.println("You are correct! :)");
		 }
	 }
	 
	public static void main(String[] args) {
		Random random = new Random();
		int number = random.nextInt(100) + 1;
		int guess = PromptGuess();
		compare(guess, number);
	}
}

