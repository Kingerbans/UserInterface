package ui.custom;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;

public class EndpointTableModel extends AbstractTableModel {
    private String[] columnName = {"#", "Time", "Status", "Method", "Host", "Path", "Query", "Status Code", "Length"};
    private int[] columnWidth = {75, 200, 150, 75, 200, 300, 200, 100, 75};
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
