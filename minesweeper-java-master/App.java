import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) {
        Menu app = new Menu();
        app.setSize(480, 500);
        app.setContentPane(app.pMenu);
        app.setVisible(true);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Settings settings = new Settings();
        settings.setSize(480, 500);
        settings.setContentPane(settings.pSettings);
        settings.setVisible(false);
        settings.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        final int[] tileGridCount = {settings.tileGridCount};
        final int[] mineCount = {settings.mineCount};
        app.lblDiff.setText("Difficulty: Easy");

        app.btnPlay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tileGridCount[0] = settings.tileGridCount;
                mineCount[0] = settings.mineCount;
                Minesweep minesweeper = new Minesweep(tileGridCount[0], mineCount[0]);
                app.setVisible(false);
            }
        });
        app.btnSettings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settings.setVisible(true);
                app.setVisible(false);
            }
        });
        settings.btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settings.setVisible(false);
                app.setVisible(true);
            }
        });

    }
}