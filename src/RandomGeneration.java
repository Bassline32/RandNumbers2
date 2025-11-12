import java.util.Random;

public class RandomGeneration {
    public int getRandom() {
        System.out.println("Число сгенерированное");
        Random random = new Random();
        return random.nextInt(10) + 1;
    }
}
