package ui;

import lombok.Getter;
import lombok.Setter;
import ui.custom.DomainUniqueRequestTableModel;

import javax.swing.*;
import java.awt.*;

@Getter
@Setter
public class Domain {
    private static Domain instance;
    private JButton addButton;
    private JButton editButton;
    private JButton deleteButton;
    private JTable domainUniqueRequestTable;
    private JPanel mainPanel;

    public static Domain getInstance() {
        if (instance == null) {
            instance = new Domain();
        }
        return instance;
    }

    private Domain() {
        DomainUniqueRequestTableModel domainUniqueRequestTableModel = new DomainUniqueRequestTableModel();
        domainUniqueRequestTable.setModel(domainUniqueRequestTableModel);

        addButton.addActionListener(e -> addButtonAction());
    }

    private void addButtonAction() {
        JPanel inputPanel = new JPanel(new GridLayout(2, 1));
        JPanel domainPanel = new JPanel(new FlowLayout());
        JLabel domainLabel = new JLabel("Domain:  ");
        JTextField  domainField = new JTextField(30);
        domainField.setText("Ex: example.com");
        Font font = domainField.getFont();
        Font italicFont = font.deriveFont(Font.ITALIC);
        domainField.setFont(italicFont);
        domainField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                domainField.setText("");
                domainField.setFont(font);
            }
        });
        domainPanel.add(domainLabel);
        domainPanel.add(domainField);
        JPanel uniquePanel = new JPanel(new FlowLayout());
        JLabel uniqueLabel = new JLabel("Unique:   ");
        JTextField  uniqueField = new JTextField(30);
        uniqueField.setText("Ex: arg[0].arg1");
        uniqueField.setFont(italicFont);
        uniqueField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                uniqueField.setText("");
                uniqueField.setFont(font);
            }
        });
        uniquePanel.add(uniqueLabel);
        uniquePanel.add(uniqueField);

        inputPanel.add(domainPanel);
        inputPanel.add(uniquePanel);
        int result = JOptionPane.showConfirmDialog(null, inputPanel, "Add Domain and Unique", JOptionPane.OK_CANCEL_OPTION);

    }
}
