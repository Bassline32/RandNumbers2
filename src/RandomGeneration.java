import java.util.Random;

public class RandomGeneration {
    private int minBoarder;
    private int maxBoarder;
    private int currentRandomNumber;
    private final Random random = new Random();

    //геттеры и сеттеры параметрами диапазона
    public void setMinBoarder(int minBoarder) {
        this.minBoarder = minBoarder;
    }

    public int getMinBoarder() {
        return minBoarder;
    }

    public void setMaxBoarder(int maxBoarder) {
        this.maxBoarder = maxBoarder;
    }

    public int getMaxBoarder() {
        return maxBoarder;
    }

    //генерируем случайное число в рамках заданного диапазона
    public void generatedRandom() {
        currentRandomNumber = random.nextInt(minBoarder, maxBoarder);
    }

    //сохраняем сгенерированное случайное число
    public int getRandom() {
        return currentRandomNumber;
    }

    //перезаписываем случайное число
    public void reGeneratedRandom() {
        generatedRandom();
    }

}