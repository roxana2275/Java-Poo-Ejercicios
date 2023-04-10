/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class AhorcadoServicios {
    Scanner leer = new Scanner(System.in);
    public Ahorcado crearJuego(){
        Ahorcado a1= new Ahorcado();
        System.out.println("Por favor ingresa la palabra a adivinar");
        String palabra=leer.next();
        String vector [ ]= new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
           vector[i]=palabra.substring(i,i+1);
        }
        a1.setPalabra(vector);
        //for (int i = 0; i < palabra.length(); i++) {
        //    System.out.println(a1.getPalabra()[i]);
        //}
        System.out.println("Por favor ingresa la cantidades de jugadas máximas");
        a1.setCantidadJugadasMaximas(leer.nextInt());
        a1.setLetrasEncontradas(0);
        
        return a1;
    }
    
    public int longitud(Ahorcado a1){
       int m=a1.getPalabra().length;
       
        return m;
        }
    
    public void buscar(Ahorcado a1, String letra){
        
        int aux=0;
        for (int i = 0; i <a1.getPalabra().length; i++) {
            if (a1.getPalabra()[i].equals(letra)) {                
                aux=aux+1;
            }            
        } 
        if (aux>0) {
            System.out.println("La letra pertenece a la palabra");            
        }
        else{
            System.out.println("La letra no pertenece a la palabra");
        }
    }
    
    public boolean encontradas(Ahorcado a1){
       boolean f=true;
       System.out.println("Por favor ingresa una letra a buscar");       
       String letra=leer.next();
       System.out.println("La longitud de la palabra es "+longitud(a1));
       buscar(a1,letra);
       int aux=0;
             
       
       for (int i = 0; i <a1.getPalabra().length; i++) {
            if (a1.getPalabra()[i].equals(letra)) {                
                aux=aux+1;
                f=true;
            }
            else{ 
                f=false;
            }          
            
            if (f=false) {
               a1.setCantidadJugadasMaximas(a1.getCantidadJugadasMaximas()-1);
           }
            
            }
       a1.setLetrasEncontradas(aux);
           System.out.println("Numero de letras(encontradas,faltantes): " +aux+"; " + (longitud(a1)-aux));
       return f;
    }
    
    public void intentos(Ahorcado a1){
        System.out.println("No de oportunidades restantes " + a1.getCantidadJugadasMaximas());
    }
    
    public void juego(){
        Ahorcado a1= crearJuego();
        System.out.println("****************************************");
        System.out.println("****************************************");
        int aux2=0;        
        int m=1;        
        do {
        
        encontradas(a1,aux2);
        intentos(a1);
        m=m+1;
        } while (m<=a1.getCantidadJugadasMaximas());
    
        
        
    }
            
            
}
