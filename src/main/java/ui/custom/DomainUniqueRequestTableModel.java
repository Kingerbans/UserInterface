package ui.custom;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DomainUniqueRequestTableModel extends AbstractTableModel {
    private String[] columnName = {"Domain", "Unique"};
    @Override
    public int getRowCount() {
        return 0;
    }

    @Override
    public int getColumnCount() {
        return columnName.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }

    @Override
    public String getColumnName(int columnIndex){
        return columnName[columnIndex];
    }
}
