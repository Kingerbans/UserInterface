package ui.custom;

import ui.Config;

import javax.swing.*;

public class ConfigJframe extends JFrame {
    private static ConfigJframe instance;
    private ConfigJframe() {
        setTitle("");
        setSize(1200, 800);
        Config config = Config.getInstance();
        getContentPane().add(config.getMainPanel());
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static ConfigJframe getInstance() {
        if (instance == null) {
            instance = new ConfigJframe();
        }
        return instance;
    }
}
