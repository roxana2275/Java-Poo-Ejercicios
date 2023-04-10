/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Curso;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioCurso {
    Scanner leer = new Scanner (System.in);
    public void cargarAlumnos(Curso cs) {
        String[] auxiliar = new String[5];
        System.out.println("Ingrese la cantidad de alumnos del curso");
        int cantidad=leer.nextInt();
        while(cantidad>5&&cantidad<0){
             System.out.println("Ingrese la cantidad de alumnos del curso");
            cantidad=leer.nextInt();
        }
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el alumno " + (i + 1));
            auxiliar[i] = leer.next();
        }
        cs.setAlumnos(auxiliar);
    }
    public Curso cargarCurso(){
        Curso cs = new Curso();
        System.out.println("Ingrese el nombre del curso");
        cs.setNombreCurso(leer.next());
        
        System.out.println("Ingrese la cantidad de horas por día");
        cs.setCantidadHorasPorDia(leer.nextInt());
        
        System.out.println("Ingrese la cantidad de días por semana");
        cs.setCantidadDiasPorSemana(leer.nextInt());
        
        System.out.println("Ingrese M si es turno mañana o T si es turno tarde");
        String auxiliar = leer.next().toUpperCase();
        while(!"M".equals(auxiliar)&&!"T".equals(auxiliar)){
            System.out.println("Ingrese M si es turno mañana o T si es turno tarde");
            auxiliar = leer.next().toUpperCase();
        }
        if("M".equals(auxiliar)){
            cs.setTurno(true);
        }else{
            cs.setTurno(false);
        }
        
        System.out.println("Ingrese el precio por hora");
        cs.setPrecioPorHora(leer.nextDouble());
        
        cargarAlumnos(cs);
        
        return cs;
    }
    public double calcularGananciaSemanal(Curso cs){
        double ganancias;
        ganancias = cs.getCantidadHorasPorDia()*cs.getPrecioPorHora()*cs.getAlumnos().length*cs.getCantidadDiasPorSemana();
        return  ganancias;
    }
    
    public void imprimirCurso(Curso cs){
        System.out.println("Nombre Curso: "+cs.getNombreCurso());
        System.out.println("Cantidad de Horas por día: "+cs.getCantidadHorasPorDia());
        System.out.println("Cantidad de días por semana"+cs.getCantidadDiasPorSemana());
        System.out.println("Es turno mañana? "+cs.getTurno());
        System.out.println("El precio por hora es: "+cs.getPrecioPorHora());
        System.out.println("La cantidad de alumnos es "+cs.getAlumnos().length);

        for(String alumno:cs.getAlumnos()){
            System.out.println(alumno);
        }
    }
}
        
            
   
    

