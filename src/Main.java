
public class Main {
    public static void main(String[] args) throws Exception {

        UserNumber userNumber = new UserNumber();
        RandomGeneration randomGeneration = new RandomGeneration();
        NumbersComparison numbersComparison = new NumbersComparison();

        numbersComparison.compare(userNumber, randomGeneration);
    }
}



