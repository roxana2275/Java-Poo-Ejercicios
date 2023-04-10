/*
Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para 
instanciar un objeto Celular y poder cargarlo en nuestro programa. 
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete 
números de un celular. Para ello, puede utilizarse un bucle repetitivo 
 */
package servicios;

import entidades.Movil;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MovilServicios {
    Scanner leer = new Scanner (System.in);
    public Movil cargarCelular(){
        Movil m1 = new Movil();
        System.out.println("Ingrese  la marca");
        m1.setMarca(leer.nextLine());
        System.out.println("Ingrese el modelo");
        m1.setModelo(leer.nextLine());
        System.out.println("Ingrese el precio");
        m1.setPrecio(leer.nextDouble());
        System.out.println("Ingrese la memoria Ram");
        m1.setMemoriaRam(leer.nextInt());
        System.out.println("Ingrese la capacidad de almacenamiento");
        m1.setAlmacenamiento(leer.nextInt());
        ingresarCodigo(m1);
       return m1;
    }
    public void ingresarCodigo(Movil m1){
        int[] codigo = new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese del codigo el dígito "+(i+1));
            codigo[i]=leer.nextInt();
        }
        m1.setCodigo(codigo);
    }
    public void imprimirCelular(Movil m1){
        System.out.println(m1.toString());
    }
}
