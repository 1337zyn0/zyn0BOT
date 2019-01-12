package Events;

import static Events.P4TIMES.isBetween;

import java.time.LocalTime;

public class Donnerstag {
    public String getModus;

    public String Donnerstag() {
        String x = getModus();
        return x;
    }

    public String getModus() {
        Zeiten y = new Zeiten();
        String uhrzeit = y.getTime();
        LocalTime time = LocalTime.parse(uhrzeit);
        ;
        String jetztigermodus = "";
        if (isBetween(time, LocalTime.of(0, 0),
                LocalTime.of(12, 20))) {
            if (isBetween(time, LocalTime.of(0, 0),
                    LocalTime.of(0, 20))) {
                jetztigermodus = "Battle Survivor 4v4";
            } else if (isBetween(time, LocalTime.of(0, 21),
                    LocalTime.of(1, 20))) {
                jetztigermodus = "Battle Royal Random 3v3";
            } else if (isBetween(time, LocalTime.of(1, 21),
                    LocalTime.of(2, 20))) {
                jetztigermodus = "Battle Royal Special 2v2";
            } else if (isBetween(time, LocalTime.of(2, 21),
                    LocalTime.of(3, 20))) {
                jetztigermodus = "Battle of Worlds";
            } else if (isBetween(time, LocalTime.of(3, 21),
                    LocalTime.of(4, 20))) {
                jetztigermodus = "War of Gods";
            } else if (isBetween(time, LocalTime.of(4, 21),
                    LocalTime.of(5, 20))) {
                jetztigermodus = "Battle of Titans";
            }
            if (isBetween(time, LocalTime.of(5, 21),
                    LocalTime.of(7, 20))) {
                jetztigermodus = "No Mode at 6, Battle of Worlds at 7";
            } else if (isBetween(time, LocalTime.of(7, 21),
                    LocalTime.of(8, 20))) {
                jetztigermodus = "Battle of Titans";
            } else if (isBetween(time, LocalTime.of(8, 21),
                    LocalTime.of(9, 20))) {
                jetztigermodus = "Battle Royal Special 2v2";
            } else if (isBetween(time, LocalTime.of(9, 21),
                    LocalTime.of(10, 20))) {
                jetztigermodus = "Battle Royal Random 3v3";
            } else if (isBetween(time, LocalTime.of(10, 21),
                    LocalTime.of(11, 20))) {
                jetztigermodus = "Battle of Worlds";
            } else if (isBetween(time, LocalTime.of(11, 21),
                    LocalTime.of(12, 20))) {
                jetztigermodus = "War of Gods";
            }
        } else if (isBetween(time, LocalTime.of(12, 21),
                LocalTime.of(18, 10))) {

            if (isBetween(time, LocalTime.of(12, 21),
                    LocalTime.of(13, 20))) {
                jetztigermodus = "Battle Royal Random 3v3";
            } else if (isBetween(time, LocalTime.of(13, 21),
                    LocalTime.of(14, 20))) {
                jetztigermodus = "War of Gods";
            } else if (isBetween(time, LocalTime.of(14, 21),
                    LocalTime.of(15, 20))) {
                jetztigermodus = "Battle of Worlds";
            } else if (isBetween(time, LocalTime.of(15, 21),
                    LocalTime.of(16, 20))) {
                jetztigermodus = "Battle Royal 100% 3v3";
            } else if (isBetween(time, LocalTime.of(16, 21),
                    LocalTime.of(17, 20))) {
                jetztigermodus = "Battle Royal Survivor 4v$";
            } else if (isBetween(time, LocalTime.of(17, 21),
                    LocalTime.of(18, 10))) {
                jetztigermodus = "War of Gods";
            }
        } else {
            if (isBetween(time, LocalTime.of(18, 11),
                    LocalTime.of(20, 20))) {
                jetztigermodus = "Territory War at 19, Battle Royal " +
                        "Survivor at 20";
            } else if (isBetween(time, LocalTime.of(20, 21),
                    LocalTime.of(21, 20))) {
                jetztigermodus = "King of the Hill";
            } else if (isBetween(time, LocalTime.of(21, 21),
                    LocalTime.of(22, 20))) {
                jetztigermodus = "Battle Royal 100% 3v3";
            } else if (isBetween(time, LocalTime.of(22, 21),
                    LocalTime.of(23, 20))) {
                jetztigermodus = "War of Gods";
            } else if (isBetween(time, LocalTime.of(23, 21),
                    LocalTime.of(23, 59))) {
                jetztigermodus = "Battle Royal 100% 3v3";
            }
        }
        return jetztigermodus;
    }
}