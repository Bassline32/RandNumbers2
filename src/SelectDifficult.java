import java.util.InputMismatchException;
import java.util.Scanner;

public class SelectDifficult {
    RandomGeneration randomGeneration = new RandomGeneration();

    public void choiceDifficult() throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Выберите уровень сложности ");
                System.out.println("легко: в передлах от 1 до 5 или ");
                System.out.println("средне: в передлах от 1 до 20 или ");
                System.out.println("сложно: в передлах от 1 до 100");
                System.out.println("1(легко) 2(средне) 3(сложно)");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        randomGeneration.setMinBoarder(1);
                        randomGeneration.setMaxBoarder(5);
                        break;

                    case 2:
                        randomGeneration.setMinBoarder(1);
                        randomGeneration.setMaxBoarder(20);
                        break;

                    case 3:
                        randomGeneration.setMinBoarder(1);
                        randomGeneration.setMaxBoarder(100);
                        break;
                    default:
                        System.out.println("Такого уровня сложности нет");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели строку. Введите число");
                scanner.next();
            }
        }
    }
}