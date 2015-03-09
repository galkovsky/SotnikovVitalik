import java.util.Calendar;
import java.util.GregorianCalendar;

public class Publication {

    String title;

    Calendar data = new GregorianCalendar();


    public void publish () {
        System.out.println(title + " " + data.getTime());
    }
}
