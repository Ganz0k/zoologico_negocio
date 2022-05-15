/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controles;

import entidades.Guia;
import entidades.Itinerario;
import factory.FabricaDatos;
import interfaces.IDatos;
import java.util.List;
import org.bson.types.ObjectId;

/**
 * Clase de control que utiliza un objeto del tipo IDatos para acceder a los
 * métodos del subsistema datos
 *
 * @author PC OSCAR
 */
public class CtrlGuias {

    private final IDatos datos;

    /**
     * Constructor que inicializa el atributo datos gracias a la FabricaDatos
     */
    public CtrlGuias() {
        this.datos = FabricaDatos.crearFDatos();
    }

    /**
     * Utiliza el método consultarGuias de la interfaz IDatos para obtener la
     * lista de guias en su totalidad.
     *
     * @return lista con todos los guias registrados, null en caso de no
     * encontrar nada.
     */
    public List<Guia> consultarGuias() {
        return this.datos.consultarGuias();
    }

    /**
     * Utiliza el método agregarItinerario de la interfaz IDatos para añadir una
     * referencia de una entidad itinerario a la lista guias que coincida con
     * los ids dados por el parámetro.
     *
     * @param itinerario itinerario a agregar a la lista de itinerarios del
     * guia.
     * @param idGuia id de la guia en la lista de guias
     */
    public void agregarItinerario(ObjectId idGuia, Itinerario itinerario) {
        this.datos.agregarItinerario(idGuia, itinerario);
    }

    /**
     * Utiliza el método guardarGuia de la interfaz IDatos para agregar el guia
     * dado por el parámetro a la base de datos.
     *
     * @param guia Guia a agregar en la base de datos.
     * @return true en caso de poder agregar el guia, false en caso contrario.
     */
    public boolean guardarGuia(Guia guia) {
        return this.datos.guardarGuia(guia);
    }

    /**
     * Método que llama al método de consultarGuia de IDatos para obtener un
     * guía según su itinerario
     *
     * @param itinerario El id del itinerario a obtener
     * @return El guía en cuestión
     */
    public Guia consultarGuia(ObjectId itinerario) {
        return this.datos.consultarGuia(itinerario);
    }
}
