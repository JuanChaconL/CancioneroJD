package cancionero;
import VISTA.*;
import MODELO.*;
import CONTROLADOR.*;
/**
 *
 * @author Usuario
 */
public class CANCIONERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VentanaMenu vent1= new VentanaMenu();
        ControladorPrincipal c1= new ControladorPrincipal(vent1);
        vent1.setVisible(true);
    }
    
}
