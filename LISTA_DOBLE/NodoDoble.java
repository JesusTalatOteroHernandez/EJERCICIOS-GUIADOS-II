/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA_DOBLE;

/**
 * Esta clase crea los nodos y enlaces de la lista
 * @author Jesus Talat Otero Hernandez 
 */
public class NodoDoble<T> {
    private T dato;
    private NodoDoble izquierda;
    private NodoDoble derecha;

    public NodoDoble() {
        dato = null;
    }
    
    public NodoDoble(T dato) {
        this.dato = dato;
        /*this.izquierda = izquierda;
        this.derecha = derecha;*/
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoDoble getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoDoble izquierda) {
        this.izquierda = izquierda;
    }

    public NodoDoble getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoDoble derecha) {
        this.derecha = derecha;
    }
    
}
