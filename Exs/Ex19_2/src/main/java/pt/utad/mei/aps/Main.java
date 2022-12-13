package pt.utad.mei.aps;

public class Main {
    public static void main(String[] args) {
        Document document = new Document("Hello World", "Arial", 12);
        History history = new History(document);

        System.out.println("Document: " + document);
        history.backup();

        document.setContent("Design Patterns");
        document.setFontSize(14);
        history.backup();

        document.setContent("Design Patterns in Java");
        document.setFontName("Times New Roman");
        history.backup();

        document.setContent("Design Patterns in Java - Memento");
        document.setFontName("Verdana");

        System.out.println("Current document: " + document);

        for (int i = 0; i < 3; i++) {
            history.undo();
            System.out.println("Undo " + (i + 1) + ": " + document);
        }
    }
}