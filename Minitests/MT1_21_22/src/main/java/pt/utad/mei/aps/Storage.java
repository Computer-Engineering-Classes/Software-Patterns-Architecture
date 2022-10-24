package pt.utad.mei.aps;

import java.util.ArrayList;

public abstract class Storage {
    private final long capacity;

    private final ArrayList<Content> contents;

    public Storage(long capacity) {
        this.capacity = capacity;
        contents = new ArrayList<>();
    }

    public long getCapacity() {
        return capacity;
    }

    public long getAvailableStorage() {
        var storedSize = this.contents.stream()
                .mapToLong(Content::size)
                .sum();
        return capacity - storedSize;
    }

    public int storeContent(Content content) {
        this.contents.add(content);
        return content.hashCode();
    }

    public Content retrieveContent(int id) {
        return this.contents.stream()
                .filter(x -> x.hashCode() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public abstract String toString();
}
