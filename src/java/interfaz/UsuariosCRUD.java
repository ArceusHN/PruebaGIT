
package interfaz;

import java.util.List;
import model.Usuarios;

public interface UsuariosCRUD {
    public List listar();
    public Usuarios list (int id);
    public boolean add (Usuarios us);
    public boolean edit (Usuarios us);
}
