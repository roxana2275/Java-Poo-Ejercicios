/*
 Realizar una clase llamada Matemática que tenga como atributos dos números reales con 
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un 
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el 
Math.random para generar los dos números y se guardaran en el objeto con su 
respectivos set. Deberá además implementar los siguientes métodos: 
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor 
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase 
elevado al menor número. Previamente se deben redondear ambos valores. 
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. 
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número. 
 */
package ejercicioguia.pkg9;

import Servicios.MatematicaServicios;
import entidades.Matematica;
import static entidades.Matematica.calculaRaiz;
import static entidades.Matematica.calcularPotencia;
//import static entidades.Matematica.devolverMayor;


/**
 *
 * @author Usuario
 */
public class EjercicioGuia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematica m1 = new Matematica();
        m1.setNum1((int) (Math.random() * 10));
        m1.setNum2((int) (Math.random() * 10));
        System.out.println("num1: "+m1.getNum1()+" num2: "+m1.getNum2());
        System.out.println("El numero mayor es "+MatematicaServicios.devolverMayor(m1.getNum1(), m1.getNum2()));
        System.out.println("El numero mayor elevado al menor es: "+MatematicaServicios.calcularPotencia(m1.getNum1(), m1.getNum2()));
        System.out.println("El raiz cuadrada del numero menor es : "+MatematicaServicios.calculaRaiz(m1.getNum1(), m1.getNum2()));
    }
  
    
}
