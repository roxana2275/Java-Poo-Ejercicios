/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioOperacion {
    
    public Operacion crearOperacion(){
        Scanner leer = new Scanner (System.in);
        Operacion o1 = new Operacion();
        boolean control = false;
        do{
            System.out.println("Ingrese un numero mayor a 0");
            o1.setNumero1(leer.nextInt());
            if( o1.getNumero1()>0){
                control=true;
            }
        }while(control==false);
        control=false;
        do{
            System.out.println("Ingrese un numero mayor a 0 y menor que el anterior");
            o1.setNumero2(leer.nextInt());
            if(o1.getNumero2()>0&&o1.getNumero2()<o1.getNumero1()){
                control=true;
            }
            
        }while(control==false);
        
        return o1;
    }
    public void sumar(Operacion o1){
        
        System.out.println("La suma de los dos numeros es "+(o1.getNumero1()+o1.getNumero2()));
    }
    
    public void restar(Operacion o1){
            System.out.println("La resta de los dos numeros es "+(o1.getNumero1()-o1.getNumero2()));
        
    }
    public void multiplicar(Operacion o1){
        if(o1.getNumero2()==0){
            System.out.println("La multiplicacion de los dos numeros es 0 porque el valor del segundo número es "+o1.getNumero2());
        }else{
            System.out.println("La multiplicacion de los dos numeros es "+(o1.getNumero1()*o1.getNumero2()));
        }
            
    }
    public void dividir(Operacion o1){
        if(o1.getNumero2()==0){
            System.out.println("La division de los dos numeros es 0 porque el valor del segundo número es "+o1.getNumero2());
        }else{
            System.out.println("La division de los dos numeros es "+(o1.getNumero1()/o1.getNumero2()));
        }
            
    }
    
}


