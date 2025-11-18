
public class NumbersComparison {
    public void compare(UserNumber userNumber, RandomGeneration randomGeneration) throws Exception {

        int attemptCounter = 0;

        while (true){
            attemptCounter++;
            try {
                int userInput = userNumber.getUserNumber();
                int generatedNumber = randomGeneration.getRandom();

                if (userInput == generatedNumber) {
                    System.out.println("Вы победили. Число попыток: " + attemptCounter);
                    System.out.println(" Сгенерированное число = " + generatedNumber);
                    break;
                } else {
                    System.out.println("Вы проиграли");

                }
                System.out.print(" Ваше число = " + userInput);
                System.out.println(" Сгенерированное число = " + generatedNumber);
            } catch (Exception e) {
                throw new Exception(e);
            }
        }
    }
}
