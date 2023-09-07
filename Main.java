import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Date x = new Date();
        System.out.println(new SimpleDateFormat("MM-dd-yyyy").format(x));
    }
}