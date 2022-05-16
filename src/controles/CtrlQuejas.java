/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controles;

import entidades.Queja;
import factory.FabricaDatos;
import interfaces.IDatos;

/**
 * Clase de control que utiliza un objeto del tipo IDatos para acceder a los
 * métodos del subsistema datos
 *
 * @author julio
 */
public class CtrlQuejas {

    private final IDatos datos;

    /**
     * Constructor que inicializa el atributo datos gracias a la FabricaDatos
     */
    public CtrlQuejas() {
        this.datos = FabricaDatos.crearFDatos();
    }

    /**
     * Utiliza el método guardarQueja de la interfaz IDatos para agregar la
     * queja dado por el parámetro a la base de datos.
     *
     * @param queja Queja a agregar en la base de datos.
     * @return true en caso de poder agregar la queja, false en caso contrario.
     */
    public boolean guardarQueja(Queja queja) {
        return this.datos.guardarQueja(queja);
    }
}
