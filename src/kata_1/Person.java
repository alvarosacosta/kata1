
package kata_1;

import java.util.Date;

public class Person {
    private final String name;
    private final Date Birthdate;

    public Person(String name, Date Birthdate) {
        this.name = name;
        this.Birthdate = Birthdate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthdate() {
        return Birthdate;
    }
    
    public int getAge(){
        return (int) ((new Date().getTime() - Birthdate.getTime())/31536000000L);
    }
    
}
