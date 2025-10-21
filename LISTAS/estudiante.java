/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTAS;

/**
 *
 * @author Jesus Talat Otero Hernandez 1224100702.jtoh@gmail 
 */
public class estudiante<T> {
    private int edad;
    private String nombre;
    private float estatura;

    public estudiante() {
        
    }
    
    public estudiante(int edad, String nombre, float estatura) {
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
    }
    
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
    
    public String estudiar(){
        return "ESUTDIO 22HRS";
    }
    public String dormir(){
        return "DUERMO 2HRS ZZZZzzz";
    }
}
