/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author ragle
 */
public final class Pasaje {
    //Declarando datos de la clase.

    private int numeroAsiento;
    private String tipoServicio;

    //guardamos la clase pasajero dentro de esta, asi que se tiene que crear primero pasajero antes que pasaje.
    private Pasajero pasajero;

    //Constructor (alt+insert - constructor)
    public Pasaje(int numeroAsiento, String tipoServicio, Pasajero pasajero) {
        setNumeroAsiento(numeroAsiento);
        setTipoServicio(tipoServicio);
        this.pasajero = pasajero;
    }
    
    /*Tambien es posible modificar el  to string para ahorrarse poner un metodo para retornar los datos.
    (alt+insert - tostring)*/
    
    /*
    @Override
    public String toString() {
        return "Pasaje{" + "numeroAsiento=" + numeroAsiento + ", tipoServicio=" + tipoServicio + ", pasajero=" + pasajero + '}';
    }
     */
    
    //Getter and Setter: Acceder(get) y Mutar (Cambiar o set) datos
    //Atajo: alt+insert - getter and setter
    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    //Primera Regla de Negocio: Asiento del 1 al 100
    public void setNumeroAsiento(int numeroAsiento) {
        if (numeroAsiento >= 1 && numeroAsiento <= 100) {
            this.numeroAsiento = numeroAsiento;
        }
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    //Segunda Regla de Negocio: Los tipos de servicio solo pueden ser Completo, Snack, Solo Jugo
    public void setTipoServicio(String tipoServicio) {
        //Aqui puedes usar el .equals o simplemente "==", tiene la misma funcion de comparar.
        if (tipoServicio.equals("Snack") || tipoServicio.equals("Completo") || tipoServicio.equals("Solo Jugo")) {
            this.tipoServicio = tipoServicio;
        }
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    //Metodos:
    //Metodo que retorna la informacion de la clase guardada.
    public String imprimir() {
        return "Numero: " + numeroAsiento + ", Tipo:" + tipoServicio + ", Pasajero(" + pasajero.imprimir() + ")";
    }
}
