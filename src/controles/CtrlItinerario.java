/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controles;

import entidades.Itinerario;
import factory.FabricaDatos;
import interfaces.IDatos;

/**
 * Clase de control que utiliza un objeto del tipo IDatos para acceder a los
 * métodos del subsistema datos 
 * 
 * @author PC OSCAR
 */
public class CtrlItinerario {
    
    private final IDatos datos;

    /**
     * Constructor que inicializa el atributo datos gracias a la FabricaDatos
     */
    public CtrlItinerario() {
        this.datos = FabricaDatos.crearFDatos();
    }
    
    /**
     * Utiliza el método guardarItinerario de la interfaz IDatos para agregar el 
     * itinerario dado por el parámetro a la base de datos.
     * 
     * @param itinerario Itinerario a agregar.
     * @return true en caso de agregar el itinerario, false en caso contrario. 
     */
    public boolean guardarItinerario(Itinerario itinerario) {
        return this.datos.guardarItinerario(itinerario);
    }
    
    /**
     * Utiliza el método guardarItinerario de la interfaz IDatos para agregar el 
     * itinerario dado por el parámetro a la base de datos.
     * 
     * @param nombre Nombre del itinerario a verificar.
     * @return itinerariro en caso de encontrar coincidencias, null en caso contrario.
     */
    public Itinerario verificarNombreItinerario(String nombre) {
        return this.datos.verificarNombreItinerario(nombre);
    }
    
}