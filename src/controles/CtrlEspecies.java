/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controles;

import entidades.Especie;
import factory.FabricaDatos;
import interfaces.IDatos;

/**
 * Clase de control que utiliza un objeto del tipo IDatos para acceder a los
 * métodos del subsistema datos
 *
 * @author luisg
 */
public class CtrlEspecies {

    private final IDatos datos;

    /**
     * Constructor que inicializa el atributo datos gracias a la FabricaDatos
     */
    public CtrlEspecies() {
        this.datos = FabricaDatos.crearFDatos();
    }

    /**
     * Utiliza el método consultarEspecie de la interfaz IDatos para obtener la
     * especie de la base de datos que coincida con el nombre dado en el
     * parámetro
     *
     * @param nombre nombre a comparar con los nombres en español de las
     * especies en la base de datos
     * @return una especie en el caso de que encuentre una, null en el caso
     * contrario
     */
    public Especie consultarEspecie(String nombre) {
        return this.datos.consultarEspecie(nombre);
    }

    /**
     * Utiliza el método consultarEspecie de la interfaz IDatos para obtener la
     * especie de la base de datos que coincida con el nombre científico que la
     * especie del parámeto provee
     *
     * @param especie especie la cual proveerá el nombre científico para
     * comparar con las especies en la base de datos
     * @return una especie en el caso de que encuentre una, null en el caso
     * contrario
     */
    public Especie consultarEspecie(Especie especie) {
        return this.datos.consultarEspecie(especie);
    }

    /**
     * Utiliza el método guardarEspecie de la interfaz IDatos para guardar la
     * especie del parámetro
     *
     * @param especie especie a guardar en la colección "especies"
     * @return true en caso de que se logre guardar, false en caso contrario
     */
    public boolean guardarEspecie(Especie especie) {
        return this.datos.guardarEspecie(especie);
    }
}
