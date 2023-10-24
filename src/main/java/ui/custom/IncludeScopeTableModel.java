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
public class IncludeScopeTableModel extends AbstractTableModel {
    private String[] columnName = {"Enable", "Regex"};
    private int[] columnWidth = {100, 400};

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

    public void setColumnWidth(JTable table){
        for (int i = 0; i < columnName.length; ++i) {
            table.getColumnModel().getColumn(i).setPreferredWidth(columnWidth[i]);
        }
    }
}
