import java.util.InputMismatchException;
import java.util.Scanner;

public class UserNumber {

    //получаем число от пользователя
    public int getUserNumber(int minBoarder, int maxBoarder) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {

                System.out.println("Введите число от " + minBoarder + " до (тест) " + maxBoarder);
                int userNumber = scanner.nextInt();

                if (userNumber < minBoarder || userNumber > maxBoarder) {
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


