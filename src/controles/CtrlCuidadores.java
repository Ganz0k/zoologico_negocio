/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controles;

import entidades.Cuidador;
import entidades.Especie;
import factory.FabricaDatos;
import interfaces.IDatos;
import java.util.List;
import org.bson.types.ObjectId;

/**
 * Clase de control que utiliza un objeto del tipo IDatos para acceder a los
 * métodos del subsistema de datos
 *
 * @author luisg
 */
public class CtrlCuidadores {

    private final IDatos datos;

    /**
     * Constructor que inicializa el atributo datos gracias a la FabricaDatos
     */
    public CtrlCuidadores() {
        this.datos = FabricaDatos.crearFDatos();
    }

    /**
     * Utiliza el método guardarCuidador de la interfaz IDatos para guardar 
     * el cuidador dado por el parametro en la base de datos.
     * 
     * @param cuidador Cuidador a agregar
     * @return true en caso de lograr guardar, false en caso contrario.
     */
    public boolean guardarCuidador(Cuidador cuidador){
        return this.datos.guardarCuidador(cuidador);
    }
    
    /**
     * Utiliza el método consultarCuidadores de la interfaz IDatos para obtener
     * una lista con todos los cuidadores que hay en la base de datos, regresa
     * null en caso de no encontrar nada
     *
     * @return lista con todos los cuidadores en la base de datos, null en caso
     * de no se encuentre nada
     */
    public List<Cuidador> consultarCuidadores() {
        return this.datos.consultarCuidadores();
    }

    /**
     * Utiliza el método agregarEspecieCuidador de la interfaz IDatos para
     * agregar una especie a la lista del campo especiesExperto del cuidador que
     * coincida con el id del parámetro
     *
     * @param idCuidador id del cuidador a actualizar
     * @param especie especie a añadir en la lista de especiesExperto
     */
    public void agregarEspecieCuidador(ObjectId idCuidador, Especie especie) {
        this.datos.agregarEspecieCuidador(idCuidador, especie);
    }
}
