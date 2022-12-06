package pt.utad.mei.aps;

public class ItalicText extends TextDecorator {
    public ItalicText(Text text) {
        super(text);
    }

    @Override
    public void render() {
        System.out.print("<i>");
        super.render();
        System.out.print("</i>");
    }
}
