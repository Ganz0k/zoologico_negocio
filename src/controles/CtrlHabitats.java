/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controles;

import entidades.Habitat;
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
public class CtrlHabitats {

    private final IDatos datos;

    /**
     * Constructor que inicializa el atributo datos gracias a la FabricaDatos
     */
    public CtrlHabitats() {
        this.datos = FabricaDatos.crearFDatos();
    }

    /**
     * Utiliza el método guardarHabitat de la interfaz IDatos para guardar el
     * hábitat del parámetro
     *
     * @param habitat habitat a guardar en la colección "habitats"
     * @return true en caso de que se logre guardar, false en caso contrario
     */
    public boolean guardarHabitat(Habitat habitat) {
        return this.datos.guardarHabitat(habitat);
    }

    /**
     * Utiliza el método verificarNombreHabitat de la interfaz IDatos para
     * obtener el hábitat de la base de datos que coincida con el nombre dado en
     * el parámetro
     *
     * @param nombre nombre a comparar con los nombres de los hábitats en la
     * base de datos
     * @return un hábitat en el caso de que encuentre uno, null en el caso
     * contrario
     */
    public Habitat verificarNombreHabitat(String nombre) {
        return this.datos.verificarNombreHabitat(nombre);
    }

    /**
     * Utiliza el método consultarHabitats de la interfaz IDatos para obtener
     * una lista con todos los hábitats que hay en la base de datos, regresa
     * null en caso de no encontrar nada
     *
     * @return lista con todos los hábitats en la base de datos, null en caso de
     * que no se encuentre nada
     */
    public List<Habitat> conultarHabitats() {
        return this.datos.consultarHabitats();
    }

    /**
     * Utiliza el método agregarEspecieHabitat de la interfaz IDatos para
     * agregar un id de especie al campo idsEspecie del hábitat que coincida con
     * el id del parámetro
     *
     * @param idHabitat id del hábitat a actualizar
     * @param idEspecie id de la especie a añadir en la lista de idsEspecie
     */
    public void agregarEspecieHabitat(ObjectId idHabitat, ObjectId idEspecie) {
        this.datos.agregarEspecieHabitat(idHabitat, idEspecie);
    }
}
