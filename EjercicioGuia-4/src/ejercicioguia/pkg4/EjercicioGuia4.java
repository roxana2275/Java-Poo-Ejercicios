/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguia.pkg4;

import Entidades.Rectangulo;
import Servicio.RectanguloServicio;

/**
 *
 * @author Usuario
 */
public class EjercicioGuia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RectanguloServicio rs = new RectanguloServicio();
        Rectangulo r1 = rs.cargarRectangulo();
        
        rs.Calperimetro(r1);
        rs.Calsuperficie(r1);
        rs.Dibujar(r1);
    }
    
}
