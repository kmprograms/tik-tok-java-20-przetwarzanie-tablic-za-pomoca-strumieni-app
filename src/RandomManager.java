import java.util.Random;

public interface RandomManager {
    private static Random random() {
        return new Random();
    }

    static int intValue(int min, int max) {
        return random().nextInt(min, max + 1);
    }
}