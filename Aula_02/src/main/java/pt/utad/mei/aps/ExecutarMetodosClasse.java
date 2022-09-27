package pt.utad.mei.aps;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;
import java.time.Month;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExecutarMetodosClasse {

    public static void main(String[] args) {
        var pessoa = new Pessoa("Diogo", LocalDate.of(2001, Month.NOVEMBER, 20));
        try {
            var classe = Class.forName("pt.utad.mei.aps.Pessoa");

            var metodo = classe.getMethod("getIdade");
            var resultado = metodo.invoke(pessoa);
            System.out.println("Idade = " + resultado);
            
            System.out.println("\n\nAlterar atributo da classe:");
            var campo = classe.getDeclaredField("dataNascimento");           
            if (!campo.canAccess(pessoa))
            {
                campo.setAccessible(true);
            }
            campo.set(pessoa, LocalDate.of(1999, Month.AUGUST, 13));           
            System.out.println("Idade = " + pessoa.getIdade());
            
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException | InvocationTargetException | NoSuchFieldException ex) {
            Logger.getLogger(ExecutarMetodosClasse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
