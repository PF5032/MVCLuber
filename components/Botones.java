/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import javax.swing.JButton;
import javax.swing.JOptionPane;


//conexion
import util.Conexion;

/**
 *
 * @author Lau
 */
public class Botones extends JButton{
    
    JButton defaultButtonRegistrar, defaultButtonEditar, defaultButtonEliminar, defaultButtonMostrar;
    
    
    public JButton getDefaultButtonRegistrar() {
        defaultButtonRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Connection conn = Conexion.getConnection();
            }
        });
        return defaultButtonRegistrar;
    }

    public void setDefaultButtonRegistrar(JButton defaultButtonRegistrar) {
        this.defaultButtonRegistrar = defaultButtonRegistrar;
    }

    public JButton getDefaultButtonEditar() {
        return defaultButtonEditar;
    }

    public void setDefaultButtonEditar(JButton defaultButtonEditar) {
        this.defaultButtonEditar = defaultButtonEditar;
    }

    public JButton getDefaultButtonEliminar() {
        return defaultButtonEliminar;
    }

    public void setDefaultButtonEliminar(JButton defaultButtonEliminar) {
        this.defaultButtonEliminar = defaultButtonEliminar;
    }

    public JButton getDefaultButtonMostrar() {
        return defaultButtonMostrar;
    }

    public void setDefaultButtonMostrar(JButton defaultButtonMostrar) {
        this.defaultButtonMostrar = defaultButtonMostrar;
    }
    
}
