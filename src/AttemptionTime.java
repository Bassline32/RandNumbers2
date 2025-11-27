
public class AttemptionTime {

    private long startTime;
    private long endTime;

    public void StartTime() {
        startTime = System.currentTimeMillis();
    }

    public void EndTime() {
        endTime = System.currentTimeMillis();
    }

    public long getTime() {
        return (endTime - startTime) / 1000;
    }
}
