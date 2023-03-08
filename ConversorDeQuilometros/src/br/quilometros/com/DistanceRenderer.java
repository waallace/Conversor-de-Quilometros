package br.quilometros.com;

import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class DistanceRenderer extends DefaultListCellRenderer {
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        QuilometrosQuadrados valUnit = (QuilometrosQuadrados) value;
        setText(valUnit.getNome() + " - " + valUnit.getNomeCompleto());
        return this;
    }
}