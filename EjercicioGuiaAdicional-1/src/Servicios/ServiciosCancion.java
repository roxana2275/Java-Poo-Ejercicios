/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServiciosCancion {
    Scanner leer = new Scanner (System.in);
    
    public Cancion cargarCancion(){
        Cancion c1 = new Cancion();
        System.out.println("Ingrese el nombre de la canción");
        c1.setTitulo(leer.nextLine());
        System.out.println("Ingrese el autor de la cancion");
        c1.setAututor(leer.nextLine());
        return c1;
    }
    
    public void imprimirCancion(Cancion c1){
        String toString = c1.toString();
        System.out.println(toString);
    }
}
