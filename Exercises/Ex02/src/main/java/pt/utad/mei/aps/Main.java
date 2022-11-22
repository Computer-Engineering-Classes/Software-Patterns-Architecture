package pt.utad.mei.aps;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;
import java.time.Month;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        var birthDate = LocalDate.of(2001, Month.NOVEMBER, 20);
        var person = new Person("Diogo", birthDate);
        try {
            var classObj = Class.forName("pt.utad.mei.aps.Person");

            var method = classObj.getMethod("getAge");
            var result = method.invoke(person);
            System.out.println("Age = " + result);

            System.out.println("\n\nChange class field:");
            var field = classObj.getDeclaredField("birthDate");
            if (!field.canAccess(person)) {
                field.setAccessible(true);
            }
            field.set(person, LocalDate.of(1999, Month.AUGUST, 13));
            System.out.println("Age = " + person.getAge());

        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException |
                 InvocationTargetException | NoSuchFieldException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
