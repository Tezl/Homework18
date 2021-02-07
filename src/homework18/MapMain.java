package homework18;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapMain {

    public int month;


    public static void main(String[] args) {


        Map<String, LocalDate> date = new HashMap<>();


        LocalDate localDate = date.put("Никита", LocalDate.of(1978, 2, 16));
        date.put("Aleksandr Pushkin", LocalDate.of(1799, 6, 6));
        date.put("Даниил", LocalDate.of(1985, 1, 22));
        date.put("Сергей", LocalDate.of(1994, 6, 17));
        date.put("Ivan Krylov", LocalDate.of(1769, 2, 13));
        date.put("Юрий", LocalDate.of(2006, 7, 5));
        date.put("Виталий", LocalDate.of(1997, 9, 29));
        date.put("Владимир", LocalDate.of(1982, 3, 12));
        date.put("Алексей", LocalDate.of(1993, 7, 8));
        date.put("Григорий", LocalDate.of(2001, 11, 14));

    }

    public static int getMonth() {

        return getMonth();

    }

    static void removePeople(Map<String, LocalDate> date) {


        Iterator iterator = date.entrySet().iterator();

        while (iterator.hasNext()) {

            int month = MapMain.getMonth();

            if (month == 6 || month == 7 || month == 8) {
                iterator.remove();

            }
        }
    }


}











