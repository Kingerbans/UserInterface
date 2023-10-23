package ui;

import lombok.Getter;
import lombok.Setter;
import ui.custom.ExcludeScopeTableModel;
import ui.custom.IncludeScopeTableModel;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

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
    private JTextField editFilterExtensionTextField;

    public static Scope getInstance() {
        if (instance == null) {
            instance = new Scope();
        }
        return instance;
    }

    private Scope() {
        IncludeScopeTableModel includeScopeTableModel = new IncludeScopeTableModel();
        includeScopeTable.setModel(includeScopeTableModel);
        includeScopeTableModel.setColumnWidth(includeScopeTable);

        ExcludeScopeTableModel excludeScopeTableModel = new ExcludeScopeTableModel();
        excludeScopeTable.setModel(excludeScopeTableModel);
        excludeScopeTableModel.setColumnWidth(excludeScopeTable);

        addIncludeScopeButton.addActionListener(e -> addIncludeScopeButtonAction());
        editIncludeScopeButton.addActionListener(e -> editIncludeScopeButtonAction());
        deleteIncludeScopeButton.addActionListener(e -> deleteIncludeScopeButtonAction());

        addExcludeScopeButton.addActionListener(e -> addExcludeScopeButtonAction());
        editExcludeScopeButton.addActionListener(e -> editExcludeScopeButtonAction());
        deleteExcludeScopeButton.addActionListener(e -> deleteExcludeScopeButtonAction());

        editFilterExtensionButton.addActionListener(e -> editFilterExtensionButtonAction());
    }

    private void addIncludeScopeButtonAction() {
        JPanel panel = new JPanel(new BorderLayout());
        JLabel label = new JLabel("Regex:   ");
        JTextField textField = new JTextField(30);
        textField.setText("Ex: *.example.com");
        Font font = textField.getFont();
        Font italicFont = font.deriveFont(Font.ITALIC);
        textField.setFont(italicFont);
        textField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textField.setText("");
                textField.setFont(font);
            }
        });
        panel.add(label, BorderLayout.WEST);
        panel.add(textField, BorderLayout.EAST);
        int result = JOptionPane.showConfirmDialog(null, panel, "Add regex for in-scope URLs", JOptionPane.OK_CANCEL_OPTION);
    }

    private void editIncludeScopeButtonAction() {
    }

    private void deleteIncludeScopeButtonAction() {
    }

    private void addExcludeScopeButtonAction() {
        JPanel panel = new JPanel(new BorderLayout());
        JLabel label = new JLabel("Regex:   ");
        JTextField textField = new JTextField(30);
        textField.setText("Ex: *.example.com");
        Font font = textField.getFont();
        Font italicFont = font.deriveFont(Font.ITALIC);
        textField.setFont(italicFont);
        textField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textField.setText("");
                textField.setFont(font);
            }
        });
        panel.add(label, BorderLayout.WEST);
        panel.add(textField, BorderLayout.EAST);
        int result = JOptionPane.showConfirmDialog(null, panel, "Add regex for out-of-scope URLs", JOptionPane.OK_CANCEL_OPTION);
    }

    private void editExcludeScopeButtonAction() {
    }

    private void deleteExcludeScopeButtonAction() {
    }

    private void editFilterExtensionButtonAction() {
        if (Objects.equals(editFilterExtensionButton.getText(), "Edit")) {
            editFilterExtensionTextField.setEditable(true);
            editFilterExtensionButton.setText("Save");
        } else {
            editFilterExtensionTextField.setEditable(false);
            editFilterExtensionButton.setText("Edit");
        }
    }
}
