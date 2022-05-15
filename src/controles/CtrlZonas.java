/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controles;

import entidades.Zona;
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
public class CtrlZonas {
    
    private final IDatos datos;

    /**
     * Constructor que inicializa el atributo datos gracias a la FabricaDatos
     */
    public CtrlZonas() {
         this.datos = FabricaDatos.crearFDatos();
    }
    
    /**
     * Utiliza el método guardarGuia de la interfaz IDatos para agregar el guia
     * dado por el parámetro a la base de datos.
     * 
     * @param zona Zona a guargar en la base de datos.
     * @return true en caso de poder agregar la zona, false en caso contrario.
     */
    public boolean guardarZona(Zona zona){
        return this.datos.guardarZona(zona);
    }
    
    /**
     * Utiliza el método agregarEspecie de la interfaz IDatos para agregar el 
     * idEspecie a la zona con el id dado por el parámetro a la base de datos.
     * 
     * @param idZona id de la zona a actualizar.
     * @param idEspecie id de la especie a agregar.
     */
    public void agregarEspecie(ObjectId idZona, ObjectId idEspecie){
        this.datos.agregarEspecie(idZona, idEspecie);
    }
    
    /**
     * Utiliza el metodo agregarHabitat de la interfaz IDatos para agregar el
     * idHabitat a la zona con el id dado por el parámetro a la base de datos.
     * 
     * @param idZona id de la zona a actualizar.
     * @param idHabitat  id de al especie a agregar.
     */
    public void agregarHabitat(ObjectId idZona, ObjectId idHabitat){
        this.datos.agregarHabitat(idZona, idHabitat);
    }
    
    /**
     * Utiliza el metodo consultarZonas de la interfaz IDatos para recuperar
     * las zonas registradas en la base de datos.
     * 
     * @return Lista de zonas registradas, null si no encuentra registros. 
     */
    public List<Zona> consultarZonas(){
        return this.datos.consultarZonas();
    }
}
