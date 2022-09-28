package pt.utad.mei.aps;


public class Aula_01 {

    public static void main(String[] args) {
        var person = new Person("Diogo Medeiros", 20);
        System.out.printf("Hello %s, you are %s years old!%n", person.getName(), person.getAge());
    }
}
