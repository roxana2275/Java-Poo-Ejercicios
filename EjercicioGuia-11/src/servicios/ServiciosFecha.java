/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Fecha;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServiciosFecha {
    Scanner leer = new Scanner(System.in);
    
    public void crearFecha(Fecha fs){
        
            System.out.println("Por favor ingrese el anio");
            fs.setAnio(leer.nextInt());
            while(fs.getAnio()<0){
                System.out.println("Por favor ingrese el anio");
                fs.setAnio(leer.nextInt());
            }
            System.out.println("Por favor ingrese el mes");
            fs.setMes(leer.nextInt());
            while(fs.getMes()<1||fs.getMes()>12){
                System.out.println("Por favor ingrese el mes");
                fs.setMes(leer.nextInt());
            }
            System.out.println("Por favor ingrese el día");
            fs.setDia(leer.nextInt());
            while(fs.getDia()<0||fs.getDia()>31){
                System.out.println("Por favor ingrese el día");
                fs.setDia(leer.nextInt());
            }
        
            Date fechaCreada = new Date(fs.getAnio()-1900, fs.getMes()-1,fs.getDia());
         fs.setFecha(fechaCreada);
            System.out.println(fs.getFecha());
    }
    public void diferenciaAnios(Fecha fs){
        LocalDate f2 = LocalDate.now();
        int diferencia = f2.getYear()-fs.getAnio();
        System.out.println("La diferencia entre años es "+diferencia);
    }
}
