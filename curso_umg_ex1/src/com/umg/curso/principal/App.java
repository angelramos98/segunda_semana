package com.umg.curso.principal;

import com.umg.curso.clases.Deportista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

public class App extends JDialog {
    private JPanel contentPane;
    private JButton buttonAdd;

    private JTextField textField1;
    private JTable table1;
    private JTextField textField2;
    private JButton buttonDel;
    private DefaultTableModel tableModel;

    public App() {
        setContentPane(contentPane);
        setModal(true);

        getRootPane().setDefaultButton(buttonAdd);
        tableModel = new DefaultTableModel();

        tableModel.addColumn("Nombre");
        tableModel.addColumn("Edad");

        table1.setModel(tableModel);


        buttonAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onAdd();
            }
        });

        buttonDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onDelete();
            }
        });
    }


    private void onAdd() {
        // add your code here
        String nombre = textField1.getText();
        int edad = Integer.parseInt(textField2.getText());

        Deportista d = new Deportista(nombre, edad);
        clearFields();

        tableModel.addRow(new Object[]{d.getNombre(), d.getEdad()});

        JOptionPane.showMessageDialog(this, "Deportista Adicionado");


    }

    private void onDelete() {
        // add your code here if necessary
        tableModel.removeRow(table1.getSelectedRow());
        JOptionPane.showMessageDialog(this, "Deportista eliminado");
    }

    public static void main(String[] args) {
        App dialog = new App();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public void clearFields() {
        textField1.setText("");
        textField2.setText("");

    }


}
