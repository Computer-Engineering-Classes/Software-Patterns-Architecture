package pt.utad.mei.aps;

import java.util.ArrayList;

public class RssFeed {
    private final String title;
    private final String description;
    private final String link;
    private final String pubDate;
    private final ArrayList<RssItem> items;
    private final ArrayList<RssFeedObserver> observers;

    public RssFeed(String title, String description, String link, String pubDate) {
        this.title = title;
        this.description = description;
        this.link = link;
        this.pubDate = pubDate;
        this.items = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void addItem(RssItem item) {
        this.items.add(item);
        this.notifyObservers(item);
    }

    public void addObserver(RssFeedObserver observer) {
        this.observers.add(observer);
    }

    public void removeObserver(RssFeedObserver observer) {
        this.observers.remove(observer);
    }

    private void notifyObservers(RssItem item) {
        for (RssFeedObserver observer : this.observers) {
            observer.update(item);
        }
    }

    public void details() {
        System.out.println("Title: " + this.title);
        System.out.println("Description: " + this.description);
        System.out.println("Link: " + this.link);
        System.out.println("PubDate: " + this.pubDate);
        System.out.println("Items: " + this.items.size());
    }
}
