/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controles;

import entidades.Administrador;
import factory.FabricaDatos;
import interfaces.IDatos;

/**
 * Clase de control que utiliza un objeto del tipo IDatos para acceder a los
 * métodos del subsistema datos
 *
 * @author luisg
 */
public class CtrlAdministradores {

    private final IDatos datos;

    /**
     * Constructor que inicializa el atributo datos gracias a la FabricaDatos
     */
    public CtrlAdministradores() {
        this.datos = FabricaDatos.crearFDatos();
    }

    /**
     * Utiliza el método getAdministrador de la interfaz IDatos para obtener el
     * administrador que coincida con el nombre y la contraseña que proveen los
     * parámetros
     *
     * @param nombre del administrador
     * @param contrasenia contraseña del administrador
     * @return un administrador que coincida con el nombre y la contraseña de
     * los parámetros, null si no encuentra nada
     */
    public Administrador getAdministrador(String nombre, String contrasenia) {
        return this.datos.getAdministrador(nombre, contrasenia);
    }
}
