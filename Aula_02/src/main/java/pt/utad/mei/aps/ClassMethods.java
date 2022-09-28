package pt.utad.mei.aps;

public class ClassMethods {

    public static void main(String[] args) throws ClassNotFoundException {
        var classObj = Class.forName("pt.utad.mei.aps.Person");

        System.out.println("\nConstructors:");

        var constructors = classObj.getDeclaredConstructors();
        for (var constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println("\nClass methods:");

        var methods = classObj.getDeclaredMethods();
        for (var method : methods) {
            System.out.println("Method: " + method);

            var parameters = method.getParameterTypes();
            for (var parameter : parameters) {
                System.out.println("\t\t" + parameter);
            }

            var exceptionTypes = method.getExceptionTypes();
            System.out.println("\nExceções: " + exceptionTypes.length);

            for (var exceptionType : exceptionTypes) {
                System.out.println("\t\t" + exceptionType);
            }
        }

    }

}
