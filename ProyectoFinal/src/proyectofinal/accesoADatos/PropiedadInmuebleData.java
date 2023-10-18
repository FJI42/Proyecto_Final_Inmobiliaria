/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import proyectofinal.Entidades.Inquilino;
import proyectofinal.Entidades.PropiedadInmueble;
import proyectofinal.Entidades.Propietario;

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
                
        String sql="INSERT INTO `propiedad inmueble`(`ID_Local`,`Accesibilidad`, `Caracteristicas`, `Direccion`, `Duenio`, `EstadoLocal`, `Forma`, `Ocupante`, `PrecioTazado`, `SuperficieMin`, `TipoLocal`, `Zona`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, propInmueble.getIdLocal());
            ps.setString(2, propInmueble.getAccesibilidad());
            ps.setString(3, propInmueble.getCaracteristicas());
            ps.setString(4, propInmueble.getDireccion());
            ps.setInt(5, propInmueble.getDuenio().getIdPropietario());
            ps.setBoolean(6, propInmueble.isEstadoLocal());
            ps.setString(7, propInmueble.getForma());
            ps.setInt(8, propInmueble.getOcupante().getId_Inquilino());
            ps.setFloat(9, propInmueble.getPrecioTazado());
            ps.setInt(10, propInmueble.getSuperficieMinima());
            ps.setString(11, propInmueble.getTipoLocal());
            ps.setString(12, propInmueble.getZona());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()){
                propInmueble.setIdLocal(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Propiedad Imnueble agregada exitosamente!");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Propiedad Inmueble");
        }
        
        
    }
    
    public void EliminarPropiedadInmueble(int idLocal){
       String sql="UPDATE `propiedad inmueble` SET Estado=0 WHERE ID_Local=? AND Estado= 1";  
       
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idLocal);
            int filas=ps.executeUpdate();
            if(filas==1){
                JOptionPane.showMessageDialog(null, "Propiedad inmueble eliminada");
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro Propiedad Inmueble");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Propiedad Inmueble");
        }
    }
    
    public void ModificarPropiedadInmueble(PropiedadInmueble propInmueble){
        String sql="UPDATE `propiedad inmueble` SET `Accesibilidad`=?, `Caracteristicas`=?, `Direccion`=?, `Duenio`=?, `EstadoLocal`=?, `Forma`=?, `Ocupante`=?, `PrecioTazado`=?, `SuperficieMin`=?, `TipoLocal`=?, `Zona`=? WHERE ID_Local=?";
       
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(2, propInmueble.getAccesibilidad());
            ps.setString(3, propInmueble.getCaracteristicas());
            ps.setString(4, propInmueble.getDireccion());
            ps.setInt(5, propInmueble.getDuenio().getIdPropietario());
            ps.setBoolean(6, propInmueble.isEstadoLocal());
            ps.setString(7, propInmueble.getForma());
            ps.setInt(8, propInmueble.getOcupante().getId_Inquilino());
            ps.setFloat(9, propInmueble.getPrecioTazado());
            ps.setInt(10, propInmueble.getSuperficieMinima());
            ps.setString(11, propInmueble.getTipoLocal());
            ps.setString(12, propInmueble.getZona());
            
            int res=ps.executeUpdate();
            
            if (res>0){
                JOptionPane.showMessageDialog(null, "Propiedad Imnueble modificada exitosamente!");
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo modificar Propiedad Imnueble");
            }
            ps.close();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Propiedad Inmueble");
        }
    }
    public PropiedadInmueble buscarPropInmueble(int codigo){
        PropiedadInmueble prop = null;
        return prop;    
    }
    
    public void CompletarLocal(){
        
    }
    
    public void EnviarRequisitos(){
        
    }
    
    public float FijarPrecio(int idProp, Float nPrecio){
        String sql="UPDATE `propiedad inmueble` SET nPrecio=? WHERE idProp = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setFloat(1, nPrecio);
            ps.setInt(2, idProp);
            
            int res=ps.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null, "precio actualizado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Propiedad Inmueble");
        }
        
        
        return nPrecio;
    }
    
    public List<PropiedadInmueble> obtenerLasPropiedades(){
        ArrayList<PropiedadInmueble> propiedad= new ArrayList<>();        
        String sql="SELECT * FROM propiedadinmueble";
         
        try {   
                PreparedStatement ps= con.prepareStatement(sql);
                ResultSet rs= ps.executeQuery();

                while(rs.next()){
                     int idPropietario= rs.getInt("Dueño");
                     int idInquilino = rs.getInt("Ocupante");
                
                    PropiedadInmueble prop =new PropiedadInmueble(); 
                    InquilinoData inD = new InquilinoData();
                    Inquilino inquilino = inD.BuscarInquilino(idInquilino);
                    
                    PropietarioData poD = new PropietarioData(); 
                    Propietario propi = poD.BuscarPropietario(idPropietario);
                    
                    
                    prop.setID_Local(rs.getInt("ID_Local"));
                    prop.setAccesibilidad(rs.getString("Accesibilidad"));
                    prop.setCaracteristicas(rs.getString("Caracteristicas"));
                    prop.setDireccion(rs.getString("Direccion"));
                    prop.setDuenio(propi);
                    prop.setEstadoLocal(true);
                    prop.setForma(rs.getString("Forma"));
         
                    prop.setOcupante(inquilino);           
                    prop.setPrecioTazado(rs.getInt("PrecioTazado"));
                    prop.setSuperficieMinima(rs.getInt("SuperficieMin"));
                    prop.setTipoLocal(rs.getString("TipoLocal"));
                    prop.setZona(rs.getString("Zona"));
                
                    propiedad.add(prop);
                    
                }
                
                ps.close(); 
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Propiedad Inmueble");
                
            }
        
        return propiedad; 
       } 
    
}
