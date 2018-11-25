import java.util.*;

class TimeClass {
    private int hour;
    private int minute;
    private int second;

    public TimeClass() {
        setTime(0, 0, 0);
    }

    public TimeClass(int h) {
        setTime(h, 0, 0);
    }

    public TimeClass(int h, int m) {
        setTime(h, m, 0);
    }

    public TimeClass(int h, int m, int s) {
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

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    public String toMilitaryTime() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
}
