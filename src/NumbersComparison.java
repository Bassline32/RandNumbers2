
public class NumbersComparison {
    public int getNumberComparison() throws Exception {
        RandomGeneration randomGeneration = new RandomGeneration();
        UserNumber userNumber = new UserNumber();

        if (randomGeneration.getRandom() == userNumber.getUserNumber()) {
            System.out.println("Вы выиграли мистер");
    }
        else {
            System.out.println("Вы проиграли Сэр");
    }
        return 0;
    }
}

