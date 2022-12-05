package refactoring.guru;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ImageEditor {
    private final EditorCanvas canvas;
    private final CompoundShape allShapes;

    public ImageEditor() {
        this.allShapes = new CompoundShape();
        this.canvas = new EditorCanvas();
    }

    public void loadShapes(Shape... shapes) {
        allShapes.clear();
        allShapes.add(shapes);
        canvas.refresh();
    }

    private class EditorCanvas extends Canvas {
        private static final int PADDING = 10;
        private JFrame frame;

        private EditorCanvas() {
            createFrame();
            refresh();
            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    allShapes.unSelect();
                    if (allShapes.selectChildAt(e.getX(), e.getY())) {
                        e.getComponent().repaint();
                    }
                }
            });
        }

        private void createFrame() {
            frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);

            JPanel contentPane = new JPanel();
            Border padding = BorderFactory.createEmptyBorder(PADDING, PADDING, PADDING, PADDING);
            contentPane.setBorder(padding);
            frame.setContentPane(contentPane);

            frame.add(this);
            frame.setVisible(true);
            frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        }

        private void refresh() {
            this.setSize(getWidth(), getHeight());
            frame.pack();
        }

        public int getWidth() {
            return allShapes.getX() + allShapes.getWidth() + PADDING;
        }

        public int getHeight() {
            return allShapes.getY() + allShapes.getHeight() + PADDING;
        }

        public void paint(Graphics graphics) {
            allShapes.paint(graphics);
        }
    }
}
