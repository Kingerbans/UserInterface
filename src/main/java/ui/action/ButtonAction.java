package ui.action;

import burp.api.montoya.MontoyaApi;
import ui.*;
import ui.custom.ConfigJframe;

import javax.swing.*;
import java.awt.*;

public class ButtonAction {
    public static void configButtonAction() {
        ConfigJframe configJframe = ConfigJframe.getInstance();
        if (!configJframe.isVisible()) {
            configJframe.setVisible(true);
        }
    }

    public static void scopeButtonAction(JPanel panel) {
        panel.setBorder(null);
        panel.removeAll();
        Scope scope = Scope.getInstance();
        panel.add(scope.getMainPanel(), BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
    }

    public static void userButtonAction(JPanel panel) {
        panel.setBorder(null);
        panel.removeAll();
        User user = User.getInstance();
        panel.add(user.getMainPanel(), BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
    }

    public static void domainButtonAction(JPanel panel) {
        panel.setBorder(null);
        panel.removeAll();
        Domain domain = Domain.getInstance();
        panel.add(domain.getMainPanel(), BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
    }

    public static void generalButtonAction(JPanel panel) {
        panel.setBorder(null);
        panel.removeAll();
        General general = General.getInstance();
        panel.add(general.getMainPanel(), BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
    }
}
