package pt.utad.mei.aps;

import java.util.HashMap;
import java.util.Map;

public class ColorFactory {
    private static final Map<ColorName, Color> colors = new HashMap<>();

    public static Color getColor(ColorName name) {
        if (!colors.containsKey(name)) {
            int green = getGreen(name);
            int red = getRed(name);
            int blue = getBlue(name);
            colors.put(name, new Color(name, red, green, blue));
        }
        return colors.get(name);
    }

    private static int getRed(ColorName name) {
        switch (name) {
            case RED, YELLOW, MAGENTA, WHITE -> {
                return 255;
            }
            default -> {
                return 0;
            }
        }
    }

    private static int getGreen(ColorName name) {
        switch (name) {
            case GREEN, YELLOW, CYAN, WHITE -> {
                return 255;
            }
            default -> {
                return 0;
            }
        }
    }

    private static int getBlue(ColorName name) {
        switch (name) {
            case BLUE, CYAN, MAGENTA, WHITE -> {
                return 255;
            }
            default -> {
                return 0;
            }
        }
    }
}
