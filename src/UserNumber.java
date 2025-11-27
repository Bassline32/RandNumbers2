import java.util.InputMismatchException;
import java.util.Scanner;

public class UserNumber {
    private final RandomGeneration randomGeneration;
    //final = после инициализации переменной её значение не может быть изменено.

    //метод для генерации рандомных значений
    public UserNumber(RandomGeneration randomGeneration) {
        this.randomGeneration = randomGeneration;
    }

    //получаем число от пользователя
    public int getUserNumber() throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                int minBorder = randomGeneration.getMinBoarder();
                int maxBoarder = randomGeneration.getMaxBoarder();

                System.out.println("Введите число от " + minBorder + " до (тест) " + maxBoarder);
                int userNumber = scanner.nextInt();

                if (userNumber < minBorder || userNumber > maxBoarder) {
                    throw new Exception("Число должно находиться в выбранном пределе");
                }
                return userNumber;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели строку. Введите число");
                scanner.next();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}


/* while (true) {
         try {
         System.out.println("Введите число от 1 до 10");
int userNumber = scanner.nextInt();

                if (userNumber < 1 || userNumber > 10) {
        throw new Exception("Число должно находиться в переделе от 1 до 10");
                }
                        return userNumber;
            } catch (InputMismatchException e) {
        System.out.println("Вы ввели строку. Введите число");
                scanner.next();
            } catch (Exception e) {
        System.out.println("Вы ввели число вне заданного диапазона");
            }
                    }
                    }

 */