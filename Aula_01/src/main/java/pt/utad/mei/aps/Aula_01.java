/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package pt.utad.mei.aps;

/**
 *
 * @author diogo
 */
public class Aula_01 {

    public static void main(String[] args) {
        var p = new Person("Diogo Medeiros", 20);
        System.out.println("Hello %s, you are %s years old!".formatted(p.getName(), p.getAge()));
    }
}
