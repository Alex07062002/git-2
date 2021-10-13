package sample;

import javax.swing.*;
import java.awt.*;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.ROOT);

        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        ru.vsu.cs.util.SwingUtils.setDefaultFont("Arial", 20);

        EventQueue.invokeLater(() -> {
            try {
                JFrame mainFrame = new Window();
                mainFrame.setSize(600,480);
                mainFrame.setVisible(true);
                //mainFrame.setExtendedState(MAXIMIZED_BOTH);
            } catch (Exception ex) {
                ru.vsu.cs.util.SwingUtils.showErrorMessageBox(ex);
            }
        });
    }
}