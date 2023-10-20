package ui;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;

@Getter
@Setter
public class General {
    private static General instance;
    private JPanel mainPanel;

    public static General getInstance() {
        if (instance == null) {
            instance = new General();
        }
        return instance;
    }

    private General() {
    }
}
