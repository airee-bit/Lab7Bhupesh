import java.util.Scanner;

public class Task3 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double excessMoney = 0;
        double savingGoal = 0;
        double totalSaved = 0;
        double depositValue = 0;
        int depositCount = 0;
        boolean validNum = false;

        do {
            System.out.println("Enter in a savings goal: ");
            if (scan.hasNextDouble()) {
                savingGoal = scan.nextDouble();
                if (savingGoal > 0) {
                    validNum = true;
                } else if (savingGoal == 0) {
                    System.out.println("Savings goals must be higher than 0!");
                } else if (savingGoal < 0) {
                    System.out.println("Error: Savings goal must be a positive number!");
                }
            } else {
                    System.out.println("Error: Savings goals must be a positive number!");
                }
                scan.nextLine();
        } while(!validNum);



        while (totalSaved < savingGoal){
            System.out.println("Current savings total:$" + totalSaved);

            validNum = false;

            do {
                System.out.println("Enter in a deposit value for your savings goal: ");
                if (scan.hasNextDouble()) {
                    depositValue = scan.nextDouble();
                    if (depositValue > 0) {
                        validNum = true;
                    } else if (depositValue == 0) {
                        System.out.println("Error: Deposit value must be greater than 0!");
                    } else if (depositValue < 0) {
                        System.out.println("Error: Deposit value must be positive!");
                    }
                } else{
                    System.out.println("Error: Deposit value must be a positive number!");
                }
                scan.nextLine();
            } while(!validNum);

            totalSaved += depositValue;
            depositCount++;
        }
        excessMoney = totalSaved - savingGoal;
        System.out.println("Number of Deposits: " + depositCount);
        System.out.println("Total Saved:$" + totalSaved);
        System.out.printf("Excess money:$%5.2f" , excessMoney);
    }
}
