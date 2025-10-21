/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTAS;

/**
 *
 * @author Jesus Talat Otero Hernandez 1224100702.jtoh@gmail 
 */
public class Nodo<T> {
    private T dato;
    private Nodo izquierda; //Esto se le puede comparar a algo recursivo.

    //Tambien puedes ponerlo en privado pero ocurrira lo mismo como una clase abstrracta, nadie la podra usar excepto la clase
    public Nodo(T dato) { //Nadamas tiene el modificador
        this.dato = dato; //Accedemos a las propiedades con el methodo this
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }
    
    
    
}
