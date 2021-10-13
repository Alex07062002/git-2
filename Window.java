package sample;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.*;

public class Window extends JFrame {
    private JPanel Mainpanel;

    public Window() {
        this.setTitle("Graphics");
        this.setContentPane(Mainpanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        Graphics g = this.getGraphics();
        Mainpanel.paint(g);
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawRect(0,0,500,240);
        g.setColor(BLUE);
        g.fillRect(0,0,500,240);
        g.setColor(BLACK);
        g.drawArc( 100, 100, 100, 100, 45, 275);
        g.setColor(YELLOW);
        g.fillArc(100,100,100,100,45,275);
        g.setColor(RED);
        g.drawString("3 семестр",110,175);
        g.setColor(BLACK);
        g.drawRoundRect(150,125,10,10,10,10);
        g.fillRoundRect(150,125,10,10,10,10);
        g.drawLine(150, 150,150 , 150);
        int dx = 0;
        for (int i=0;i<10;i++) {
            g.setColor(WHITE);
            g.fillRect(200+dx,150,10,10);
            g.setColor(BLACK);
            if (i == 0){
                g.drawString("Я",200+dx,160);
            }else {
                g.drawLine(200 + dx, 150, 210 + dx, 160);
                g.drawLine(210 + dx, 150, 200 + dx, 160);
            }
            dx+=30;
        }
    }
}