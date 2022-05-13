/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import implementaciones.FNegocio;
import interfaces.INegocio;

/**
 * Fábrica que crea un objeto de tipo INegocio para acceder a todos los métodos
 * de los controles del subsistema de negocio
 *
 * @author luisg
 */
public class FabricaNegocios {

    /**
     * Método estático que crea un objeto INegocio, específicamente de la clase
     * FNegocio la cual implementa la interfaz INegocio
     *
     * @return
     */
    public static INegocio crearFNegocio() {
        return new FNegocio();
    }
}
