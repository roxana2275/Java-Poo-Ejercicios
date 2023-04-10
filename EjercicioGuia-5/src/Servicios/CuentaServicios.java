/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cuenta;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CuentaServicios {
    Scanner leer = new Scanner(System.in);
    public Cuenta crearCuenta(){
        
        
        Cuenta c1 = new Cuenta();
        System.out.println("Ingrese su DNI");
        c1.setDNI(leer.nextInt());
        System.out.println("Ingrese Saldo de la cuenta");
        c1.setSaldoActual(leer.nextInt());
        System.out.println("Ingrese el numero de cuenta");
        c1.setNumeroCuenta(leer.nextInt());
        
        return c1;
    }
    
    public void ingresarDinero(Cuenta cs){
        System.out.println("Cuanto dinero va a ingresar?");
        double ingreso=leer.nextInt();
        int ingresoInt = (int) ingreso+cs.getSaldoActual();
        cs.setSaldoActual(ingresoInt);
        
    }
    
    public void retirarDinero(Cuenta cs){
        System.out.println("Cuanto dinero va a retirar?");
        double egreso=leer.nextInt();
        
        if(egreso<cs.getSaldoActual()){
            int egresoInt = cs.getSaldoActual()-(int) egreso;
            cs.setSaldoActual(egresoInt);
        }else{
            cs.setSaldoActual(0);
        }
 
    }
    public void extraccionRapida(Cuenta cs){
        LocalDate hoy = LocalDate.now();
        
         if (!hoy.equals(cs.getDate())) {
            cs.setDate(hoy);
            cs.setExtacciones(0);
            
        }
        if(cs.getExtacciones()==0){
            int auxiliar1 =(int) (cs.getSaldoActual()*.2);
            cs.setSaldoRapido(auxiliar1);
        }
       
        if (cs.getSaldoRapido()==0&&hoy.equals(cs.getDate())){
            System.out.println("No puede extraer mas dinero hoy");
        }
        System.out.println("Cuanto quiere retirar");
        int retirar=leer.nextInt();
        if(retirar>cs.getSaldoRapido()){
            
            retirar=cs.getSaldoRapido();
            cs.setSaldoActual(cs.getSaldoActual()-retirar);
            cs.setSaldoRapido(cs.getSaldoRapido()-retirar);
            cs.setExtacciones(cs.getExtacciones()+1);
        }else{
             cs.setSaldoActual(cs.getSaldoActual()-retirar);
             cs.setSaldoRapido(cs.getSaldoRapido()-retirar);
             cs.setExtacciones(cs.getExtacciones()+1);
        }            
    }

    
    /*
||||public void extraccionRapida(Cuenta cs){
        LocalDate hoy = LocalDate.now();
        System.out.println(cs.getDate());
        if(hoy.equals(cs.getDate())){
            System.out.println("No puede retirar dinero");
            
        }else{
            int extraccionR =(int)(cs.getSaldoActual()*.2);
            int retirar = cs.getSaldoActual()-extraccionR;
            System.out.println("El dinero a extraer es de "+extraccionR);
            cs.setDate(hoy);
            cs.setSaldoActual(retirar); 
            
        }
        
    }
*/
    public void consultarSaldo(Cuenta cs){
        System.out.println("Su saldo actual es de :"+cs.getSaldoActual());
    }
    
    public void consultarDatos(Cuenta cs){
        System.out.println("Numero de cuenta "+cs.getNumeroCuenta());
        System.out.println("Numero de DNI "+cs.getDNI());
        
    }

    
}
