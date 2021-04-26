/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import Config.Conexion;
import interfaz.EstadoCivilCrud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.EstadosCiviles;

/**
 *
 * @author Omar Fer
 */
public class EstadosCivilesDAO implements EstadoCivilCrud {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    EstadosCiviles ec = new EstadosCiviles();
    
    @Override
    public List listar() {
        ArrayList<EstadosCiviles> list = new ArrayList<>();
        String sql = "SELECT EsCiv_Id, EsCiv_Descripcion FROM tbEstadosCiviles";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                    EstadosCiviles ec = new EstadosCiviles();
                    ec.setEsCiv_Id(rs.getInt("EsCiv_Id"));
                    ec.setEsCiv_Descripcion(rs.getString("EsCiv_Descripcion"));
                    list.add(ec);
            }
            
        }
        catch(Exception e){
        }
        
         return list;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EstadosCiviles list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(EstadosCiviles ec) {
        String sql=" INSERT INTO tbEstadosCiviles VALUES('" + ec.getEsCiv_Descripcion() + "')";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            
        }
        
        return true;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean edit(EstadosCiviles ec) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
