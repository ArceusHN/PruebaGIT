/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.util.List;
import model.EstadosCiviles;

/**
 *
 * @author Omar Fer
 */
public interface EstadoCivilCrud {
    public List listar();
    public EstadosCiviles list (int id);
    public boolean add(EstadosCiviles ec);
    public boolean edit(EstadosCiviles ec);
}
