import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GameFrame {
    private JFrame frame;
    private GameCanvas gameCanvas;
    private Color gradBGTop;
    private Color gradBGMid;
    private Color gradBGBottom;

    public GameFrame() {
        frame = new JFrame();
        gradBGTop = new Color(60, 59, 95);
        gradBGMid = new Color(240, 101, 83);
        gradBGBottom = new Color(255, 244, 116);
        gameCanvas = new GameCanvas(1024, 768);
    }

    public void setUpGUI() {
        Container cp = frame.getContentPane();
        frame.setTitle("Majestic Mayhem: Fight for the Crown!");
        cp.add(gameCanvas, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        GameFrame f = new GameFrame();
        f.setUpGUI();
    }

    /** hi i hate the guard */
}
