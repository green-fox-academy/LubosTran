import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        graphics.drawRect(0,0, WIDTH, HEIGHT);
        // draw four different size and color rectangles.
        // avoid code duplication.
        for (int i = 0; i < 4; i++) {

            drawColoredRectangle(graphics , (int)(Math.random()*500),(int)(Math.random()*500));

        }


    }
    public static void drawColoredRectangle (Graphics d, int x, int y) {
        d.drawRect(x,y,x,y);
       d.setColor(new Color(createNumbers(),createNumbers(),createNumbers()));
    }
    public static Integer createNumbers (){
        int random = (int) (Math.random()*255);
        return random;
    }

    //d.setColor(
    //                new Color(
    //                        (int)(Math.random()*255),
    //                        (int)(Math.random()*255),
    //                        (int)(Math.random()*255)
    //                )
    //        );

    // Don't touch the code below
    static int WIDTH = 1000;
    static int HEIGHT = 1000;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}