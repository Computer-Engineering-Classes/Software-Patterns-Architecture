package pt.utad.mei.aps;

public class BoldText extends TextDecorator {
    public BoldText(Text text) {
        super(text);
    }

    @Override
    public void render() {
        System.out.print("<b>");
        super.render();
        System.out.print("</b>");
    }
}
