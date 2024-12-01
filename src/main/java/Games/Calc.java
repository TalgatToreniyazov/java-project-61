package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final int MAX_NUMBER = 20;
    private static final char[] OPERATIONS = {'+', '-', '*'};

    public static void start() {
        String[][] rounds = new String[3][2];
        Random random = new Random();

        for (int i = 0; i < rounds.length; i++) {
            int number1 = random.nextInt(MAX_NUMBER) + 1;
            int number2 = random.nextInt(MAX_NUMBER) + 1;
            char operation = OPERATIONS[random.nextInt(OPERATIONS.length)];

            String question = number1 + " " + operation + " " + number2;
            String answer = String.valueOf(calculate(number1, number2, operation));

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }

        Engine.play(DESCRIPTION, rounds);
    }

    private static int calculate(int number1, int number2, char operation) {
        return switch (operation) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            default -> throw new IllegalArgumentException("Unknown operation: " + operation);
        };
    }
}
