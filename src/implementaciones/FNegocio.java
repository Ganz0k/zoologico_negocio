/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import controles.CtrlAdministradores;
import controles.CtrlAnimales;
import controles.CtrlCuidadores;
import controles.CtrlEspecies;
import controles.CtrlGuias;
import controles.CtrlHabitats;
import controles.CtrlItinerario;
import controles.CtrlQuejas;
import controles.CtrlZonas;
import entidades.Administrador;
import entidades.Animal;
import entidades.Cuidador;
import entidades.Especie;
import entidades.Guia;
import entidades.Habitat;
import entidades.Itinerario;
import entidades.Queja;
import entidades.Zona;
import interfaces.INegocio;
import java.util.List;
import org.bson.types.ObjectId;

/**
 * Clase que implementa la interfaz INegocio para mandar a llamar los métodos de
 * los controles
 *
 * @author luisg
 */
public class FNegocio implements INegocio {

    private final CtrlHabitats ctrlHabitats;
    private final CtrlCuidadores ctrlCuidadores;
    private final CtrlEspecies ctrlEspecies;
    private final CtrlAnimales ctrlAnimales;
    private final CtrlGuias ctrlGuias;
    private final CtrlZonas ctrlZonas;
    private final CtrlItinerario ctrlItinerarios;
    private final CtrlAdministradores ctrlAdministradores;
    private final CtrlQuejas ctrlQuejas;

    /**
     * Constructor que inicializa todos los controles
     */
    public FNegocio() {
        this.ctrlHabitats = new CtrlHabitats();
        this.ctrlCuidadores = new CtrlCuidadores();
        this.ctrlEspecies = new CtrlEspecies();
        this.ctrlAnimales = new CtrlAnimales();
        this.ctrlGuias = new CtrlGuias();
        this.ctrlZonas = new CtrlZonas();
        this.ctrlItinerarios = new CtrlItinerario();
        this.ctrlAdministradores = new CtrlAdministradores();
        this.ctrlQuejas = new CtrlQuejas();
    }

    /**
     * Manda a llamar el método guardarHabitat del CtrlHabitats para guardar un
     * hábitat en la base de datos
     *
     * @param habitat habitat a guardar en la colección "habitats"
     * @return true en caso de que se logre guardar, false en caso contrario
     */
    @Override
    public boolean guardarHabitat(Habitat habitat) {
        return this.ctrlHabitats.guardarHabitat(habitat);
    }

    /**
     * Manda a llamar el método verificarNombreHabitat del CtrlHabitats
     *
     * @param nombre nombre a comparar con los nombres de los hábitats en la
     * base de datos
     * @return un hábitat en el caso de que encuentre uno, null en el caso
     * contrario
     */
    @Override
    public Habitat verificarNombreHabitat(String nombre) {
        return this.ctrlHabitats.verificarNombreHabitat(nombre);
    }

    /**
     * Manda a llamar el método consultarHabitats del CtrlHabitats
     *
     * @return lista con todos los hábitats en la base de datos, null en caso de
     * que no se encuentre nada
     */
    @Override
    public List<Habitat> consultarHabitats() {
        return this.ctrlHabitats.conultarHabitats();
    }

    /**
     * Manda a llamar el método consultarCuidadores del CtrlCuidadores
     *
     * @return lista con todos los cuidadores en la base de datos, null en caso
     * de que no se encuentre nada
     */
    @Override
    public List<Cuidador> consultarCuidadores() {
        return this.ctrlCuidadores.consultarCuidadores();
    }

    /**
     * Manda a llamar el método consultarEspecie del CtrlEspecies
     *
     * @param nombre nombre a comparar con los nombres en español de las
     * especies en la base de datos
     * @return una especie en el caso de que encuentre una, null en el caso
     * contrario
     */
    @Override
    public Especie consultarEspecie(String nombre) {
        return this.ctrlEspecies.consultarEspecie(nombre);
    }

    /**
     * Manda a llamar el método consultarEspecie del CtrlEspecies
     *
     * @param especie especie la cual proveerá el nombre científico para
     * comparar con las especies en la base de datos
     * @return una especie en el caso de que encuentre una, null en el caso
     * contrario
     */
    @Override
    public Especie consultarEspecie(Especie especie) {
        return this.ctrlEspecies.consultarEspecie(especie);
    }

    /**
     * Manda a llamar el método guardarEspecie del CtrlEspecies
     *
     * @param especie especie a guardar en la colección "especies"
     * @return true en caso de que se logre guardar, false en caso contrario
     */
    @Override
    public boolean guardarEspecie(Especie especie) {
        return this.ctrlEspecies.guardarEspecie(especie);
    }

    /**
     * Manda a llamar el método agregarEspecieCuidador del CtrlCuidadores
     *
     * @param idCuidador id del cuidador a actualizar
     * @param especie especie a añadir en la lista de especiesExperto
     */
    @Override
    public void agregarEspecieCuidador(ObjectId idCuidador, Especie especie) {
        this.ctrlCuidadores.agregarEspecieCuidador(idCuidador, especie);
    }

    /**
     * Manda a llamar el método agregarEspecieHabitat del CtrlHabitat
     *
     * @param idHabitat id del hábitat a actualizar
     * @param idEspecie id de la especie a añadir en la lista de idsEspecie
     */
    @Override
    public void agregarEspecieHabitat(ObjectId idHabitat, ObjectId idEspecie) {
        this.ctrlHabitats.agregarEspecieHabitat(idHabitat, idEspecie);
    }

