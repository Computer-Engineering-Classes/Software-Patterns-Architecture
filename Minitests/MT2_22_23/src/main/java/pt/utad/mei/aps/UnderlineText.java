package pt.utad.mei.aps;

public class UnderlineText extends TextDecorator {
    public UnderlineText(Text text) {
        super(text);
    }

    @Override
    public void render() {
        System.out.print("<u>");
        super.render();
        System.out.print("</u>");
    }
}
