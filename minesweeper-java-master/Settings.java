import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Settings extends JFrame{
    JRadioButton rbEasy;
    JRadioButton rbMedium;
    JRadioButton rbHard;
    JButton btnBack;
    JPanel pSettings;
    int tileGridCount = 10;
    int mineCount = 10;

    JRadioButton[] difficulty = {rbEasy, rbMedium, rbHard};

    public Settings() {
        //set easy button immediately
        rbEasy.setSelected(true);
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(JRadioButton i : difficulty){
                    if(i.isSelected()){
                        if(i.equals(rbEasy)){
                            System.out.println("Easy mode");
                            tileGridCount = 10;
                            mineCount = 10;

                        }else if(i.equals(rbMedium)){
                            System.out.println("Medium mode");
                            tileGridCount = 15;
                            mineCount = 50;
                        }else if(i.equals(rbHard)){
                            System.out.println("Hard mode");
                            tileGridCount = 20;
                            mineCount = 80;
                        }
                    }

                }
                System.out.println("tileGridCount: " + tileGridCount + "\nmineCount: " + mineCount + "\n");
            }
        });
    }
}
