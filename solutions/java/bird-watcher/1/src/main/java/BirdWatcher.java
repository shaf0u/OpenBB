import java.util.Arrays;

public class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }

    // Task 1: Fixed past data
    public static int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }

    // Task 2: Dynamic array length offset
    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    // Task 3: In-place state mutation
    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    // Task 4: Short-circuiting predicate evaluation
    public boolean hasDayWithoutBirds() {
        return Arrays.stream(birdsPerDay).anyMatch(count -> count == 0);
    }

    // Task 5: Stream truncation & primitive reduction
    public int getCountForFirstDays(int numberOfDays) {
        return Arrays.stream(birdsPerDay)
                     .limit(numberOfDays)
                     .sum();
    }

    // Task 6: Intermediate filtering & terminal counting
    public int getBusyDays() {
        return (int) Arrays.stream(birdsPerDay)
                           .filter(count -> count >= 5)
                           .count();
    }
}
