/*
 Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas 
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán 
además definir los métodos getters y setters correspondientes. 
 */
package entidades;

/**
 *
 * @author Usuario
 */
public class Cancion {
    private String titulo;
    private String aututor;


    public Cancion() {
    }

    public Cancion(String titulo, String aututor) {
        this.titulo = titulo;
        this.aututor = aututor;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAututor() {
        return aututor;
    }

    public void setAututor(String aututor) {
        this.aututor = aututor;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", aututor=" + aututor + '}';
    }
    
}
