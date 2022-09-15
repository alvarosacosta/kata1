
package kata_1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private final String name;
    private final Calendar Birthdate;
    private final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);

    public Person(String name, Calendar Birthdate) {
        this.name = name;
        this.Birthdate = Birthdate;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthdate() {
        return Birthdate;
    }
    
    public int getAge(){
        Calendar today = GregorianCalendar.getInstance();
        return (int) (milliSecondsToYear(today.getTimeInMillis() -
                Birthdate.getTimeInMillis()));
    }
    
    private long milliSecondsToYear(long milles) {
        return milles / MILLISECONDS_PER_YEAR;
    }
    
}
