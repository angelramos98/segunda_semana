package com.umg.curso.principal;

import com.umg.curso.clases.EspecialistaGUI;
import com.umg.curso.clases.Ministerio;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;
import java.util.Random;

/**
 * Created by 6787 on 04/07/2017.
 */
public class Prototipo extends JDialog {

    private JPanel contendPanel;
    private JTextField textField1;
    private JButton btnAceptar;


    public Prototipo() {
        setContentPane(contendPanel);
        setModal(true);

        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aceptarClic();
            }
        });
    }

    public static void main(String[] args) {
        //Ministerio ministerio = null;
        Prototipo app = new Prototipo();

        JFrame frame = new JFrame("Prototipo");
        app.pack();
        app.setVisible(true);
        System.exit(0);
    }

    private void aceptarClic (){
        Ministerio ministerio = null;
        EspecialistaGUI especialistaGUI = null;
        try {
            ministerio = new Ministerio(Integer.parseInt(textField1.getText()));
            especialistaGUI = new EspecialistaGUI();

        } catch (InputMismatchException e) {
            System.out.println("Debes insertar un número");
        }
    }
}
