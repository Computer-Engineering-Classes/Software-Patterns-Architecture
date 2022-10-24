package pt.utad.mei.aps;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public abstract class Pool<T> {
    private final int size;
    protected BlockingQueue<T> objects;

    public Pool(int size) {
        this.size = size;
        init();
    }

    private void init() {
        objects = new LinkedBlockingQueue<>(size);
        for (int i = 0; i < size; i++) {
            // add objects to pool
            addObject();
        }
    }

    public abstract T get();

    public abstract void release(T t);

    protected abstract void addObject();
}