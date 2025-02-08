import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(101); 
        
        System.out.println("Let the game begin!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        int[] guesses = new int[100]; 
        int count = 0;
        
        while (true) {
            System.out.print("Enter your guess: ");
            int guess = getValidNumber(scanner);
            
            guesses[count++] = guess; 
            
            if (guess < secretNumber) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (guess > secretNumber) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }
        
        System.out.print("Your numbers: ");
        printSortedGuesses(guesses, count);
    }
    
    private static int getValidNumber(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: ");
            }
        }
    }
    
    private static void printSortedGuesses(int[] guesses, int count) {
        int[] sortedGuesses = Arrays.copyOf(guesses, count);
        Arrays.sort(sortedGuesses);
        
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(sortedGuesses[i] + " ");
        }
        System.out.println();
    }
}
