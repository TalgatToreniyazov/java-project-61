package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Gcd {
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final int MAX_NUMBER = 100;

    public static void start() {
        String[][] rounds = new String[3][2];
        Random random = new Random();

        for (int i = 0; i < rounds.length; i++) {
            int number1 = random.nextInt(MAX_NUMBER) + 1;
            int number2 = random.nextInt(MAX_NUMBER) + 1;

            String question = number1 + " " + number2;
            String answer = String.valueOf(findGcd(number1, number2));

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }

        Engine.play(DESCRIPTION, rounds);
    }

    private static int findGcd(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return number1;
    }
}
