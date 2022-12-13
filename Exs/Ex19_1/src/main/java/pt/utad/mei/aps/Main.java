package pt.utad.mei.aps;

public class Main {
    public static void main(String[] args) {
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
            } while (!operator.matches("[+\\-*/eE]"));
            history.backup();
        } while (!operator.matches("[eE]"));
    }
}