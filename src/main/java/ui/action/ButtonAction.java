package ui.action;

import burp.api.montoya.MontoyaApi;
import ui.*;

import javax.swing.*;
import java.awt.*;

public class ButtonAction {
    public static void configButtonAction(MontoyaApi api) {
        api.logging().logToOutput("xxxxxxxxx");
        JFrame frame = new JFrame();
        frame.setTitle("");
        frame.setSize(1200, 800);
        Config config = new Config(api);
        frame.getContentPane().add(config.getMainPanel());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void scopeButtonAction(MontoyaApi api, JPanel panel) {
        panel.setBorder(null);
        panel.removeAll();
        Scope scope = new Scope();
        panel.add(scope.getMainPanel(), BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
    }

    public static void userButtonAction(MontoyaApi api, JPanel panel) {
        panel.setBorder(null);
        panel.removeAll();
        User user = new User();
        panel.add(user.getMainPanel(), BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
    }

    public static void domainButtonAction(MontoyaApi api, JPanel panel) {
        panel.setBorder(null);
        panel.removeAll();
        Domain domain = new Domain();
        panel.add(domain.getMainPanel(), BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
    }

    public static void generalButtonAction(MontoyaApi api, JPanel panel) {
        panel.setBorder(null);
        panel.removeAll();
        General general = new General();
        panel.add(general.getMainPanel(), BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
    }
}
