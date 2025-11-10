
public class Main {
    public static void main(String[] args) throws Exception {
        RandomGeneration randomGeneration = new RandomGeneration();
        UserNumber userNumber = new UserNumber();

        System.out.println(userNumber.getUserNumber());

        System.out.println(randomGeneration.getRandom());
    }
}
