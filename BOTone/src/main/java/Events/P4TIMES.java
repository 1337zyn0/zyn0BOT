package Events;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class P4TIMES extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        DayChecker x = new DayChecker();
        String Tag = x.DayChecker();
        Zeiten y = new Zeiten();
        String uhrzeit = y.getTime();
        LocalTime time = LocalTime.parse(uhrzeit);
        String messageSent = event.getMessage().getContentRaw();
        if (messageSent.equalsIgnoreCase("!modi")) {
            //System.out.println(Hour + ":" +  Minute);
            if (Tag.equals("Monday")) {
                Montag mo = new Montag();
                String mon = mo.getModus();
                event.getChannel().sendMessage(mon).queue();
            } else if (Tag.equals("Tuesday")) {
                Dienstag di = new Dienstag();
                String die = di.getModus();
                event.getChannel().sendMessage(die).queue();
            } else if (Tag.equals("Wednesday")) {
                Mittwoch mi = new Mittwoch();
                String mit = mi.getModus();
                event.getChannel().sendMessage(mit).queue();
            } else if (Tag.equals("Thursday")) {
                Donnerstag doners = new Donnerstag();
                String don = doners.getModus();
                event.getChannel().sendMessage(don).queue();
            } else if (Tag.equals("Friday")) {
                Freitag fr = new Freitag();
                String frei = fr.getModus();
                event.getChannel().sendMessage(frei);
            } else if (Tag.equals("Saturday")) {
                Samstag sa = new Samstag();
                String sam = sa.getModus();
                event.getChannel().sendMessage(sam).queue();
            } else if (Tag.equals("Sunday")) {
                Sonntag so = new Sonntag();
                String son = so.getModus();
                event.getChannel().sendMessage(son).queue();
            }
        }
    }

    public static boolean isBetween(LocalTime candidate, LocalTime start,
            LocalTime end) {
        return !candidate.isBefore(start) && !candidate.isAfter(end);  // Inclusive.
    }
}
