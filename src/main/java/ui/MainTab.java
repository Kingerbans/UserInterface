package ui;

import lombok.Getter;
import lombok.Setter;
import ui.custom.ConfigJframe;
import ui.custom.EndpointTableModel;

import javax.swing.*;


@Getter
@Setter
public class MainTab {
    private static MainTab instance;
    private JTextField logSearchTextField;
    private JTable endpointTable;
    private JTabbedPane displayMessageTabbedPane;
    private JPanel mainPanel;
    private JButton configButton;

    public static MainTab getInstance() {
        if (instance == null) {
            instance = new MainTab();
        }
        return instance;
    }

    private MainTab() {
        EndpointTableModel endpointTableModel = new EndpointTableModel();
        endpointTable.setModel(endpointTableModel);
        endpointTableModel.setColumnWidth(endpointTable);

        configButton.addActionListener(e -> configButtonAction());
    }

    private void configButtonAction() {
        ConfigJframe configJframe = ConfigJframe.getInstance();
        if (!configJframe.isVisible()) {
            configJframe.setVisible(true);
        }
        configJframe.toFront();
    }
}
