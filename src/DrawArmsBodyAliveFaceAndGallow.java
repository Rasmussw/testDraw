import javax.swing.*;
import java.awt.*;

public class DrawArmsBodyAliveFaceAndGallow extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //Gallow
        g.drawLine(400,700,400,100);
        g.drawLine(400,100,800,100);
        g.drawLine(800,100,800,150);

        g.drawLine(200,700,600,700);

        g.drawLine(400,150,450,100);

        //face
        g.drawOval(700, 150, 200, 200);

        //aliveEyes
        g.drawOval(750,200,30,30);
        g.drawOval(820,200,30,30);

        //aliveMouth
        g.drawArc(750, 225, 100,100,180,180);

        //body
        g.drawLine(800,350,800,550);

        //rightArm
        g.drawLine(800, 450,875,375);

        //leftArm
        g.drawLine(800,450,725,375);

    }
}
