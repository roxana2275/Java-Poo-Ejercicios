/*
 * 
 */
package entidades;

import java.util.Arrays;

/**
 *
 * @author Marcelino
 */
public class Ahorcado {
    private int longitud,letrasEncontradas,jugadasMax;
    private String vector[]=new String[longitud];

    public Ahorcado() {
    }

    public Ahorcado(int longitud, int letrasEncontradas, int jugadasMax) {
        this.longitud = longitud;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMax = jugadasMax;
        
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    public String[] getVector() {
        return vector;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }


  

    @Override
    public String toString() {
        return "Ahorcado{" + "longitud=" + longitud + ", letrasEncontradas=" + letrasEncontradas + ", jugadasMax=" + jugadasMax + ", vector=" + Arrays.toString(vector) + '}';
    }
    
}
