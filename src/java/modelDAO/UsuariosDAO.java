
package modelDAO;

import Config.Conexion;
import interfaz.UsuariosCRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Usuarios;

public class UsuariosDAO implements UsuariosCRUD {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Usuarios us = new Usuarios();
    
    @Override
    public List listar(){
        ArrayList<Usuarios>list = new ArrayList<>();
        String sql = "SELECT Usu_Id,Usu_Usuario,Usu_Contra,Rol_Id FROM tbUsuarios";
        try
        {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
                Usuarios us = new Usuarios();
                us.setUsu_Id(rs.getInt("Usu_Id"));
                us.setUsu_Usuario(rs.getString("Usu_Usuario"));
                us.setUsu_Contra(rs.getString("Usu_Contra"));
                us.setRol_Id(rs.getInt("Rol_Id"));
                list.add(us);
            }
        }
        catch(Exception e)
        {
        }
        
        return list;
    }
 

    @Override
    public Usuarios list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Usuarios us) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(Usuarios us) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
