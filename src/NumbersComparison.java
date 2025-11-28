public class NumbersComparison {
    public void compare(UserNumber userNumber, RandomGeneration randomGeneration) throws Exception {

        AttemptionTime attemptionTime = new AttemptionTime();

        int attemptCounter = 0;

        attemptionTime.startTime();

        while (true) {
            attemptCounter++;
            try {
                int userInput = userNumber.getUserNumber(randomGeneration.getMinBoarder(), randomGeneration.getMaxBoarder());
                int randomNumber = randomGeneration.getRandom(); //число хранится в рамках одной сессии

                if (userInput == randomNumber) {
                    attemptionTime.endTime();
                    System.out.println("Вы победили. Число попыток: " + attemptCounter + " Ваше время попытки в секндах " + attemptionTime.getTime());
                    System.out.println(" Сгенерированное число = " + randomNumber);
                    randomGeneration.reGeneratedRandom(); //перезаписали число после победы
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
