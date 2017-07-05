package com.umg.curso.clases;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by 6787 on 04/07/2017.
 */
public class EspecialistaGUI extends JDialog{
    private JPanel contentPaneEsp;
    private JTextField textField1;
    private JTextField textField2;
    private JButton btnAceptarEsp;

    public EspecialistaGUI() {
        setContentPane(contentPaneEsp);
        setModal(true);
        this.pack();
        this.setVisible(true);
        //System.exit(0);


        btnAceptarEsp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

}
