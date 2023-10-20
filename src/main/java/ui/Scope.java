package ui;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;

@Getter
@Setter
public class Scope {
    private static Scope instance;
    private JPanel mainPanel;
    private JButton addButton;
    private JButton editButton;
    private JButton deleteButton;
    private JTable table1;

    public static Scope getInstance() {
        if (instance == null) {
            instance = new Scope();
        }
        return instance;
    }

    private Scope() {
    }
}
