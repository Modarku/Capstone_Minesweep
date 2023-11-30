import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame{
    JButton btnPlay;
    JButton btnQuit;
    JPanel pMenu;
    JButton btnSettings;
    JLabel lblDiff;

    public Menu() {
        btnQuit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}

