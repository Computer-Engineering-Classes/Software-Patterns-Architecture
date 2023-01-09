package pt.utad.mei.aps;

import java.util.HashSet;
import java.util.Set;

public class RssFeedReader implements RssFeedObserver {
    private final String name;
    private final Set<RssFeed> feeds = new HashSet<>();

    public RssFeedReader(String name, RssFeed... feeds) {
        this.name = name;
        for (RssFeed feed : feeds) {
            feed.addObserver(this);
            this.feeds.add(feed);
        }
    }

    @Override
    public void update(RssItem item) {
        System.out.println("User '" + this.name + "' received item: " + item);
    }

    @Override
    public String toString() {
        return "RssFeedReader{" +
                "name='" + name + '\'' +
                ", feeds=" + feeds.stream()
                .map(RssFeed::getTitle)
                .reduce((s1, s2) -> s1 + ", " + s2)
                .orElse("") +
                '}';
    }

    public void removeFeed(RssFeed feed) {
        feed.removeObserver(this);
        this.feeds.remove(feed);
    }
}
