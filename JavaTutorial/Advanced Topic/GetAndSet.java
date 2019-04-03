import java.util.*;

class GetAndSet {
    // accessor method - get
    // muting method - set

    private int hour;
    private int minute;
    private int second;

    public GetAndSet() {
        setTime(0, 0, 0);
    }

    public GetAndSet(int h) {
        setTime(h, 0, 0);
    }

    public GetAndSet(int h, int m) {
        setTime(h, m, 0);
    }

    public GetAndSet(int h, int m, int s) {
        setTime(h, m, s);
    }

    public void setHour(int h) {
        hour = (hour <= 0 && hour < 24 ? h : 0);
    }

    public void setMinute(int m) {
        minute = (minute <= 0 && minute < 60 ? m : 0);
    }

    public void setSecond(int s) {
        second = (second <= 0 && second < 60 ? s : 0);
    }

    public void setTime(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String toMilitaryTime() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public static void main(String[] args) {
        GetAndSet currentTime = new GetAndSet();
        GetAndSet currentTime2 = new GetAndSet(5);
        GetAndSet currentTime3 = new GetAndSet(5, 25);
        GetAndSet currentTime4 = new GetAndSet(5, 25, 55);

        System.out.printf("%s\n", currentTime.toMilitaryTime());
        System.out.printf("%s\n", currentTime2.toMilitaryTime());
        System.out.printf("%s\n", currentTime3.toMilitaryTime());
        System.out.printf("%s\n", currentTime4.toMilitaryTime());
    }
}
