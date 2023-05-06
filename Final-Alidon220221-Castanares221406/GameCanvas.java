import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.*;

public class GameCanvas extends JComponent {
    private int width;
    private int height;
    private Color bgTop;
    private Color bgMid;
    private Color bgBottom;

    public GameCanvas(int w, int h) {
        width = w;
        height = h;

        setPreferredSize(new Dimension(width, height));
    }

    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        ImageIcon i = new ImageIcon("loading_screen-bg.png");
        i.paintIcon(this, g2d, 0, 0);
    }
}
