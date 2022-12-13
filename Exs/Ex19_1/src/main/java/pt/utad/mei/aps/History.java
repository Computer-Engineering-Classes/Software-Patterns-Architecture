package pt.utad.mei.aps;

import java.util.Stack;

// Caretaker
public class History {
    private final Calculator calculator;
    private final Stack<Calculator.Memento> history;

    public History(Calculator calculator) {
        this.calculator = calculator;
        history = new Stack<>();
    }

    public void backup() {
        history.push(calculator.save());
    }

    public void undo() {
        if (!history.isEmpty()) {
            calculator.restore(history.pop());
        }
    }
}
