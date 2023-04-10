/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioguia.pkg13;

import entidades.Curso;
import servicios.ServicioCurso;

/**
 *
 * @author Usuario
 */
public class EjercicioGuia13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioCurso cs = new ServicioCurso();
        Curso c1 = cs.cargarCurso();
        
        
        cs.imprimirCurso(c1);
        System.out.println(cs.calcularGananciaSemanal(c1));
        
    }
    
}
