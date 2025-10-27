/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package COLA;

/**
 *
 * @author Jesus Talat Otero Hernandez otero
 * 1224100702.jtoh@gmail.com
 * Clase cola generica
 */
public class Cola<T> {
    //Cabeza tipo nodo generico
    private Nodo<T> cabeza;
    //Lista tipo nodo generico
    private Nodo<T> cola;
    //Tamaño de la col
    private int tamano;

    //Constructor vacio para insertar la informacion desde la clase main
    public Cola() {
    }

    
    //Constructor principal
    public Cola(Nodo<T> cabeza, Nodo<T> cola, int tamaño) {
        this.cabeza = null;
        this.cola = null;
        this.tamano = 0 ;
    }
    
    //Ingera los datos dados desde la clase main a la lista
    public void encolar(T elemento){
        //Creamos el nuevo nodo
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        //Si la cabeza que es nulla, indica que la cabeza sera igual al nuevo nodo ingresado y la cola empieza desde la cabeza
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = cabeza;
        }else{
            //Enlaza la lista
            this.cola.setSiguiente(nuevoNodo);
            //El nodo ingresado sera la cola
            this.cola = nuevoNodo;
        }
        //Incremento de tamaño
        tamano ++;
        //Indica el elemento insertado a la lista
        System.out.println("-> Insertado "+elemento);
        
    }
    
    //Metodo para eliminar el elemento que este al frente y lo imprime
    public T desencolar(){
        //Analiza si la lista esta vacia
        if (isEmpty()==true) {
            System.out.println("La cola esta vacia");
        }
        //Dato tipo generico que tendra el valor de la cabeza
        T datoEliminado = cabeza.getDato();
        //Indica que la nueva cabeza de la cola sera el nodo que esta siguiente al anteriror
        this.cabeza = this.cabeza.getSiguiente();
        //Se reduce el tamaño
        tamano --;
        //Devuelve el datoEliminado que tiene el valor de la cabeza anterior
        return datoEliminado;
    }
    
    //Muestra ls csbeza de la cola sin eliminarlo
    public T peek(){
        //Verifica si esta vacia
        if (isEmpty()) {
            System.out.println("La cola Esta Vacia");
        }
        //Devuelve el valor de la cabeza
        return this.cabeza.getDato();
    }
    
    //Verifica si no existe una cola
    public boolean isEmpty(){
        return cabeza == null;
    }
    
    //Regresa el tamaño de la lista
    public int tamano(){
        return tamano;
    }
    
    //Imprime la lista completa
    public void listaComp(){
        //Creamos un puntero temporal
        Nodo<T> temp = cabeza;
        //Verifica si nodo actual no sea nulla
        while(temp != null){
            //Imprime el dato del nodo actual al que este el puntero
            System.out.print("<-["+temp.getDato()+"]");
            //El puntero cambiara al siguiente nodo
            temp = temp.getSiguiente();
        }
            
    }
    
}
