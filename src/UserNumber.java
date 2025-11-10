import java.util.InputMismatchException;
import java.util.Scanner;

public class UserNumber {
    public int getUserNumber() throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
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
}
