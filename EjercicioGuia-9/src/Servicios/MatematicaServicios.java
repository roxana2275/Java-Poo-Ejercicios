/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;



/**
 *
 * @author Usuario
 */
public class MatematicaServicios {
        
    public static int calcularPotencia(int num1, int num2){
        int resultado;
        if (devolverMayor(num1, num2)==num1){
            resultado = (int) Math.pow(num1, num2);

        }else {
            resultado =  (int) Math.pow(num2, num1);
        }
        return resultado;
    }
    public static double calculaRaiz(int num1, int num2){
        double resultado;
        if (devolverMayor(num1, num2)==num1){
            resultado =  Math.sqrt(num2);

        }else {
            resultado =  Math.sqrt(num1);
        }
        return resultado;
    }
    public static int devolverMayor( int num1, int num2){
            
        return Math.max(num1, num2);
    }     
}
