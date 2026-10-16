import java.util.Scanner;

public class Task1 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userWord;
        String palWord = "";
        String lowWord;
        int wordLength = 0;

        System.out.println("Enter in a word to check if it is a palindrome.");
        userWord = scan.nextLine();
        lowWord = userWord.toLowerCase();
        wordLength = lowWord.length();

        for (int i = wordLength - 1; i >= 0; i--) {
            palWord += (lowWord.substring(i, i + 1));
        }
        if (lowWord.equals(palWord)) {
            System.out.println("Your word " + lowWord + " is a palindrome!");
        } else {
            System.out.println("Your word " + lowWord + " is not a palindrome!");
        }
    }
}
