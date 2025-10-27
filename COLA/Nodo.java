/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package COLA;

/**
 *
 * @author Jesus Talat Otero Hernandez otero
 * 1224100702.jtoh@gmail.com
 * Clase para crear lo nodos en este caso es un nodo generico
 */
public class Nodo<T> {
    //Dato generico
    private T dato;
    //Enlace 
    private Nodo siguiente;

    //Constructor vacio
    public Nodo() {
    }

    //Constructor
    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    //Getters and setters 
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + ", siguiente=" + siguiente + '}';
    }
    
    
    
}
