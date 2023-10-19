package ui;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;

@Getter
@Setter
public class User {
    private JPanel mainPanel;
    private JButton addButton;
    private JButton editButton;
    private JButton deleteButton;
    private JTable table1;
    private JButton fieldButton;
    private JButton sessionButton;

    public User() {
    }
}
