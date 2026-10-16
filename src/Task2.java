import java.util.Scanner;

public class Task2 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        int userTerm = 0;
        int startingNum = 0;
        int secondNum = 1;
        int fibTerm = 0;
        boolean validNum = false;

        do {
            System.out.println("How many terms of Fibonacci Sequence would you like to be displayed? ");

            if (scan.hasNextInt()) {
                userTerm = scan.nextInt();
                if (userTerm > 0) {
                    validNum = true;
                } else if (userTerm == 0) {
                    System.out.println("User input must be greater than 0!");
                } else if (userTerm < 0){
                    System.out.println("Error: User input must be positive!");
                }
            } else {
                    System.out.println("Error: User input must be a positive number!");
            }
            scan.nextLine();
        } while (!validNum);

        for (int i = 0; i < userTerm; i++) {
            System.out.print(startingNum + " ");
            fibTerm = startingNum + secondNum;
            startingNum = secondNum;
            secondNum = fibTerm;
        }
    }
}