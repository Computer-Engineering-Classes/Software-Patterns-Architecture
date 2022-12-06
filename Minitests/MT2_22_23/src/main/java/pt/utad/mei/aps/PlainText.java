package pt.utad.mei.aps;

public final class PlainText implements Text {
    private final String words;

    public PlainText(String words) {
        this.words = words;
    }

    @Override
    public void render() {
        System.out.print("<span>" + words + "</span>");
    }
}
