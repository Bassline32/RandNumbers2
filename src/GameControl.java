import java.util.InputMismatchException;
import java.util.Scanner;


public class GameControl {
    Scanner scanner = new Scanner(System.in);

    public void gameControl() {

        while (true) {
            try {
                //строки 17-21 отвечают за всю логику игры в виде генераций чисел, сравнения и ввода числа пользователем
                SelectDifficult selectDifficult = new SelectDifficult();
                RandomGeneration randomGeneration = selectDifficult.choiceDifficult();
                UserNumber userNumber = new UserNumber();
                NumbersComparison numbersComparison = new NumbersComparison();
                numbersComparison.compare(userNumber, randomGeneration);

                //логика продолжения игры и выхода из программы
                boolean validAnswer = false;
                while (!validAnswer) {

                    System.out.println("Хотите сыграть ещё раз?");
                    System.out.println(" (ДА) (НЕТ)");
                    String userChoice = scanner.nextLine().toLowerCase();


                    if (userChoice.equalsIgnoreCase("да")) {
                        validAnswer = true;
                    } else if (userChoice.equalsIgnoreCase("нет")) {
                        System.out.println("Вы вышли из программы");
                        break;
                    } else {
                        System.out.println("Вы ввели некорректное значение");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели строку. Введите число");
                scanner.next();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}