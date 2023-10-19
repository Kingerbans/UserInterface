package ui;

import burp.api.montoya.MontoyaApi;
import lombok.Getter;
import lombok.Setter;
import ui.action.ButtonAction;

import javax.swing.*;

@Getter
@Setter
public class Config {
    private JPanel mainPanel;
    private JPanel selectionPanel;
    private JPanel detailPanel;
    private JButton generalButton;
    private JButton scopeButton;
    private JButton domainButton;
    private JButton userButton;

    public Config(MontoyaApi api) {
        scopeButton.addActionListener(e -> ButtonAction.scopeButtonAction(api, detailPanel));
        userButton.addActionListener(e -> ButtonAction.userButtonAction(api, detailPanel));
        domainButton.addActionListener(e -> ButtonAction.domainButtonAction(api, detailPanel));
        generalButton.addActionListener(e -> ButtonAction.generalButtonAction(api, detailPanel));
        detailPanel.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 0, UIManager.getColor("Component.borderColor")));
    }
}
