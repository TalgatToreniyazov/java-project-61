package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final int MAX_STEP = 10;
    private static final int MAX_START = 100;

    public static void start() {
        String[][] rounds = new String[3][2];
        Random random = new Random();

        for (int i = 0; i < rounds.length; i++) {
            int length = random.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH;
            int start = random.nextInt(MAX_START) + 1;
            int step = random.nextInt(MAX_STEP) + 1;

            int missingIndex = random.nextInt(length);
            String[] progression = generateProgression(start, step, length, missingIndex);
            String question = String.join(" ", progression);
            String answer = String.valueOf(start + missingIndex * step);

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }

        Engine.play(DESCRIPTION, rounds);
    }

    private static String[] generateProgression(int start, int step, int length, int missingIndex) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            if (i == missingIndex) {
                progression[i] = "..";  // Скрытое число
            } else {
                progression[i] = String.valueOf(start + i * step);
            }
        }
        return progression;
    }
}
