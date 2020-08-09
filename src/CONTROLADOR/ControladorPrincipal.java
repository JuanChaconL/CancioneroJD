/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;
import VISTA.VentanaMenu;
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
public class ControladorPrincipal implements ActionListener, MouseListener{
     private Lista c1= new Lista();
     private final VentanaMenu view;
     
      public ControladorPrincipal(VentanaMenu view) {
        this.view = view;
        this.view.BotonAcordes.addActionListener(this);
        this.view.BotonAnalisis.addActionListener(this);
        this.view.BotonArtistas.addActionListener(this);
        this.view.BotonCanciones.addActionListener(this);
        this.view.BotonGeneros.addActionListener(this);
        this.view.BotonPlaylist.addActionListener(this);   
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == view.BotonAcordes){
            VentanaAcordes VentArc = new VentanaAcordes();
            ControladorAcordes ContrAcor = new ControladorAcordes(VentArc, c1);
            ContrAcor.iniciar();
            VentArc.setVisible(true);
            this.view.dispose();
        }
        
        if (e.getSource() == view.BotonGeneros){
            VentanaGeneros VenGen = new VentanaGeneros();
            ControladorGeneros ContrGen = new ControladorGeneros(VenGen, c1);
            ContrGen.iniciar();
            VenGen.setVisible(true);
            this.view.dispose();
        }
        
        if(e.getSource() == view.BotonArtistas){
            VentanaArtistas VentArt = new VentanaArtistas();
            ControladorArtistas ContrArt = new ControladorArtistas(VentArt, c1); 
            VentArt.setVisible(true);
            this.view.dispose();
        }
        
        if(e.getSource() == view.BotonCanciones){
            VentanaCanciones VentCanc = new VentanaCanciones();
            ControladorCanciones contrcanc = new ControladorCanciones(VentCanc, c1);
            VentCanc.setVisible(true);
            this.view.dispose();
        }
        
        if(e.getSource() == view.BotonPlaylist){
        
        }
        
        if(e.getSource() == view.BotonAnalisis){
        
        
        }
    
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == view.BotonCerrar) {
            System.exit(0);
        }
    
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
