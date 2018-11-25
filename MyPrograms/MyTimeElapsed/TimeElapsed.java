import java.util.*;

class TimeElapsed {
    public static void main(String[] args) {
        TimeClass currentTime = new TimeClass();
        TimeClass currentTime2 = new TimeClass(5);
        TimeClass currentTime3 = new TimeClass(5, 25);
        TimeClass currentTime4 = new TimeClass(5, 25, 55);

        System.out.printf("%s\n", currentTime.toMilitaryTime());
        System.out.printf("%s\n", currentTime2.toMilitaryTime());
        System.out.printf("%s\n", currentTime3.toMilitaryTime());
        System.out.printf("%s\n", currentTime4.toMilitaryTime());
    }
}
