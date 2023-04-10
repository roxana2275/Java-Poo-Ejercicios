/*
 * Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
con los parámetros que sean necesarios:
 Constructores, tanto el vacío como el parametrizado.
 Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
máximas, el valor que ingresó el usuario y encontradas en 0.
 Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
 Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
 Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
 Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
 Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.

Un ejemplo de salida puede ser así:

Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4
----------------------------------------------
Ingrese una letra:
z
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 3
---------------------------------------------
Ingrese una letra:
b
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 2
----------------------------------------------
Ingrese una letra:
u
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 1
----------------------------------------------
Ingrese una letra:

q
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Mensaje: Lo sentimos, no hay más oportunidades
 */
package servicioentidades;

import entidades.Ahorcado;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Marcelino
 */
public class ServicioAhorcado {

    Scanner leer = new Scanner(System.in);

    public Ahorcado CrearJuego(Ahorcado a) {

        boolean verificar;
        String palabra;

        do {
            System.out.println("Ingrese la palabra");
            palabra = leer.next();
            a.setLongitud(palabra.length());

            verificar = contieneSoloLetras(palabra);
            if (verificar==false) {
                //if (!contieneSoloLetras(paling)){
                System.out.println("La palabra ingresa no es correcta...");
            } 
        } while (verificar==false);

        String vector1[] = new String[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            String aux = palabra.substring(i, i + 1);
            vector1[i] = aux;
        }

        a.setVector(vector1);

        while(true){
            System.out.println("Ingrese la cantidad maxima de jugadas");
            String aux = leer.next();
            if (Pattern.matches("^-?\\d+$",aux)) {
                a.setJugadasMax(Integer.parseInt(aux));
                break;
            } 

        }
        return a;
    }
    
    
    
    public static boolean contieneSoloLetras(String cadena) {
        for (int x = 0; x < cadena.length(); x++) {
            //char c = cadena.charAt(x);
            String c = cadena.substring(x, x + 1);
            //if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
            if (Pattern.matches("[a-zA-Z]", c)){  // Solo para string
                return true;
        
            }
        }
        return false;
    }

    public int longitud(Ahorcado a) {
        int longVector = a.getVector().length;
        return longVector;
    }


    public boolean buscar(String letraBuscar, Ahorcado a) {
        boolean estaba = false;
        String aux[]=new String[a.getLongitud()];
        aux=a.getVector();
        
        if(letraBuscar.equals("*") ){
            System.out.println("Opción no valida");
        } else {

            for (int i = 0; i < longitud(a); i++) {
                if (letraBuscar.equals(a.getVector()[i])) {
                    System.out.println("la letra se encuenta en la palabra ");
                    aux[i] = "*";
                    intentos(a);
                    encontradas(letraBuscar,a);
                    estaba = true;
                } else {
                    System.out.println("No se encuentra la letra en la palabra ");
                    estaba = false;
                    int prueba = a.getJugadasMax() - 1;
                    a.setJugadasMax(a.getJugadasMax() - 1);
                    

                }

            }
        }
        a.setVector(aux);
        return estaba;
    }

    public void encontradas(String letra, Ahorcado a) {
        boolean estaba;
        System.out.println("la cantidad de letras encontradas es: " + a.getLetrasEncontradas());
        intentos(a);
        buscar(letra, a);
    }

    public void intentos(Ahorcado a) {

        System.out.println(" Le faltan " + (a.getLongitud() - a.getLetrasEncontradas()));

    }

    public void juego() {
        Ahorcado a = new Ahorcado();
        CrearJuego(a);
        
    }
}
