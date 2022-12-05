package refactoring.guru;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompoundShape extends BaseShape {
    protected List<Shape> children = new ArrayList<>();

    public CompoundShape(Shape... components) {
        super(0, 0, Color.BLACK);
        add(components);
    }

    public void add(Shape shape) {
        children.add(shape);
    }

    public void add(Shape... shapes) {
        Collections.addAll(children, shapes);
    }

    @SuppressWarnings("unused")
    public void remove(Shape shape) {
        children.remove(shape);
    }

    public void clear() {
        children.clear();
    }

    @Override
    public int getX() {
        if (children.isEmpty()) {
            return 0;
        }
        return children.stream()
                .mapToInt(Shape::getX)
                .min()
                .getAsInt();
    }

    @Override
    public int getY() {
        if (children.isEmpty()) {
            return 0;
        }
        return children.stream()
                .mapToInt(Shape::getY)
                .min()
                .getAsInt();
    }

    @Override
    public int getWidth() {
        int maxWidth = 0;
        int x = getX();
        for (Shape child : children) {
            int childWidth = child.getX() - x + child.getWidth();
            if (childWidth > maxWidth) {
                maxWidth = childWidth;
            }
        }
        return maxWidth;
    }

    @Override
    public int getHeight() {
        int maxHeight = 0;
        int y = getY();
        for (Shape child : children) {
            int childHeight = child.getY() - y + child.getHeight();
            if (childHeight > maxHeight) {
                maxHeight = childHeight;
            }
        }
        return maxHeight;
    }

    @Override
    public void move(int x, int y) {
        for (Shape child : children) {
            child.move(x, y);
        }
    }

    @Override
    public boolean isInsideBounds(int x, int y) {
        return children.stream().anyMatch(child -> child.isInsideBounds(x, y));
    }

    @Override
    public void unSelect() {
        super.unSelect();
        children.forEach(Shape::unSelect);
    }

    public boolean selectChildAt(int x, int y) {
        for (Shape child : children) {
            if (child.isInsideBounds(x, y)) {
                child.select();
                return true;
            }
        }
        return false;
    }

    @Override
    public void paint(Graphics graphics) {
        if (isSelected()) {
            enableSelectionStyle(graphics);
            graphics.drawRect(getX() - 1, getY() - 1, getWidth() + 1, getHeight() + 1);
            disableSelectionStyle(graphics);
        }

        for (Shape child : children) {
            child.paint(graphics);
        }
    }
}
