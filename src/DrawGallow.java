import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawGallow extends JPanel {


    public void paintComponent(Graphics g){
        super.paintComponent(g);


        //Gallow
        g.drawLine(400,700,400,100);
        g.drawLine(400,100,800,100);
        g.drawLine(800,100,800,150);

        g.drawLine(200,700,600,700);

        g.drawLine(400,150,450,100);

    }
}