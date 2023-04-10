/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioCircunferencia {

    
    public Circunferencia crearCircunferencia(){
        Circunferencia c1 = new Circunferencia();
        Scanner leer = new Scanner (System.in);
        System.out.println("Por favor ingrese el radio de la circunferencia");
        c1.setRadio(leer.nextDouble());
        return c1;
    }
    
   
    
    public void circunferenciaRadio(Circunferencia c1){
        double radio = 2*c1.getRadio()*3.14;
            System.out.println("El radio de la circunferencia es: "+radio);
    }
    public void circunferenciaArea(Circunferencia c1){
        double area = c1.getRadio()*c1.getRadio()*3.14;
            System.out.println("El radio de la circunferencia es: "+area);
    }
   public void imprimirCircunferencia(Circunferencia c1) {
        System.out.println("Se creo la circungerencia de radio "+ c1.getRadio());
    }
}
