/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;

/**
 *
 * @author ragle
 */
public class main {

    public static void main(String[] args) {
        /*Creamos LineaAerea, ya que modificamos el constructor, cuando llamemos
        esta clase se creara automaticamente el arraylist.*/
        LineaAerea lan = new LineaAerea();
        /*Creamos un pasajero para las pruebas, ya que modificamos su contructor podemos poner su informacion directamente aqui,
        en caso de que no hubiera un constructor, deberiamos usar los getters and setter uno a uno para añadir informacion.*/
        Pasajero juan = new Pasajero("21546789-2", "Juan Perez", 47, 978451526);
        /*Creamos pasajes, usamos el mismo truco que en LineaArea y lo ponemos directamente en la llamada*/
        Pasaje uno = new Pasaje(1, "Snack", juan);
        Pasaje dos = new Pasaje(2, "Completo", juan);
        //No repetido pero tipo incorrecto, no entra.
        Pasaje tres = new Pasaje(3, "Churrasco", juan);
        //Repetido pero Tipo correcto, no entra.
        Pasaje cinco = new Pasaje(2, "Solo Jugo", juan);
        //Fuera de rango
        Pasaje seis = new Pasaje(0, "Solo Jugo", juan);
        Pasaje cuatro = new Pasaje(101, "Completo", juan);
        //Los agregamos a la Arraylist con el metodo pertinente
        lan.agregarPasaje(uno);
        lan.agregarPasaje(dos);
        lan.agregarPasaje(tres);
        lan.agregarPasaje(cuatro);
        lan.agregarPasaje(cinco);
        lan.agregarPasaje(seis);
        //Mostramos los pasajes registrados, usando el metodo que creamos para eso.
        System.out.println(lan.listarPasajes());
        /*Mostramos los pasajes vendidos, osea los que estan dentro del arrraylist, tambien usando el metodo 
        que creamos ateriormente.*/
        System.out.println("Hay " + lan.obtenerPasajesVendidos() + " Pasajes Vendidos");

        /*En caso de querer más interrracion usuario sistema, habria que usar los scanners, añadiendo su libreria 
        y llamandolos*/
        
        //alt+shift+f Ordenar Codigo :)
    }

}
