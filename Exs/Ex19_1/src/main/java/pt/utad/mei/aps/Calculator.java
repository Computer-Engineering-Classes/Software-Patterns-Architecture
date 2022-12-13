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
            return;
        }
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
        result = memento.result();
        operator = memento.operator();
        commandText = memento.commandText();
    }

    public void print() {
        System.out.println(commandText + " = " + result);
    }

    record Memento(double result, String operator, String commandText) {
    }
}
