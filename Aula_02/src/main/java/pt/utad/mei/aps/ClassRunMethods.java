package pt.utad.mei.aps;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;
import java.time.Month;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClassRunMethods {

    public static void main(String[] args) {
        var pessoa = new Person("Diogo", LocalDate.of(2001, Month.NOVEMBER, 20));
        try {
            var classObj = Class.forName("pt.utad.mei.aps.Person");

            var method = classObj.getMethod("getAge");
            var result = method.invoke(pessoa);
            System.out.println("Age = " + result);

            System.out.println("\n\nChange class field:");
            var campo = classObj.getDeclaredField("birthDate");
            if (!campo.canAccess(pessoa)) {
                campo.setAccessible(true);
            }
            campo.set(pessoa, LocalDate.of(1999, Month.AUGUST, 13));
            System.out.println("Age = " + pessoa.getAge());

        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException |
                 InvocationTargetException | NoSuchFieldException ex) {
            Logger.getLogger(ClassRunMethods.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
