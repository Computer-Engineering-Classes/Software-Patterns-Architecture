package pt.utad.mei.aps;

public class RssFeedReader implements RssFeedObserver {
    private final RssFeed feed;

    public RssFeedReader(RssFeed feed) {
        this.feed = feed;
        feed.addObserver(this);
    }

    public void read() {
        System.out.println("Reading feed...");
        this.feed.details();
    }

    @Override
    public void update(RssItem item) {
        System.out.println("New item: " + item.title());
    }
}
