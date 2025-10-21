/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTAS;

/**
 * Clase hecha para crear un "fila" (lista) para administrar a las personas que veran la pelicula de Joker
 * @author Jesus Talat Otero Hernandez 1224100702.jtoh@gmail.com
 */
public class FilaJoker<T> {
    //Inicializamos la variable cabeza con un tipo Nodo generico
    private Nodo<T> cabeza;

    public FilaJoker() {
        this.cabeza = null;
    }
    
    
    public void recorrerFila(){
        Nodo<T> temp = cabeza;
        while(temp.getIzquierda()!= null){
            System.out.println(temp.getDato());
            temp = temp.getIzquierda();
        }
    }
    
    //Metodo para contar la cantidad de nodos (Personas) en la lista (Fila).
    public int inspeccionar(){
        return 1;
    }
    
    //Atiende a la persona con boleto. 
    public boolean atender(){
        return true;
    }
    
    //Agruegar a mas nodos a la lista.
    public void insertar(){
        
    }
}
