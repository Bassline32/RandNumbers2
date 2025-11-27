import java.util.Scanner;

public class NumbersComparison {
    public void compare(UserNumber userNumber, RandomGeneration randomGeneration) throws Exception {

        AttemptionTime attemptionTime = new AttemptionTime();

        int attemptCounter = 0;

        attemptionTime.StartTime();

        while (true) {
            attemptCounter++;
            try {
                int userInput = userNumber.getUserNumber();
                int randomNumber = randomGeneration.getRandom();

                if (userInput == randomNumber) {
                    attemptionTime.EndTime();
                    System.out.println("Вы победили. Число попыток: " + attemptCounter + " Ваше время попытки в секндах " + attemptionTime.getTime());
                    System.out.println(" Сгенерированное число = " + randomNumber);
                    break;
                } else {
                    System.out.println("Вы проиграли");
                }
                System.out.print(" Ваше число = " + userInput);
                System.out.println(" Сгенерированное число ***** " + randomNumber);
            } catch (Exception e) {
                throw new Exception(e);
            }
        }
    }
}
