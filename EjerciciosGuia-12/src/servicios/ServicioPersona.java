/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Persona;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioPersona {
    Scanner leer = new Scanner (System.in);
    
    public Persona crearPersona(){
        Persona ps = new Persona();
        int dia,mes,anio;
        
        System.out.println("Por favor ingrese el nombre de la persona");
        ps.setNombre(leer.next());
        
            System.out.println("Por favor ingrese el anio");
            anio=leer.nextInt();
            while(anio<0){
                System.out.println("Por favor ingrese el anio");
                anio=leer.nextInt();
            }
            System.out.println("Por favor ingrese el mes");
            mes=leer.nextInt();
            while(mes<1||mes>12){
                System.out.println("Por favor ingrese el mes");
                mes=leer.nextInt();
            }
            System.out.println("Por favor ingrese el día");
            dia=leer.nextInt();
            while(dia<0||dia>31){
                System.out.println("Por favor ingrese el día");
                dia=leer.nextInt();
            }
        
            LocalDate fechaCreada = LocalDate.of(anio, mes,dia);
            ps.setFechaNacimiento(fechaCreada);
            
            return ps;
    }
    public void mostrarPersona(Persona ps){
        System.out.println("La persona "+ps.getNombre()+" fue creada con fecha de nacimiento "+ps.getFechaNacimiento());
    }
    public int calcularEdad(Persona ps){
        LocalDate hoy = LocalDate.now();
        LocalDate nacimiento = ps.getFechaNacimiento();
        int diffYear=hoy.getYear()-nacimiento.getYear();
        int diffMonth = hoy.getMonthValue() - nacimiento.getMonthValue();
        int diffDay = hoy.getDayOfMonth()-nacimiento.getDayOfMonth();
        // Si está en ese año pero todavía no los ha cumplido
        if (diffMonth < 0 || (diffMonth == 0 && diffDay < 0)) {
            diffYear = diffYear - 1;
        }
        return diffYear;
    }
    public boolean compararEdad(Persona ps){
        boolean respuesta=false;
        System.out.println("Ingrese la edad a comparar");
        int edad = leer.nextInt();
        int edadPersona = calcularEdad(ps);
        if(edad<edadPersona){
            respuesta = true;
        }
        System.out.println("La edad ingresada es menor?: ");
        return respuesta;
    }
}
