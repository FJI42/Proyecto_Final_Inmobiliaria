/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acceso_a_Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectofinal.PropiedadInmueble;

/**
 *
 * @author MCali
 */
public class PropiedadInmuebleData {
    
    private Connection con=null;
    
    public PropiedadInmuebleData(){
        con=Conexion.getConexion();
    }
    /*AlquilarLocal(String,int)
    CompletarLocal()
    EnviarRequisitos(Int,String,String)
    FijarPrecios(float)*/
    
    public void AgregarPropiedadInmueble(PropiedadInmueble propInmueble){
        String sql="INSERT INTO propiedad inmueble(Accesibilidad, Caracteristicas, Direccion, Dueño, EstadoLocal, Forma, Ocupante, PrecioTazado, SuperficieMin, TipoLocal, Zona) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, propInmueble.getAccesibilidad());
            ps.setString(2, propInmueble.getCaracteristicas());
            ps.setString(3, propInmueble.getDireccion());
            ps.setInt(4, propInmueble.getDuenio());
            ps.setBoolean(5, propInmueble.isEstadoLocal());
            ps.setString(6, propInmueble.getForma());
            ps.setInt(7, propInmueble.getOcupante());
            ps.setFloat(8, propInmueble.getPrecioTazado());
            ps.setInt(9, propInmueble.getSuperficieMinima());
            ps.setString(10, propInmueble.getTipoLocal());
            ps.setString(11, propInmueble.getZona());
            
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(PropiedadInmuebleData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
