package pt.utad.mei.aps;

public abstract class TextDecorator implements Text {
    private final Text text;

    public TextDecorator(Text text) {
        this.text = text;
    }

    @Override
    public void render() {
        text.render();
    }
}
