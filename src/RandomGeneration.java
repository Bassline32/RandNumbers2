import java.util.Random;

public class RandomGeneration {
    private int minBoarder;
    private int maxBoarder;
    Random random = new Random();

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
    public int getRandom() {
        return random.nextInt((maxBoarder - minBoarder) + 1) + minBoarder;
    }


}
