/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controles;

import entidades.Animal;
import factory.FabricaDatos;
import interfaces.IDatos;
import java.util.List;
import org.bson.types.ObjectId;

/**
 * Clase de control que utiliza un objeto del tipo IDatos para acceder a los
 * métodos del subsistema datos
 *
 * @author luisg
 */
public class CtrlAnimales {

    private final IDatos datos;

    /**
     * Constructor que inicializa el atributo datos gracias a la FabricaDatos
     */
    public CtrlAnimales() {
        this.datos = FabricaDatos.crearFDatos();
    }

    /**
     * Utiliza el método consultarAnimalesEspecie de la interfaz IDatos para
     * obtener la lista de animales que se encuentran en la especie que coincida
     * con el id del parámetro
     *
     * @param idEspecie id de especie a consultar
     * @return lista con todos los animales de la especie, null en caso de no
     * encontrar nada
     */
    public List<Animal> consultarAnimalesEspecie(ObjectId idEspecie) {
        return this.datos.consultarAnimalesEspecie(idEspecie);
    }

    /**
     * Utiliza el método guardarAnimal de la interfaz IDatos para añadir un
     * animal a la lista de animales de la especie que coincida con el id del
     * parámetro
     *
     * @param idEspecie id de la especie a actualizar
     * @param animal animal a añadir en la lista animales
     */
    public void guardarAnimal(ObjectId idEspecie, Animal animal) {
        this.datos.guardarAnimal(idEspecie, animal);
    }

    /**
     * Utiliza el método eliminarAnimal de la interfaz IDatos para eliminar un
     * animal de la lista de animales de la especie que coincida con el id del
     * parámetro
     *
     * @param idEspecie id de la especie a actualizar
     * @param idAnimal id del animal a eliminar de la lista animales
     */
    public void eliminarAnimal(ObjectId idEspecie, ObjectId idAnimal) {
        this.datos.eliminarAnimal(idEspecie, idAnimal);
    }
}
