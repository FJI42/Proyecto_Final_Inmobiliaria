/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acceso_a_Datos;

import java.sql.Connection;

/**
 *
 * @author User
 */
public class PropietarioData {
    private Connection con= null;
    
    public PropietarioData(){
         con= Conexion.getConexion();
    }
}
