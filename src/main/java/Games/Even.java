package games;

import java.util.Random;
import java.util.Scanner;

public class Even {
    private static final Random RANDOM = new Random();
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void start() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = SCANNER.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even,");
        System.out.println("otherwise answer 'no'.");

        int correctAnswers = 0;
        while (correctAnswers < 3) {
            int number = RANDOM.nextInt(100);
            System.out.println("Question: " + number);

            String correctAnswer = (number % 2 == 0) ? "yes" : "no";
            System.out.print("Your answer: ");
            String userAnswer = SCANNER.nextLine().toLowerCase();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. ");
                System.out.println("Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
