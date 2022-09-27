package pt.utad.mei.aps;

public class ConstrutoresMetodosClasse {

    public static void main(String[] args) throws ClassNotFoundException {
        var classe = Class.forName("pt.utad.mei.aps.Pessoa");

        System.out.println("\nConstrutores:");

        var constructors = classe.getDeclaredConstructors();
        for (var constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println("\nMétodos da classe:");

        var metodos = classe.getDeclaredMethods();
        for (var metodo : metodos) {
            System.out.println("Método: " + metodo);

            var parametros = metodo.getParameterTypes();
            for (var parametro : parametros) {
                System.out.println("\t\t" + parametro);
            }

            var excecoes = metodo.getExceptionTypes();
            System.out.println("\nExceções: " + excecoes.length);

            for (var excecao : excecoes) {
                System.out.println("\t\t" + excecao);
            }
        }

    }

}
