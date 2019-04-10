import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ToTheCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Draw 3 lines with that function. Use loop for that.
        graphics.drawRect(0,0,1000,1000);
        //int three = 2;
        //for (int row = 0; row < three; row++) {
        //    for (int column = 0; column < three; column++) {
        //        if (row == 0
        //                || row == three -1
        //                || column == 0
        //                || column == three -1
        //                || row == three -1 -column
        //        ) {
        //            graphics.drawLine(column *100,row * 100,500,500);
        //        }
//
        //    }
//
//
        //}
        //drawLineToCenter(graphics, 100,100);
        //for (int numberOfLines = 0; numberOfLines<3 ; numberOfLines++) {
        //        drawLineToCenter(graphics, numberOfLines*200,numberOfLines*100);
//
        //}

    }
    public static void drawLineToCenter(Graphics d, int x, int y) {
        d.drawLine(x,y,500,500);

        //for (int numberOfLines = 0; numberOfLines < 2; numberOfLines++){
        //    drawLineToCenter(100,100,d);
//
        //}


    }


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