import javax.swing.*;
import java.awt.*;

public class DrawHangman extends JPanel{
    private JFrame j = new JFrame();

    public void deleteFrame(){
        j.dispose();
    }


    public void drawHangman(int howManyWrongGuesses) {
        j.setSize(1000, 1000);
        j.setVisible(true);


        switch (howManyWrongGuesses) {
            case 0:
                DrawDeadManOnGallow drawDeadManOnGallow = new DrawDeadManOnGallow();
                j.add(drawDeadManOnGallow);
                break;

            case 1:
                DrawRightLegArmsBodyAliveFaceAndGallow drawRightLegArmsBodyAliveFaceAndGallow = new DrawRightLegArmsBodyAliveFaceAndGallow();
                j.add(drawRightLegArmsBodyAliveFaceAndGallow);
                break;

            case 2:
                DrawArmsBodyAliveFaceAndGallow drawArmsBodyAliveFaceAndGallow = new DrawArmsBodyAliveFaceAndGallow();
                j.add(drawArmsBodyAliveFaceAndGallow);
                break;

            case 3:
                DrawRightArmBodyAliveFaceAndGallow drawRightArmBodyAliveFaceAndGallow = new DrawRightArmBodyAliveFaceAndGallow();
                j.add(drawRightArmBodyAliveFaceAndGallow);
                break;

            case 4:
                DrawBodyAliveFaceAndGallow drawBodyAliveFaceAndGallowy = new DrawBodyAliveFaceAndGallow();
                j.add(drawBodyAliveFaceAndGallowy);
                break;

            case 5:
                DrawAliveFaceAndGallow drawAliveFaceAndGallow = new DrawAliveFaceAndGallow();
                j.add(drawAliveFaceAndGallow);
                break;

            case 6:
                DrawGallow drawGallow = new DrawGallow();
                j.add(drawGallow);
                break;
        }
    }
}