    /**
     * Manda a llamar el método consultarAnimalesEspecie del CtrlAnimales
     *
     * @param idEspecie id de especie a consultar
     * @return lista con todos los animales de la especie, null en caso de no
     * encontrar nada
     */
    @Override
    public List<Animal> consultarAnimalesEspecie(ObjectId idEspecie) {
        return this.ctrlAnimales.consultarAnimalesEspecie(idEspecie);
    }

    /**
     * Manda a llamar el método guardarAnimal del CtrlAnimales
     *
     * @param idEspecie id de la especie a actualizar
     * @param animal animal a añadir en la lista animales
     */
    @Override
    public void guardarAnimal(ObjectId idEspecie, Animal animal) {
        this.ctrlAnimales.guardarAnimal(idEspecie, animal);
    }

    /**
     * Manda a llamar el método eliminarAnimal del CtrlAnimales
     *
     * @param idEspecie id de la especie a actualizar
     * @param idAnimal id del animal a eliminar de la lista animales
     */
    @Override
    public void eliminarAnimal(ObjectId idEspecie, ObjectId idAnimal) {
        this.ctrlAnimales.eliminarAnimal(idEspecie, idAnimal);
    }

    /**
     * Manda a llamar el método consultarGuias del CtrlGuias.
     *
     * @return Lista con los guias almacenados en la base de datos.
     */
    @Override
    public List<Guia> consultarGuias() {
        return this.ctrlGuias.consultarGuias();
    }

    /**
     * Manda a llamar el método agregarItinerario del CtrlGuias.
     *
     * @param idGuia Id del guia al que se le agregará el itinerario.
     * @param itinerario Itinerario que se agregará al guia.
     */
    @Override
    public void agregarItinerario(ObjectId idGuia, Itinerario itinerario) {
        this.ctrlGuias.agregarItinerario(idGuia, itinerario);
    }

    /**
     * Manda a llamar el método guardarGuia del CtrlGuias.
     *
     * @param guia Guia a guardar
     * @return true en caso de agregar el guia, false en caso contrario.
     */
    @Override
    public boolean guardarGuia(Guia guia) {
        return this.ctrlGuias.guardarGuia(guia);
    }

    /**
     * Manda a llamar el método guardarCuidador del CtrlCuidador.
     *
     * @param cuidador Guia a guardar
     * @return true en caso de guardar el cuidador, false en caso contrario.
     */
    @Override
    public boolean guardarCuidador(Cuidador cuidador) {
        return this.ctrlCuidadores.guardarCuidador(cuidador);
    }

    /**
     * Manda a llamar el método guardarZona del CtrlZonas.
     *
     * @param zona Zona a guardar.
     * @return true en caso de guardar la zona, false en caso contrario.
     */
    @Override
    public boolean guardarZona(Zona zona) {
        return this.ctrlZonas.guardarZona(zona);
    }

    /**
     * Manda a llamar el método agregarEspecie del CtrlZonas.
     *
     * @param idZona id de la zona a actualizar.
     * @param idEspecie id de la especie a agregar en la zona.
     */
    @Override
    public void agregarEspecie(ObjectId idZona, ObjectId idEspecie) {
        this.ctrlZonas.agregarEspecie(idZona, idEspecie);
    }

    /**
     * Manda a llamar el método agregarHabitat del CtrlZonas.
     *
     * @param idZona id de la zona a actualizar.
     * @param idHabitat id del habitat a agregar en la zona.
     */
    @Override
    public void agregarHabitat(ObjectId idZona, ObjectId idHabitat) {
        this.ctrlZonas.agregarHabitat(idZona, idHabitat);
    }

    /**
     * Manda a llamar el método guardarItinerario del CtrlItinerarios.
     *
     * @param itinerario itinerario a guardar.
     * @return true si se logro guardar, false en caso contrario.
     */
    @Override
    public boolean guardarItinerario(Itinerario itinerario) {
        return this.ctrlItinerarios.guardarItinerario(itinerario);
    }

    /**
     * Manda a llamar el método verificarNombreItinerario del CtrlItinerarios.
     *
     * @param nombre nombre del itinerario a verificar.
     * @return itinerario en caso de encontrar coincidencias, null en caso
     * contrario.
     */
    @Override
    public Itinerario verificarNombreItinerario(String nombre) {
        return this.ctrlItinerarios.verificarNombreItinerario(nombre);
    }

    /**
     * Manda a llamar el método getAdministrador del CtrlAdministradores
     *
     * @param nombre del administrador
     * @param contrasenia contraseña del administrador
     * @return un administrador que coincida con el nombre y la contraseña de
     * los parámetros, null si no encuentra nada
     */
    @Override
    public Administrador getAdministrador(String nombre, String contrasenia) {
        return this.ctrlAdministradores.getAdministrador(nombre, contrasenia);
    }
    
    /**
     * Manda a llamar el método consultarGuia de ctrlItinerarios.
     *
     * @param itinerario El itinerario del que se buscará el guía
     * @return El guía, si existe, falso de forma contraria
     */
    @Override
    public Guia consultarGuia(Itinerario itinerario) {
        return this.ctrlItinerarios.consultarGuia(itinerario);
    }

    /**
     * Manda a llamar el método guardarQueja de CtrlQuejas.
     *
     * @param queja La queja que se va a guardar
     * @return Verdadero si se pudo guardar, falso de forma contraria
     */
    @Override
    public boolean guardarQueja(Queja queja) {
        return this.ctrlQuejas.guardarQueja(queja);
    }
    /**
     * Manda a llamar el método consultarZonas del CtrlZonas
     * @return Lista con las zonas registradas.
     */
    @Override
    public List<Zona> consultarZonas(){
        return this.ctrlZonas.consultarZonas();
    }
}
