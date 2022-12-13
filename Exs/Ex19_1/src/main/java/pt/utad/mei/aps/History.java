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
        // first state is the initial state and cannot be undone
        if (history.size() <= 1) return;
        // remove last state
        history.pop();
        // restore previous state
        calculator.restore(history.peek());
    }
}
