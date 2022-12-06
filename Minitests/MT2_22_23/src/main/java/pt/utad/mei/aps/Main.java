package pt.utad.mei.aps;

public class Main {
    public static void main(String[] args) {
        System.out.println("Regular text:");
        PlainText text = new PlainText("Hello world!");
        text.render();

        System.out.println("\nBold text:");
        var boldText = new BoldText(text);
        boldText.render();

        System.out.println("\nItalic text:");
        var italicText = new ItalicText(text);
        italicText.render();

        System.out.println("\nUnderlined text:");
        var underlineText = new UnderlineText(text);
        underlineText.render();

        System.out.println("\nBold and italic text:");
        var boldItalicText = new BoldText(italicText);
        boldItalicText.render();
    }
}