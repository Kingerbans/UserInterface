package ui;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;

@Getter
@Setter
public class Domain {
    private static Domain instance;
    private JButton addButton;
    private JButton editButton;
    private JButton deleteButton;
    private JTable table1;
    private JPanel mainPanel;

    public static Domain getInstance() {
        if (instance == null) {
            instance = new Domain();
        }
        return instance;
    }

    private Domain() {
    }
}
