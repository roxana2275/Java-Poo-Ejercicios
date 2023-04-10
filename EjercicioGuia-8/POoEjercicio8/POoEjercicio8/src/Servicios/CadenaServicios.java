/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class CadenaServicios {
    Scanner leer = new Scanner(System.in);
    public Cadena crearCadena(){
        Cadena c1 = new Cadena();
        System.out.println("Ingrese una Frase: ");
        c1.setFrase(leer.nextLine());
        c1.setLongitud(c1.getFrase().length());
        return c1;
    }
    
    public int contarVocales(Cadena c1){
        int vocal=0;
        
        for (int i = 0; i < c1.getLongitud(); i++) {
           String caracter = c1.getFrase().substring(i,i+1).toLowerCase();
           switch(caracter){
               
               case "a": case "e": case "i": case "o": case "u": 
                   vocal= vocal+1;
                    break;  
                    
           }
            
        }
        return vocal;
    }
    public void invertirFrase(Cadena c1){
        
        
        for (int i = c1.getLongitud(); i > 0 ; i--) {
            System.out.print(""+c1.getFrase().substring(i-1,i));
            
        }
        System.out.println(" ");
        
    }
     public void vecesRepetida(Cadena c1){
        int repetido=0;
        
         System.out.println("Ingrese el Caracter que desea buscar: ");
         String caracter=leer.next();
        for (int i = 0; i < c1.getLongitud(); i++) {
           if (caracter.equals(c1.getFrase().substring(i,i+1))){
               repetido=repetido+1;
               
           }
            
        }
         System.out.println("El caracter "+caracter+" Esta Repetido: "+repetido+" veces");
        
     }
     public void compararLongitud(Cadena c1){
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese una nueva Frase: " );
         String frase=leer.nextLine();
         if(c1.getLongitud()==frase.length()){
             System.out.println("Las Frases tienen la misma longitud");
         
         
         } else {
             System.out.println("Las Frases no tienen la misma longitud");
         
         
         }
     
     
     }
     public void unirFrases(Cadena c1){
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese una nueva Frase: " );
         String frase=leer.nextLine();
         System.out.println(""+c1.getFrase().concat(frase));
     
     }
     public void reemplazar(Cadena c1) {
        System.out.println("Ingrese por que letra desea reemplaza la a");
        String letra = leer.next();
        for (int i = 0; i < c1.getLongitud(); i++) {
            if ("a".equals(c1.getFrase().substring(i, i + 1))) {
                System.out.print(letra);

            } else {
                System.out.print(c1.getFrase().substring(i, i + 1));
            }
             
            
        }
        System.out.println("");
    }
     public Boolean contiene(Cadena c1){
         Boolean resultado = false;
         System.out.println("Ingrese la letra a encontrar");
         String letra = leer.next();
         for (int i = 0; i < c1.getLongitud(); i++) {
            if (letra.equals(c1.getFrase().substring(i, i + 1))) {
                resultado=true;

            } 
        }
         return resultado;
     }
}
