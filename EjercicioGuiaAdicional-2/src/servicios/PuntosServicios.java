/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PuntosServicios {
    Scanner leer = new Scanner (System.in);   
    
    public Puntos ingresarPuntos(){
        Puntos p1 = new Puntos();
        
        System.out.println("Ingrese el valor de x del primer punto");
        p1.setX1(leer.nextDouble());
        System.out.println("Ingrese el valor de y del primer punto");
        p1.setY1(leer.nextDouble());
        System.out.println("Ingrese el valor de x del segundo punto");
        p1.setX2(leer.nextDouble());
        System.out.println("Ingrese el valor de y del segundo punto");
        p1.setY2(leer.nextDouble());
        return p1;
    }
    
    public void ditanciaPuntos(Puntos p1){
        double distancia = Math.sqrt(Math.pow((p1.getX2()-p1.getX1()),2)+Math.pow((p1.getY2()-p1.getY1()),2));
        System.out.println("La distancia entre los dos puntos es "+distancia);
    }
}
