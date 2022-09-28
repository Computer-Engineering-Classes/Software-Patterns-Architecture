package pt.utad.mei.aps;

import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ClassCharacteristics {

    public static void main(String[] args) throws ClassNotFoundException {
        var classObj = Class.forName("pt.utad.mei.aps.Person");
        System.out.println("\nClass fields:");

        var fields = classObj.getDeclaredFields();
        for (var field : fields) {
            System.out.println(field);
        }

        System.out.println("\nOther characteristics:");
        System.err.println("\nAccess modifiers:");

        var modifier = classObj.getModifiers();
        System.out.println("Private: " + Modifier.isPrivate(modifier));
        System.out.println("Public: " + Modifier.isPublic(modifier));
        System.out.println("Protected: " + Modifier.isProtected(modifier));

        System.out.println("\nClass package:");
        System.out.println(classObj.getPackage());

        System.out.println("\nSuperclass:");
        System.out.println(classObj.getSuperclass());

        System.out.println("\nInterfaces:");
        System.out.println(Arrays.toString(classObj.getInterfaces()));
    }
}
