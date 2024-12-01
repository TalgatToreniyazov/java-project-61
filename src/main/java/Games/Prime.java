package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void start() {
        String[][] rounds = new String[3][2];
        Random random = new Random();

        for (int i = 0; i < rounds.length; i++) {
            int number = random.nextInt(100) + 2;  // генерируем число от 2 до 101
            String question = String.valueOf(number);
            String answer = isPrime(number) ? "yes" : "no";

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }

        Engine.play(DESCRIPTION, rounds);
    }

    // Функция для проверки простоты числа
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
