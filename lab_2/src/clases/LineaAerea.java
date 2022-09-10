/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
//Primero Importamos los ArrayList para usarlos en nuestra clase

import java.util.ArrayList;

/**
 *
 * @author ragle
 */
public class LineaAerea {

    //Declarando datos de la clase, donde es una lista que guarda clases pasaje.
    private ArrayList<Pasaje> pasajes;

    //Constructor (alt+insert - constructor)
    public LineaAerea() {
        //Crea la lista al ser llamado
        pasajes = new ArrayList<>();
    }

    //Getter and Setter: Acceder(get) y Mutar (Cambiar)(set) datos
    //Atajo: alt+insert - getter and setter
    public ArrayList<Pasaje> getPasajes() {
        return pasajes;
    }

    public void setPasajes(ArrayList<Pasaje> pasajes) {
        this.pasajes = pasajes;
    }

    //Metodos:
    //Agregar pasaje con una condicion, que el numero no este repetido ni sobrepase el 100 o sea menor que el 1.
    public boolean agregarPasaje(Pasaje p) {
        if (buscarPasaje(p.getNumeroAsiento()) && p.getNumeroAsiento() != 0 && p.getTipoServicio() != null) {
            pasajes.add(p);
            return true;
        } else {
            return false;
        }
    }
    
    //Metodo complementario para agregar pasaje donde se busca el asiento y si esta retorna falso y si no verdadero
    public boolean buscarPasaje(int asiento) {
        for (Pasaje pasaje : pasajes) {
            if (pasaje.getNumeroAsiento()== asiento)
                return false;
        }
        return true;
    }
    
    //Metodo para regresar un string donde esten todos los datos de los pasajes 
    public String listarPasajes() {
        String h = "";
        if (pasajes.isEmpty())return null;
        else{
            for (Pasaje pasaje : pasajes) {
                h += pasaje.imprimir() + "\n";
            }
            return h;
        }
    }
    
    /*Metodo para tener el total de pasajes vendidos, osea el total de pasajes registrados, ya que no hay 
    un atributo que diga vendido se razona que todos lo que estan en la lista estan vendidos*/
    public int obtenerPasajesVendidos() {
        return pasajes.size();
    }
}
