/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import VISTA.*;
import MODELO.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Usuario
 */
public class ControladorArtistas implements ActionListener, MouseListener{
    
    private final VentanaArtistas view;
    private final Lista model;

    public ControladorArtistas(VentanaArtistas view, Lista model) {
        this.view = view;
        this.model = model;
        this.view.BotonCerrar.addActionListener(this);
        this.view.BotonAtras.addActionListener(this);
        iniciar();
    }
    
    public void iniciar(){
        view.setTitle("ARTISTAS.");
        view.setLocationRelativeTo(null);   
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == view.BotonAtras){
           VentanaMenu vm = new VentanaMenu();
            ControladorPrincipal cp = new ControladorPrincipal(vm);
            vm.setVisible(true);
            view.dispose();
       }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
