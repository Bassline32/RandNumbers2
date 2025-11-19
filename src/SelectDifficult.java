import java.util.Random;
import java.util.Scanner;

public class SelectDifficult {
    RandomGeneration randomGeneration = new RandomGeneration();
    private int minBoarder;
    private int maxBoarder;
    Random random = new Random();

    public void choiceDifficult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите уровень сложности");
        System.out.println("1(легко) 2(средне) 3(очень сложно почти невозможно) ");

        int choice = scanner.nextInt();

         boolean keepChoice = true;
         while (true) {
        switch (choice) {
            case 1 :
                randomGeneration.setMinBoarder(1);
                randomGeneration.setMaxBoarder(5);
                break;

            case 2 :
                randomGeneration.setMinBoarder(1);
                randomGeneration.setMaxBoarder(20);
                break;

            case 3 :
                randomGeneration.setMinBoarder(1);
                randomGeneration.setMaxBoarder(100);
                break;
            default:
                System.out.println("Такого уровня сложности нет");
        }
    }
}
}