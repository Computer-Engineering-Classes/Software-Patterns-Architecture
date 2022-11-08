package pt.utad.mei.aps;

import java.util.ArrayList;

public class Diagram implements DiagramObject {
    public ArrayList<DiagramObject> objects;

    public Diagram() {
        this.objects = new ArrayList<>();
    }

    public void add(DiagramObject object) {
        objects.add(object);
    }

    public void remove(DiagramObject object) {
        objects.remove(object);
    }

    public ArrayList<DiagramObject> getObjects() {
        return objects;
    }

    public void draw(String color) {
        for (DiagramObject object : objects) {
            object.draw(color);
        }
    }
}
