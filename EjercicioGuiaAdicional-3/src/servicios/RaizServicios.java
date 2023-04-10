/*
  las operaciones que se podrán realizar son las siguientes: 
 Método getDiscriminante(): devuelve el valor del discriminante (double). El 
discriminante tiene la siguiente formula: (b^2)-4*a*c 
 Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para 
que esto ocurra, el discriminante debe ser mayor o igual que 0. 
 Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para 
que esto ocurra, el discriminante debe ser igual que 0. 
 Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 
posibles soluciones. 
 Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. 
Es en el caso en que se tenga una única solución posible. 
 Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por 
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso 
de no existir solución, se mostrará un mensaje.

 */
package servicios;

import entidades.Raiz;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class RaizServicios {
    Scanner leer = new Scanner (System.in);
    public Raiz cargarEcuacion(){
        Raiz r1 = new Raiz();
        System.out.println("Ingrese el valor del termino a que multiplica a x al 2");
        r1.setA(leer.nextDouble());
        System.out.println("Ingrese el valor del termino b que multiplica a x");
        r1.setB(leer.nextDouble());
        System.out.println("Ingrese el valor del termino independiente c");
        r1.setC(leer.nextDouble());
        return r1;
    }
    
    public double getDiscriminante(Raiz r1){
        double discriminante = (Math.pow(r1.getB(), 2))-4*r1.getA()*r1.getC();
                
        return discriminante;
    }
    
    public boolean tieneRaices(Raiz r1){
        boolean tieneRaiz = true;
        
        if(getDiscriminante(r1)==0){
            tieneRaiz = false;
        }
        return tieneRaiz;
    }
    public double[] obtenerRaices(Raiz r1){
        double[] raices = new double[2];
        if(tieneRaices(r1)==true){
            raices[0] = ((r1.getB()*(-1))+getDiscriminante(r1))/(2*r1.getA());
            raices[1] = ((r1.getB()*(-1))-getDiscriminante(r1))/(2*r1.getA());
        }
        System.out.println("Las raices son: ");
        return raices;
    }
    public double obtenerRaiz(Raiz r1){
        double raiz=0;
        if(tieneRaices(r1)==true){
            raiz= (r1.getB()*(-1))/(2*r1.getA());
           
        }
        System.out.println("La raiz es: ");
        return raiz;
    }
    public void calcular(Raiz r1){
        if(tieneRaices(r1)==true){
            System.out.println(Arrays.toString(obtenerRaices(r1)));
        }else{
            System.out.println(obtenerRaiz(r1));
        }
    }
}
