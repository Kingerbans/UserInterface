package ui;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;

@Getter
@Setter
public class Domain {
    private JButton addButton;
    private JButton editButton;
    private JButton deleteButton;
    private JTable table1;
    private JPanel mainPanel;

    public Domain() {
    }
}
