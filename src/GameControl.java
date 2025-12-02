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
                System.out.println("Хотите сыграть ещё раз?");
                System.out.println(" 1(ДА) 2(НЕТ)");
                if (scanner.nextInt() != 1) {
                    System.out.println("Вы вышли из программы");
                    break;
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