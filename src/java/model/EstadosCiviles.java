/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Omar Fer
 */
public class EstadosCiviles {
    
    int EsCiv_Id;
    String EsCiv_Descripcion;
    
    public EstadosCiviles(){}
    
    public EstadosCiviles(int Esciv_Id, String Esciv_Descripcion){
        this.EsCiv_Id = Esciv_Id;
        this.EsCiv_Descripcion = Esciv_Descripcion;
    }

    public int getEsCiv_Id() {
        return EsCiv_Id;
    }

    public void setEsCiv_Id(int EsCiv_Id) {
        this.EsCiv_Id = EsCiv_Id;
    }

    public String getEsCiv_Descripcion() {
        return EsCiv_Descripcion;
    }

    public void setEsCiv_Descripcion(String EsCiv_Descripcion) {
        this.EsCiv_Descripcion = EsCiv_Descripcion;
    }
    
 
}
