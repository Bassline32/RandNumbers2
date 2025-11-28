
public class AttemptionTime {

    private long startTime;
    private long endTime;

    public void startTime() {
        startTime = System.currentTimeMillis();
    }

    public void endTime() {
        endTime = System.currentTimeMillis();
    }

    public long getTime() {
        return (endTime - startTime) / 1000;
    }
}
