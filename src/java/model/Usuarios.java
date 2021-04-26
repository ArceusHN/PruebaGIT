
package model;


public class Usuarios {
    //Declarar variables
    int Usu_Id;
    String Usu_Usuario;
    String Usu_Contra;
    int Rol_Id;
    
    
    //Constructor vacio
    public Usuarios(){
        
    }
    //Get y Set
    public Usuarios(int Usu_Id, String Usu_Usuario, String Usu_Contra, int Rol_Id){
           this.Usu_Id = Usu_Id;
           this.Usu_Usuario = Usu_Usuario;
           this.Usu_Contra = Usu_Contra;
           this.Rol_Id = Rol_Id;
    }
    //-------------------------
    public int getUsu_Id(){
        return Usu_Id;
    }
    public void setUsu_Id(int Usu_Id){
        this.Usu_Id = Usu_Id;
    }
    //-------------------------
    public String getUsu_Usuario(){
        return Usu_Usuario;
    }
    public void setUsu_Usuario(String Usu_Usuario){
        this.Usu_Usuario = Usu_Usuario;
    }
    //-------------------------
    public String getUsu_Contra(){
        return Usu_Contra;
    }
    public void setUsu_Contra(String Usu_Contra){
        this.Usu_Contra = Usu_Contra;
    }
    //-------------------------
    public int getRol_Id(){
        return Rol_Id;
    }
    public void setRol_Id(int Rol_Id){
        this.Rol_Id = Rol_Id;
    }
}
