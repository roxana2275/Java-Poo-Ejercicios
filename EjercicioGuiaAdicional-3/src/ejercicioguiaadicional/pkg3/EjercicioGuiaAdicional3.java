/*

Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo 
delante de -b 
 */
package ejercicioguiaadicional.pkg3;

import entidades.Raiz;
import servicios.RaizServicios;

/**
 *
 * @author Usuario
 */
public class EjercicioGuiaAdicional3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RaizServicios cs = new RaizServicios();
        Raiz r1 = cs.cargarEcuacion();
        
        cs.calcular(r1);
    }
    
}
