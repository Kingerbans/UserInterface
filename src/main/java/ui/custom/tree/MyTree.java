package ui.custom.tree;

import burp.api.montoya.MontoyaApi;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyTree extends JTree
{
    public MyTree(DefaultMutableTreeNode root)
    {
        super(root);
        setRootVisible(false);
        setShowsRootHandles(true);
        setRowHeight(25);
//        expandRow(0);
        getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        JTree currentTree = this;
        MouseListener ml = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int selRow = currentTree.getClosestRowForLocation(e.getX(), e.getY());
                if (selRow != -1) {
                    currentTree.setSelectionRow(selRow);
                    if (currentTree.isCollapsed(selRow))
                        currentTree.expandRow(selRow);
                    else if (currentTree.isExpanded(selRow))
                        currentTree.collapseRow(selRow);
                }

            }
        };
        addMouseListener(ml);
    }

    protected void paintComponent(Graphics g) {
        int fromRow = getRowForPath(getSelectionPath());
        if (fromRow != -1) {
            int toRow = fromRow + 1;
            Rectangle fromBounds = getRowBounds(fromRow);
            Rectangle toBounds = getRowBounds(toRow - 1);
            if (fromBounds != null && toBounds != null) {
                g.setColor(UIManager.getColor("Tree.selectionBackground"));
                g.fillRect(0, fromBounds.y, getWidth(), toBounds.y - fromBounds.y + toBounds.height);
            }
        }
        setOpaque(false);
        super.paintComponent(g);
        setOpaque(false);
    }
}

