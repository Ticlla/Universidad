/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.Interfaz;

/**
 *
 * @author Alcides
 */
public interface accesible {
    public void agregar();
    public void actualizar();
    public void eliminar();
    public void buscar(buscable criterio);
}
