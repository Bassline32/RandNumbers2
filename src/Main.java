
public class Main {
    public static void main(String[] args) throws Exception {

        SelectDifficult selectDifficult = new SelectDifficult();
        selectDifficult.choiceDifficult();

        UserNumber userNumber = new UserNumber(selectDifficult.randomGeneration);
        userNumber.getUserNumber();

        NumbersComparison numbersComparison = new NumbersComparison();
        numbersComparison.compare(userNumber, selectDifficult.randomGeneration);
    }
}

