package pt.utad.mei.aps;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Calculator calculator = new Calculator();
        History history = new History(calculator);
        String operator;
        do {
            calculator.readNumber();
            calculator.print();
            do {
                operator = calculator.readOperator();
                if (operator.matches("[uU]")) {
                    history.undo();
                    calculator.print();
                }
            } while (!operator.matches("[+\\-*/%eE]"));
            history.backup();
        } while (!operator.matches("[eE]"));
    }
}