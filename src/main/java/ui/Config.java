package ui;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;

@Getter
@Setter
public class Config {
    private static Config instance;
    private JPanel mainPanel;
    private JPanel selectionPanel;
    private JPanel detailPanel;
    private JButton generalButton;
    private JButton scopeButton;
    private JButton domainButton;
    private JButton userButton;

    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    private Config() {
        scopeButton.addActionListener(e -> scopeButtonAction(detailPanel));
        userButton.addActionListener(e -> userButtonAction(detailPanel));
        domainButton.addActionListener(e -> domainButtonAction(detailPanel));
        generalButton.addActionListener(e -> generalButtonAction(detailPanel));
        detailPanel.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 0, UIManager.getColor("Component.borderColor")));
    }

    private void scopeButtonAction(JPanel panel) {
        panel.setBorder(null);
        panel.removeAll();
        Scope scope = Scope.getInstance();
        panel.add(scope.getMainPanel(), BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
    }

    private void userButtonAction(JPanel panel) {
        panel.setBorder(null);
        panel.removeAll();
        User user = User.getInstance();
        panel.add(user.getMainPanel(), BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
    }

    private void domainButtonAction(JPanel panel) {
        panel.setBorder(null);
        panel.removeAll();
        Domain domain = Domain.getInstance();
        panel.add(domain.getMainPanel(), BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
    }

    private void generalButtonAction(JPanel panel) {
        panel.setBorder(null);
        panel.removeAll();
        General general = General.getInstance();
        panel.add(general.getMainPanel(), BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
    }
}
