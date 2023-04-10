/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author user
 */
public class Ahorcado {
    private String palabra [];
    private int letrasEncontradas;
    private int cantidadJugadasMaximas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int letrasEncontradas, int cantidadJugadasMaximas) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.cantidadJugadasMaximas = cantidadJugadasMaximas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getCantidadJugadasMaximas() {
        return cantidadJugadasMaximas;
    }

    public void setCantidadJugadasMaximas(int cantidadJugadasMaximas) {
        this.cantidadJugadasMaximas = cantidadJugadasMaximas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", letrasEncontradas=" + letrasEncontradas + ", cantidadJugadasMaximas=" + cantidadJugadasMaximas + '}';
    }
    
    
    
}
