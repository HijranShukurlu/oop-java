import java.util.Random;
import java.util.Scanner;

public class ShootingAtTheSquare {
    static final int SIZE = 5;
    static char[][] field = new char[SIZE][SIZE];
    static int[][] target = new int[3][2]; 
    static int hits = 0; 

    public static void main(String[] args) {
        initializeField();
        placeTarget();

        System.out.println("All set. Get ready to rumble!");

        Scanner scanner = new Scanner(System.in);
        while (hits < 3) {
            int row = getValidInput(scanner, "Enter row (1-5): ") - 1;
            int col = getValidInput(scanner, "Enter column (1-5): ") - 1;

            if (field[row][col] == '*') {
                System.out.println("You already shot there!");
            } else if (isTargetHit(row, col)) {
                field[row][col] = 'x';
                hits++;
                System.out.println("Hit!");
            } else {
                field[row][col] = '*';
                System.out.println("Miss!");
            }

            printField();
        }

        System.out.println("You have won!");
    }

    private static void initializeField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = '-';
            }
        }
    }

    private static void placeTarget() {
        Random random = new Random();
        boolean isHorizontal = random.nextBoolean();
        int row, col;

        if (isHorizontal) {
            row = random.nextInt(SIZE);
            col = random.nextInt(SIZE - 2);
            for (int i = 0; i < 3; i++) {
                target[i][0] = row;
                target[i][1] = col + i;
            }
        } else {
            row = random.nextInt(SIZE - 2);
            col = random.nextInt(SIZE);
            for (int i = 0; i < 3; i++) {
                target[i][0] = row + i;
                target[i][1] = col;
            }
        }
    }

    private static boolean isTargetHit(int row, int col) {
        for (int i = 0; i < 3; i++) {
            if (target[i][0] == row && target[i][1] == col) {
                return true;
            }
        }
        return false;
    }

    private static int getValidInput(Scanner scanner, String prompt) {
        int value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value >= 1 && value <= SIZE) {
                    return value;
                }
            } else {
                scanner.next();
            }
            System.out.println("Invalid input. Enter a number between 1 and 5.");
        }
    }

    private static void printField() {
        System.out.println("  1 2 3 4 5");
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }
}
