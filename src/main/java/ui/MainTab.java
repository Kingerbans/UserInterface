package ui;

import burp.api.montoya.MontoyaApi;
import com.formdev.flatlaf.FlatLaf;
import lombok.Getter;
import lombok.Setter;
import ui.action.ButtonAction;

import javax.swing.*;


@Getter
@Setter
public class MainTab {
    public static MontoyaApi api;
    private JTextField logSearchTextField;
    private JTable endpointTable;
    private JTabbedPane displayMessageTabbedPane;
    private JPanel mainPanel;
    private JButton configButton;

    public MainTab(MontoyaApi api) {
        MainTab.api = api;
        api.logging().logToOutput("xxxxxxxxxaaaaaaaaaaaaa");
        configButton.addActionListener(e -> ButtonAction.configButtonAction());
    }
}
