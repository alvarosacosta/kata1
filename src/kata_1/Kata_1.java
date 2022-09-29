package kata_1;

import java.time.LocalDate;
import java.time.Month;

public class Kata_1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2002, 10, 14);
        
        Person lolo = new Person("Lolo", date);
        System.out.println(lolo.getName() + " tiene " + lolo.getAge() + " años.");
    }
    
}
