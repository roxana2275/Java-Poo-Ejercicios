/*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
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

 */
package ejercicio7poo;

import entidades.EntidadesPersona;
import servicios.ServicioPersona;

/**
 *
 * @author A278617
 */
public class Ejercicio7Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPersona cs = new ServicioPersona();
        EntidadesPersona c1 = cs.crearPersona();
        
        EntidadesPersona c2 = cs.crearPersona();
        EntidadesPersona c3 = cs.crearPersona();
        EntidadesPersona c4 = cs.crearPersona();

        cs.calcularIMC(c1);
        cs.esMayorDeEdad(c1);
        
        cs.calcularIMC(c2);
        cs.esMayorDeEdad(c2);
        cs.calcularIMC(c3);
        cs.esMayorDeEdad(c3);
        cs.calcularIMC(c4);
        cs.esMayorDeEdad(c4);

        double[] vectorIMC = new double[4];
        vectorIMC[0] = c1.getIMC();
        vectorIMC[1] = c2.getIMC();
        vectorIMC[2] = c3.getIMC();
        vectorIMC[3] = c4.getIMC();

        boolean[] vectorEdad = new boolean[4];
        vectorEdad[0] = c1.isMayorEdad();
        vectorEdad[1] = c2.isMayorEdad();
        vectorEdad[2] = c3.isMayorEdad();
        vectorEdad[3] = c4.isMayorEdad();
    
        int bajo = 0, normal = 0, superior = 0, menor = 0, mayor = 0;
        
        for (int i = 0; i < 4; i++) {
            

            if (vectorIMC[i] < 20) {
                bajo =bajo+ 1;
            } else if (vectorIMC[i] > 25) {
                superior =superior+ 1;
            } else {
                normal =normal+ 1;
            }
            if (vectorEdad[i] == true) {
                mayor =mayor + 1;

            } else {
                menor =menor+ 1;
            }


        }
                System.out.println("Peso Bajo: " + bajo);
                System.out.println("Peso ideal: " + normal);
                System.out.println("Sobrepeso: " + superior);
                System.out.println("Mayores de edad " + (mayor * 100 / 4)+"%");
                System.out.println("Menores de edad " + (menor * 100 / 4)+"%"); 


    }

}
