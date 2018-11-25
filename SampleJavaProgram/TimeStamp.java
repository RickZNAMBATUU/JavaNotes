import java.text.SimpleDateFormat;
import java.util.Date;

class TimeStamp {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyy, EEE HH:mm:ss");
        String formattedDate = formatter.format(now);
        System.out.printf("%s > Hello, Fred!", formattedDate);
    }
}
