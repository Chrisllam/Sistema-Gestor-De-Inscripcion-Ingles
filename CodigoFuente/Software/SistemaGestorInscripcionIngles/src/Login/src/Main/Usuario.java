/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Usuario {
    private String NumControl;
    private String Contraseña;
    
    public Usuario(){
        
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public void setNumControl(String NumControl) {
        this.NumControl = NumControl;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public String getNumControl() {
        return NumControl;
    }
    
    
}
