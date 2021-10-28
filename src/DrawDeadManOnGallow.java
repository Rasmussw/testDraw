import javax.swing.*;
import java.awt.*;

public class DrawDeadManOnGallow extends JPanel {

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

        //deadEyes
        g.drawString("X", 830,220);
        g.drawString("X", 760,220);

        //deadMouth
        g.drawLine(760,275,840,275);

        //body
        g.drawLine(800,350,800,550);

        //rightArm
        g.drawLine(800, 450,875,375);

        //leftArm
        g.drawLine(800,450,725,375);

        //rightLeg
        g.drawLine(800, 550, 900, 700);

        //leftLeg
        g.drawLine(800, 550, 700, 700);



    }

}

