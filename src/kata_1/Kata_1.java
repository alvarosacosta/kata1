package kata_1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Kata_1 {

    public static void main(String[] args) {
        Calendar date = GregorianCalendar.getInstance();
        date.set(2002, 10, 28);
        Person lolo = new Person("Lolo", date);
        System.out.println(lolo.getName() + " tiene " + lolo.getAge() + " años.");
    }
    
}
