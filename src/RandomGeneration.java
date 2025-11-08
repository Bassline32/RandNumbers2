import java.util.Random;

public class RandomGeneration {
    public int getRandom() {
        Random random = new Random();
        int number = random.nextInt(10);
        return number;
    }
}
