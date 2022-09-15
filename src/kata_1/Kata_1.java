package kata_1;

import java.util.Date;

public class Kata_1 {

    public static void main(String[] args) {
        Person lolo = new Person("Lolo", new Date(102, 10, 25));
        System.out.println(lolo.getName() + " tiene " + lolo.getAge() + " años.");
    }
    
}
