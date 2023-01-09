package pt.utad.mei.aps;

public record RssItem(String title, String description, String link, String pubDate) {
    @Override
    public String toString() {
        return "RssItem{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", link='" + link + '\'' +
                ", pubDate='" + pubDate + '\'' +
                '}';
    }
}
