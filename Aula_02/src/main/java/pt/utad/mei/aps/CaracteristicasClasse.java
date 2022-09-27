package pt.utad.mei.aps;

import java.lang.reflect.Modifier;
import java.util.Arrays;

public class CaracteristicasClasse {

    public static void main(String[] args) throws ClassNotFoundException {
        var classe = Class.forName("pt.utad.mei.aps.Pessoa");

        System.out.println("\nCampos da classe:");

        var atributos = classe.getDeclaredFields();
        for (var atributo : atributos) {
            System.out.println(atributo);
        }

        System.out.println("\nOutras características:");
        System.err.println("\nModificadores de acesso:");

        var modifier = classe.getModifiers();
        System.out.println("Private: " + Modifier.isPrivate(modifier));
        System.out.println("Public: " + Modifier.isPublic(modifier));
        System.out.println("Protected: " + Modifier.isProtected(modifier));

        System.out.println("\nPacote da classe:");
        System.out.println(classe.getPackage());

        System.out.println("\nSuperclasse:");
        System.out.println(classe.getSuperclass());

        System.out.println("\nInterfaces:");
        System.out.println(Arrays.toString(classe.getInterfaces()));
    }
}
