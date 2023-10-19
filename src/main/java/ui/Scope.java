package ui;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;

@Getter
@Setter
public class Scope {
    private JPanel mainPanel;
    private JButton addButton;
    private JButton editButton;
    private JButton deleteButton;
    private JTable table1;

    public Scope() {
    }
}
