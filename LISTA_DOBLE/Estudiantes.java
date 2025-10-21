/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LISTA_DOBLE;

/**
 * Esta clase representa a los estudiantes de la UTNG
 * @author Jesus Talat Otero Hernandez 1224100702.jtoh@gmail.com
 * 7/10/2025
 */
public class Estudiantes {
    private String nombre;
    private Byte edad;
    private String carrera;

    //Constructor vacio
    public Estudiantes() {
        
    }

    //Constructor que instanciara las variables
    public Estudiantes(String nombre, Byte edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    //Constructor para indicar el valor que tendra el nombre
    public Estudiantes(String nombre) {
        this.nombre = nombre;
    }

    
            
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Byte getEdad() {
        return edad;
    }

    public void setEdad(Byte edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    //Este metodo sirve para traducir de la computadora a lenguaje que nosotros podremos entender
    @Override
    public String toString() {
        return "Estudiantes{" + "nombre=" + nombre + ", edad=" + edad + ", carrera=" + carrera + '}';
    }
    
    
}

