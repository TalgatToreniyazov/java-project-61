package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int ROUNDS_COUNT = 3;

    public static void play(String gameDescription, String[][] rounds) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(gameDescription);

        for (String[] round : rounds) {
            String question = round[0];
            String correctAnswer = round[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String playerAnswer = scanner.nextLine();

            if (!playerAnswer.equals(correctAnswer)) {
                System.out.println("'" + playerAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }

            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + playerName + "!");
    }
}
