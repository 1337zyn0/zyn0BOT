import static Events.P4TIMES.isBetween;

import Events.P4TIMES;
import Events.Zeiten;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Bot {

    public static void main(String[] args) throws Exception {

        JDA jda = new JDABuilder("NTMzMDAxMTU0OTQ3NDQ4ODQy.Dxp9vQ.XAluYiH4lF1ZHxltkcBexlDlzRc").build();
        jda.addEventListener(new P4TIMES());

//        Zeiten x = new Zeiten();
//        String uhrzeit = Zeiten.getTime();
//
//        LocalTime time = LocalTime.parse(uhrzeit);
//        System.out.println(isBetween(time, LocalTime.of(22, 0),
//                LocalTime.of(23, 0)));
    }


}