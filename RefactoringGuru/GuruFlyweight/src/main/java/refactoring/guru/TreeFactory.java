package refactoring.guru;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        if (treeTypes.containsKey(name)) {
            return treeTypes.get(name);
        }
        TreeType type = new TreeType(name, color, otherTreeData);
        treeTypes.put(name, type);
        return type;
    }
}
