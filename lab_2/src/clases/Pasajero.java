/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author ragle
 */
public class Pasajero {
    //Declarando datos de la clase.
    
    private String rut;
    private String nombre;
    private int edad;
    private int telefono;
    
   //Tambien es posible modificar el  to string para ahorrarse poner un metodo para retornar los datos.(alt+insert - tostring) 
/*
    @Override
    public String toString() {
        return "Pasajero{" + "rut=" + rut + ", nombre=" + nombre + ", edad=" + edad + ", telefono=" + telefono + '}';
    }
 
    //Donde al poner el nombre de la clase aparecera esto 
*/    
    
    //Constructor (alt+insert - constructor)
    public Pasajero(String rut, String nombre, int edad, int telefono) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }
    
    
    //Getter and Setter: Acceder(get) y Mutar (Cambiar)(set) datos
    //Atajo: alt+insert - getter and setter
    
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    //Metodos:
    //Metodo que retorna la informacion de la clase guardada.
    public String imprimir(){
        return "Nombre: " + nombre + ", Rut: " + rut + ", Edad: " + edad + ", Telefono: " + telefono;
    }
    
}
