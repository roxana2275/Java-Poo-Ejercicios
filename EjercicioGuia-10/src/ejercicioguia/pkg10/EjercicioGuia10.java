/*
 Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A 
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El 
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. 
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números 
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 
20. 

 */
package ejercicioguia.pkg10;

import java.text.DecimalFormat;
import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class EjercicioGuia10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double[] vectorA = new double[50];
        double[] vectorB = new double[20];
        
        //DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("Generando vectorA");
        for (int i = 0; i < 50; i++) {
            vectorA[i] = Math.random()*10;
        }
        System.out.println("Imprimiendo vectorA");
        System.out.println(" "+Arrays.toString(vectorA));

       
        System.out.println("Ordenando vectorA");
        Arrays.sort(vectorA);
        
        
        System.out.println("Imprimiendo vectorA ordenado");
        System.out.println(Arrays.toString(vectorA)); 
        
        System.out.println("Rellenando vectorB con 0.5");
        
        for (int i = 0; i < 20; i++) {
            if(i<10){
                vectorB[i] = vectorA[i];
            }else{
               Arrays.fill(vectorB, 10,20,0.5);
            }
            
        }
        System.out.println("Imprimiendo vectorB");
         System.out.println(Arrays.toString(vectorB)); 
        
        /*for (int i = 0; i < 20; i++) {
            System.out.print(vectorB[i]+" ");

        }*/
    }
    
}
