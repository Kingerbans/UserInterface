package ui;

import lombok.Getter;
import lombok.Setter;
import ui.action.ButtonAction;

import javax.swing.*;

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
        scopeButton.addActionListener(e -> ButtonAction.scopeButtonAction(detailPanel));
        userButton.addActionListener(e -> ButtonAction.userButtonAction(detailPanel));
        domainButton.addActionListener(e -> ButtonAction.domainButtonAction(detailPanel));
        generalButton.addActionListener(e -> ButtonAction.generalButtonAction(detailPanel));
        detailPanel.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 0, UIManager.getColor("Component.borderColor")));
    }
}
