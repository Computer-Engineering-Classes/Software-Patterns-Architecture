package pt.utad.mei.aps;

// Caretaker
public class History {
    private static final int MAX_SIZE = 10;
    private final Document document;
    private final Document.Memento[] states;
    private int current;

    public History(Document document) {
        this.document = document;
        states = new Document.Memento[MAX_SIZE];
        current = 0;
    }

    public void backup() {
        if (current < MAX_SIZE) {
            states[current++] = document.save();
        }
    }

    public void undo() {
        if (current > 0) {
            document.restore(states[--current]);
        }
    }
}
