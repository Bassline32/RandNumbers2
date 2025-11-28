
public class Main {
    public static void main(String[] args) throws Exception {

        SelectDifficult selectDifficult = new SelectDifficult();

        RandomGeneration randomGeneration = selectDifficult.choiceDifficult();

        UserNumber userNumber = new UserNumber();

        NumbersComparison numbersComparison = new NumbersComparison();
        numbersComparison.compare(userNumber, randomGeneration);
    }
}

