
public class NumbersComparison {
    public void compare(UserNumber userNumber, RandomGeneration randomGeneration) throws Exception {

        int attemptCounter = 0;

        while (true) {
            attemptCounter++;
            try {
                int userInput = userNumber.getUserNumber();
                int randomNumber = randomGeneration.getRandom();

                if (userInput == randomNumber) {
                    System.out.println("Вы победили. Число попыток: " + attemptCounter);
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
