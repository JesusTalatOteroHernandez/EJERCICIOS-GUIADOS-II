/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package PILAS;

/**
 *
 * @author otero
 * Clase interfaz para la pila
 */
public interface Istack<T> {
    //Abstracta significa que no tiene definido que hara aqui en la intefaz
    //Ingresamos los elementos genericos
    public abstract void push(T element);
    //Remueve el elemento de la pila
    //No conoce el elemento que implementara asi que no necesita un paramtro y el tipo de retorno es T de generico
    T pop();
    //peek: Muestra el ultimo elemento ingresado que esta en la pila
    //No conoce el elemento que sacara asi que no necesita un paramtro y el tipo de retorno es T de generico
    T peek();
    //Revisa si esta vacia la lista no lleva parametro ya que no debera de recibir un elemento para verificar.
    boolean isEmpty();
    
}
