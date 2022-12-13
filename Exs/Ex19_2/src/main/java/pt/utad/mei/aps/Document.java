package pt.utad.mei.aps;

// Originator
public class Document {
    private String content;
    private String fontName;
    private int fontSize;

    public Document(String content, String fontName, int fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public Memento save() {
        return new Memento(content, fontName, fontSize);
    }

    public void restore(Memento memento) {
        content = memento.content();
        fontName = memento.fontName();
        fontSize = memento.fontSize();
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }

    // Memento
    public record Memento(String content, String fontName, int fontSize) {
    }
}
