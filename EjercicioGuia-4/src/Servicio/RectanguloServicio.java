/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class RectanguloServicio {
    
    public Rectangulo cargarRectangulo(){
    Rectangulo r1 = new Rectangulo();
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese la base superior a 0");
            r1.setBase(leer.nextInt());
        } while (r1.getBase() <= 0);
        do {
            System.out.println("Ingrese la altura superior a 0");
            r1.setAltura(leer.nextInt());
        } while (r1.getAltura() <= 0 || r1.getAltura()==r1.getBase());

        return r1;

    }

    public void Calsuperficie(Rectangulo R2) {
        System.out.println("La superficie es igual a: " + (R2.getAltura() * R2.getBase()));

    }

    public void Calperimetro(Rectangulo R2) {
        System.out.println("El perimetro es igual a: " + (R2.getAltura() * 2 + R2.getBase() * 2));
    }

    public void Dibujar (Rectangulo R2){
        for (int i = 0; i < R2.getBase(); i++) {
            System.out.println("");
            for (int j = 0; j < R2.getAltura(); j++) {
                System.out.print("*");
                
            }

            
        }
        System.out.println("");
    }
}
