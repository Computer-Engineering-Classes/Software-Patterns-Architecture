package pt.utad.mei.aps;

import java.util.Scanner;

// Originator
public class Calculator {
    private double result;
    private String operator;
    private String commandText;

    public Calculator() {
        result = 0;
        operator = "";
        commandText = "0";
    }

    public String readOperator() {
        System.out.print("Enter operator: ");
        Scanner scanner = new Scanner(System.in);
        operator = scanner.next();
        if (!operator.matches("[+\\-*/uUeE]")) {
            System.out.println("Invalid operator");
            operator = "";
        }
        return operator;
    }

    public void readNumber() {
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        double operand = scanner.nextDouble();
        if (operator.equals("")) {
            result = operand;
            commandText = String.valueOf(operand);
        } else {
            performOperation(operand);
        }
    }

    private void performOperation(double operand) {
        switch (operator) {
            case "+" -> result += operand;
            case "-" -> result -= operand;
            case "*" -> result *= operand;
            case "/" -> result /= operand;
        }
        commandText += " " + operator + " " + operand;
    }

    public Memento save() {
        return new Memento(result, operator, commandText);
    }

    public void restore(Memento memento) {
        result = memento.getResult();
        operator = memento.getOperator();
        commandText = memento.getCommandText();
    }

    public void print() {
        System.out.println(commandText + " = " + result);
    }

    public static class Memento {
        private final double result;
        private final String operator;
        private final String commandText;

        private Memento(double result, String operator, String commandText) {
            this.result = result;
            this.operator = operator;
            this.commandText = commandText;
        }

        private double getResult() {
            return result;
        }

        private String getOperator() {
            return operator;
        }

        String getCommandText() {
            return commandText;
        }
    }
}
