package ui.custom;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;

public class IncludeScopeTableModel extends AbstractTableModel {
    private String[] columnName = {"Enable", "Prefix"};
    private int[] columnWidth = {50, 500};

    @Override
    public int getRowCount() {
        return 0;
    }

    @Override
    public int getColumnCount() {
        return 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }

    @Override
    public String getColumnName(int columnIndex){
        if (columnIndex < columnName.length) {
            return columnName[columnIndex];
        }
        return "";
    }

    public void setColumnWidth(JTable table){
        for (int i = 0; i < columnWidth.length; ++i) {
            table.getColumnModel().getColumn(i).setPreferredWidth(columnWidth[i]);
        }
    }
}
