package Events;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Zeiten {

    public static String Time(){

        String times = getTime();
        return times;
    }

    public static String getTime() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        String currentTime =  sdf.format(cal.getTime());
        return currentTime;
    }
}
