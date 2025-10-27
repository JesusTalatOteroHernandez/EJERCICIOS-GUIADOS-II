/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package COLA;

import java.util.Scanner;

/**
 *
 * @author Jesus Talat Otero Hernandez otero
 * 1224100702.jtoh@gmail.com
 */
public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Cola<String> accion = new Cola<>();
        int cont;
        do{
            System.out.println("======================== Menu ==========================");
            System.out.println("1.- Insertar \n2.- Eliminar \n3.- Ver cabezal \n4.- Tamaño \n5.- Lista");
            int op = teclado.nextInt();
            teclado.nextLine();
            switch(op){
                case 1:{
                    System.out.println("Ingresa un dato: ");
                    String data = teclado.nextLine();
                    accion.encolar(data);
                }break;
                case 2:{
                    accion.desencolar();
                }break;
                case 3:{
                    System.out.println(accion.peek());  
                }break;
                case 4:{
                    System.out.println(accion.tamano()); 
                }break;
                case 5:{
                    accion.listaComp();
                }break;
            }
            System.out.println("Continuar? \n1- Si \n2.-No");
            cont = teclado.nextInt();
        }while(cont == 1);
        
    }
}
