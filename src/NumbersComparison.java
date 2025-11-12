
public class NumbersComparison {
    public void compare(UserNumber userNumber, RandomGeneration randomGeneration) throws Exception {
        try {
            int userInput = userNumber.getUserNumber();
            int generatedNumber = randomGeneration.getRandom();

            if (userInput == generatedNumber) {
                System.out.println("Вы победили");
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

