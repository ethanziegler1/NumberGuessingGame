import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean win = false;
        int answer = (int) (Math.random() * 100);
        System.out.println("Guess a random number between 0 and 100");
        while(win == false) {
            int guess = console.nextInt();
            if(checkBounds(guess)){
                System.out.println("Your guess needs to be between 0 and 100");
            }
            win = checkGuess(answer, guess, win);
        }
    }
    private static boolean checkGuess(int answer, int guess, boolean win) {
        if (answer == guess) {
            System.out.println("Correct! The answer was " + answer + "!");
            win = true;
        } else if (answer > guess) {
            System.out.println("Your guess is too low");
        } else {
            System.out.println("Your guess is too high");
        }
        return win;
    }

    private static boolean checkBounds(int guess) {
        return guess > 100 || guess < 0;
    }
}