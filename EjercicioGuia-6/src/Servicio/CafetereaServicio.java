/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CafetereaServicio {
    Scanner leer = new Scanner (System.in);
    public Cafetera crearCafetera(){
        Cafetera cs = new Cafetera();
        System.out.println("Ingrese la cantidad máxima de café que puede contener la cafetera");
        cs.setCapacidadMaxima(leer.nextInt());
        cs.setCantidadActual(0);
        return cs;
    }
    
    public void llenarCafetera(Cafetera cs){
        cs.setCantidadActual(cs.getCapacidadMaxima());
    }
    public void servirTaza(Cafetera cs){
        System.out.println("Por favor ingrese el tamaño de la taza");
        int cantidad = leer.nextInt();
        if(cantidad>cs.getCantidadActual()){
            System.out.println("La taza no se llenó. Solo cargó "+cs.getCantidadActual());
            cs.setCantidadActual(0);
        }else{
            System.out.println("La taza se llenó");
            cs.setCantidadActual(cs.getCantidadActual()-cantidad);
            
        }
    }
    public void vaciarCafetera(Cafetera cs){
        cs.setCantidadActual(0);
        System.out.println("La cafetera se vació");
   }
    
    public void agregarCafe(Cafetera cs){
        System.out.println("Cuanto cafe quiere agregar?");
        int cantidad = leer.nextInt();
        if(cantidad+cs.getCantidadActual()>cs.getCapacidadMaxima()){
            System.out.println("Solo se puede agregar "+(cs.getCapacidadMaxima()-cs.getCantidadActual()));
        }else{
            cs.setCantidadActual(cs.getCantidadActual()+cantidad);
            System.out.println("La cantidad actual de cafe es "+cs.getCantidadActual());
        }
    
}
