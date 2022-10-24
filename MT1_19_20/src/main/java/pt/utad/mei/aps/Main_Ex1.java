package pt.utad.mei.aps;

import java.lang.reflect.InvocationTargetException;

public class Main_Ex1 {
    public static void main(String[] args) {
        try {
            var classObj = Class.forName("pt.utad.mei.aps.Q4D");

            var methods = classObj.getDeclaredMethods();

            for (var method : methods) {
                if (method.getName().startsWith("get")) {
                    System.out.println("Getter: " + method);
                }
            }

            var instance = classObj.getConstructor().newInstance();
            var method = classObj.getMethod("getA");
            var returnValue = method.invoke(instance);
            System.out.println("Return value of getA: " + returnValue);

        } catch (NoSuchMethodException | ClassNotFoundException | InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }

    }
}