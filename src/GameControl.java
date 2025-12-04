import java.util.Scanner;

public class GameControl {
    Scanner scanner = new Scanner(System.in);

    public void gameControl() throws Exception {

        SelectDifficult selectDifficult = new SelectDifficult();
        RandomGeneration randomGeneration = selectDifficult.choiceDifficult();
        UserNumber userNumber = new UserNumber();
        NumbersComparison numbersComparison = new NumbersComparison();
        numbersComparison.compare(userNumber, randomGeneration);

        while (true) {
            System.out.println("Вы зотите сыграть ещё раз?");
            System.out.println("Введите ДА или НЕТ");
            String userChoice = scanner.nextLine();

            if (userChoice.equalsIgnoreCase("ДА")) {
                gameControl();
            } else if (userChoice.equalsIgnoreCase("НЕТ")) {
                return;
            } else {
                System.out.println("Вы ввели некорректное число, попробуйте ещё раз");
            }
        }
    }
}

