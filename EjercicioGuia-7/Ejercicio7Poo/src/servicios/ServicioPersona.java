/*Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas

cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.EntidadesPersona;
import java.util.Scanner;

/**
 *
 * @author A278617
 */
public class ServicioPersona {
    Scanner leer = new Scanner(System.in);
    
    public EntidadesPersona crearPersona(){
        EntidadesPersona P1 = new EntidadesPersona ();
        System.out.println("ingrese su nombre");
        P1.setNombre(leer.next());
        System.out.println("ingrese su edad");
        P1.setEdad(leer.nextInt());
        if(P1.getEdad()<18){
            P1.setMayorEdad(false);
        }else{
            P1.setMayorEdad(true);
        }
        System.out.println("Ingrese su sexo - H, M u O");
        P1.setSexo(leer.next().toUpperCase().charAt(0));
        if (P1.getSexo()==0){
            System.out.println("el sexo ingresado es incorrecto");      
    }
        System.out.println("ingrese su peso");
        P1.setPeso(leer.nextDouble());
        System.out.println("ingrese su altura");
        P1.setAltura(leer.nextDouble());
        double IMC =P1.getPeso()/(P1.getAltura()*P1.getAltura());
        P1.setIMC(IMC);
        System.out.println("el objeto fue creado");
        return P1;
        
   
    }
    
    public int calcularIMC(EntidadesPersona P1){
        int rtdo;
        if (P1.getIMC()<20){
            System.out.println("su peso esta por debajo del peso ideal");
            rtdo=-1;
        }else if (P1.getIMC()>=20 && P1.getIMC()<=25){
            System.out.println("su peso es el ideal");
            rtdo=0;           
        }else{
            System.out.println("ud tiene sobrepeso");
            rtdo=1;
        } 
        
        return rtdo;
    }
    
    public boolean esMayorDeEdad(EntidadesPersona P1){
        boolean rtaEdad;
        if (P1.getEdad()<18) {
            rtaEdad=false;   
        }else{
            rtaEdad=true;
        }
        //System.out.println(P1.getNombre()+P1.getAltura()+P1.getEdad()+P1.getSexo()+P1.getIMC());
        return rtaEdad;
    }
    
    
}
