import java.util.Arrays;

class BirdWatcher {
    private int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }
    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay.length == 0 ? 0 : birdsPerDay[birdsPerDay.length -1];
    }

    public int incrementTodaysCount() {
        int idx = birdsPerDay.length - 1;
        birdsPerDay[idx] = ++birdsPerDay[idx];
        return birdsPerDay[idx];
    }

    public boolean hasDayWithoutBirds() {
        return Arrays.stream(birdsPerDay).filter(a -> a == 0).findAny().isPresent();
    }

    public int getCountForFirstDays(int numberOfDays) {
       return Arrays.stream(birdsPerDay).limit(numberOfDays).sum();
    }

    public int getBusyDays() {
        return (int) Arrays.stream(birdsPerDay).filter(a -> a >= 5).count();
    }
}
