package ui;

import lombok.Getter;
import lombok.Setter;
import ui.custom.UserTableModel;

import javax.swing.*;

@Getter
@Setter
public class User {
    private static User instance;
    private JPanel mainPanel;
    private JButton addButton;
    private JButton editButton;
    private JButton deleteButton;
    private JTable userTable;
    private JButton fieldButton;
    private JButton sessionButton;

    public static User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

    private User() {
        UserTableModel userTableModel = new UserTableModel();
        userTable.setModel(userTableModel);
    }
}
