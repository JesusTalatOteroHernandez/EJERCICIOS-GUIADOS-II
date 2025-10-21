/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PILAS;

/**
 *
 * @author otero
 */
public class Main {
    public static void main(String[] args) {
        Stack<String> nombres = new Stack<String>();
        nombres.push("Susy");
        nombres.push("Uriel");
        nombres.push("Pipe");
        nombres.push("Adrian");
        
        System.out.println(nombres.pop());
        System.out.println(nombres.pop());
        System.out.println(nombres.pop());
        System.out.println(nombres.pop());
        
    }
}
