/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PILAS;

/**
 *
 * @author Jesus Talat Otero Hernandez
 */
//Implements es una herencia multiple
public class Stack<T> implements Istack<T> {
    private T[] elements; //Estructura de datos interna
    private int top; //Indice de la cima; 
    
    //Constructores para crear una pila, uno ya indicada con 30 elementos y el otro uno indica el tamaño
    public Stack() {
        elements = (T[])new Object[30];
    }

    public Stack(int size) {
        elements = (T[])new Object[size];
    }
    
    @Override
    public void push(T element) {
        if (top < elements.length - 1) {
            top++;
            elements[top] = element;
        }else{
            System.out.println("FULLLLL");
        }
    }

    @Override
    public T pop() {
        int temp = top;
        while(temp < elements.length-1){
            temp --;
            
        }
        
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("Pila Vacía");
        }
        System.out.println("Conociendo el último de la pila");
        return (T) elements[top -1];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    
    
}
