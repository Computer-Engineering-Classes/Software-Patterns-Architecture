package pt.utad.mei.aps;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

// Originator
public class Calculator {
    private BigDecimal result;
    private String operator;
    private String commandText;

    public Calculator() {
        result = BigDecimal.ZERO;
        operator = "";
        commandText = "0";
    }

    public String readOperator() {
        System.out.print("Enter operator: ");
        Scanner scanner = new Scanner(System.in);
        operator = scanner.next();
        if (!operator.matches("[+\\-*/%uUeE]")) {
            System.out.println("Invalid operator");
            operator = "";
        }
        return operator;
    }

    public void readNumber() {
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        BigDecimal operand = scanner.nextBigDecimal();
        performOperation(operand);
    }

    private void performOperation(BigDecimal operand) {
        if (operator.equals("")) {
            result = operand;
            commandText = operand.toString();
            return;
        }
        switch (operator) {
            case "+" -> result = result.add(operand);
            case "-" -> result = result.subtract(operand);
            case "*" -> result = result.multiply(operand);
            case "/" -> result = result.divide(operand, 10, RoundingMode.HALF_UP);
            case "%" -> result = result.remainder(operand);
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

    record Memento(BigDecimal result, String operator, String commandText) {
    }
}
