/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.Alumno;

import datos.Interfaz.accesible;
import datos.Interfaz.buscable;

/**
 *
 * @author Alcides
 */
public class Alumno implements accesible{

    @Override
    public void agregar() {
        System.out.println("Alumno Agregado");
    }

    @Override
    public void actualizar() {
        System.out.println("Alumno Actualizado");
    }

    @Override
    public void eliminar() {
        System.out.println("Alumno Eliminado");
    }

    @Override
    public void buscar(buscable criterio) {
        System.out.println("Alumno Buscado");
    }
    
}
