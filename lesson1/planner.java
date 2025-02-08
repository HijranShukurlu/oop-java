import java.util.Scanner;

public class WeekPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] schedule = {
                {"Sunday", "do homework"},
                {"Monday", "go to courses; watch a film"},
                {"Tuesday", "go to gym"},
                {"Wednesday", "attend meeting"},
                {"Thursday", "read a book"},
                {"Friday", "go shopping"},
                {"Saturday", "meet friends"}
        };

        while (true) {
            System.out.println("Please, input the day of the week:");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("exit")) {
                break;
            }

            boolean found = false;
            for (int i = 0; i < schedule.length; i++) {
                String day = schedule[i][0].toLowerCase();
                
                if (input.equals(day)) {
                    System.out.println("Your tasks for " + schedule[i][0] + ": " + schedule[i][1]);
                    found = true;
                    break;
                } else if (input.startsWith("change ") || input.startsWith("reschedule ")) {
                    String command = input.split(" ", 2);
                    if (command.length > 1) {
                        String dayToChange = command[1].trim();
                        
                        for (int j = 0; j < schedule.length; j++) {
                            if (schedule[j][0].equalsIgnoreCase(dayToChange)) {
                                System.out.println("Please, input new tasks for " + schedule[j][0] + ":");
                                schedule[j][1] = scanner.nextLine();
                                found = true;
                                break;
                            }
                        }
                    }
                    break;
                }
            }
            
            if (!found) {
                System.out.println("Sorry, I don't understand you, please try again.");
            }
        }
        scanner.close();
    }
}
