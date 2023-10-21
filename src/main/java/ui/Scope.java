package ui;

import lombok.Getter;
import lombok.Setter;
import ui.custom.IncludeScopeTableModel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

@Getter
@Setter
public class Scope {
    private static Scope instance;
    private JPanel mainPanel;
    private JButton addIncludeScopeButton;
    private JButton editIncludeScopeButton;
    private JButton deleteIncludeScopeButton;
    private JTable includeScopeTable;
    private JButton addExcludeScopeButton;
    private JButton editExcludeScopeButton;
    private JButton deleteExcludeScopeButton;
    private JButton editFilterExtensionButton;
    private JTable excludeScopeTable;

    public static Scope getInstance() {
        if (instance == null) {
            instance = new Scope();
        }
        return instance;
    }

    private Scope() {
        IncludeScopeTableModel model = new IncludeScopeTableModel();
        includeScopeTable.setModel(model);
        model.setColumnWidth(includeScopeTable);
//        excludeScopeTable.setModel(model);
    }
}
