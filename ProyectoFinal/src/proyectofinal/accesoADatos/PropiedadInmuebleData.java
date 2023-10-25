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
                
        String sql="INSERT INTO `propiedadinmueble`(`ID_Local`,`Accesibilidad`, `Caracteristicas`, `Direccion`, `Duenio`, `EstadoLocal`, `Forma`, `Ocupante`, `PrecioTazado`, `SuperficieMin`, `TipoLocal`, `Zona`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, propInmueble.getID_Local());
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
                propInmueble.setID_Local(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Propiedad Imnueble agregada exitosamente!");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Propiedad Inmueble");
        }
        
        
    }
    
    public void EliminarPropiedadInmueble(int idLocal){
       String sql="UPDATE `propiedadinmueble` SET Estado=0 WHERE ID_Local=? AND Estado= 1";  
       
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
        String sql="UPDATE `propiedadinmueble` SET `Accesibilidad`=?, `Caracteristicas`=?, `Direccion`=?, `Duenio`=?, `EstadoLocal`=?, `Forma`=?, `Ocupante`=?, `PrecioTazado`=?, `SuperficieMin`=?, `TipoLocal`=?, `Zona`=? WHERE ID_Local=?";
       
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
        String sql="SELECT `Accesibilidad`, `Caracteristicas`, `Direccion`, `Dueño`, `EstadoLocal`, `Forma`, `Ocupante`, `PrecioTazado`, `SuperficieMin`, `TipoLocal`, `Zona` FROM `propiedadinmueble` WHERE ID_Local =?";
        
        PropiedadInmueble propiedadInmueble =null;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet res = ps.executeQuery();
            
            if (res.next()){
                propiedadInmueble =new PropiedadInmueble();
                propiedadInmueble.setID_Local(codigo);
                int idPropietario = res.getInt("Dueño");
                int idInquilino = res.getInt("Ocupante");
                
                //obtener duenio y ocupante
                PropietarioData pD= new PropietarioData();
                InquilinoData inD= new InquilinoData();
                
                Propietario prop=pD.BuscarPropietario(idPropietario);
                Inquilino inq= inD.BuscarInquilinoId(idInquilino);
               // System.out.println(idInquilino);
                        //new Inquilino(inD.BuscarInquilino(idInquilino).getId_Inquilino(),inD.BuscarInquilino(idInquilino).getApellido(),inD.BuscarInquilino(idInquilino).getNombre(),inD.BuscarInquilino(idInquilino).getDNI(),inD.BuscarInquilino(idInquilino).getCUIL(),inD.BuscarInquilino(idInquilino).getDetalle(),inD.BuscarInquilino(idInquilino).getTipo());
                        
//                System.out.println(idInquilino);
//                System.out.println(inq);
                
                propiedadInmueble.setAccesibilidad(res.getString("Accesibilidad"));
                propiedadInmueble.setCaracteristicas(res.getString("Caracteristicas"));
                propiedadInmueble.setDireccion(res.getString("Direccion"));
                propiedadInmueble.setDuenio(prop);
                propiedadInmueble.setEstadoLocal(res.getBoolean("EstadoLocal"));
                propiedadInmueble.setForma(res.getString("Forma"));
                propiedadInmueble.setOcupante(inq);
                propiedadInmueble.setPrecioTazado(res.getFloat("PrecioTazado"));
                propiedadInmueble.setSuperficieMinima(res.getInt("SuperficieMin"));
                propiedadInmueble.setTipoLocal(res.getString("TipoLocal"));
                propiedadInmueble.setZona(res.getString("Zona"));
          
                
            }else{
                JOptionPane.showMessageDialog(null, "No exite Propiedad");
            }
            
            ps.close();
                        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Propiedad Inmueble");
            
        }
        
        return propiedadInmueble;
        
    }
    
    public float FijarPrecio(int idProp, Float nPrecio){
        String sql="UPDATE `propiedadinmueble` SET nPrecio=? WHERE idProp = ?";
        
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
    
    public float alquilarInmueble(int idProp, int idInq){
        
        String sql="UPDATE `propiedadinmueble` SET idInq=? WHERE idProp = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idInq);
            ps.setInt(2, idProp);
            
            int res=ps.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null, "Propiedad alquilada con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Propiedad Inmueble");
        }
        
        
        return idInq;
    }

    public PropiedadInmueble buscarPropInmuebleLibre(int codigo){
        String sql="SELECT `Accesibilidad`, `Caracteristicas`, `Direccion`, `Duenio`, `EstadoLocal`, `Forma`, `PrecioTazado`, `SuperficieMin`, `TipoLocal`, `Zona` FROM `propiedadinmueble` WHERE ID_Local =? AND Ocupante IS NULL";
        
        PropiedadInmueble propiedadInmueble =null;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet res = ps.executeQuery();
            if (res.next()){
                propiedadInmueble =new PropiedadInmueble();
                propiedadInmueble.setID_Local(codigo);
                int idPropietario = res.getInt("Duenio");
                //obtener duenio y ocupante
                PropietarioData pD= new PropietarioData();
                
                Propietario prop=pD.BuscarPropietario(idPropietario);
                
                propiedadInmueble.setAccesibilidad(res.getString("accesobilidad"));
                propiedadInmueble.setCaracteristicas(res.getString("caracteristicas"));
                propiedadInmueble.setDireccion(res.getString("direccion"));
                propiedadInmueble.setDuenio(prop);
                propiedadInmueble.setEstadoLocal(res.getBoolean("estadoLocal"));
                propiedadInmueble.setForma(res.getString("forma"));
                propiedadInmueble.setPrecioTazado(res.getFloat("precioTazado"));
                propiedadInmueble.setSuperficieMinima(res.getInt("superficieMinima"));
                propiedadInmueble.setTipoLocal(res.getString("tipoLocal"));
                propiedadInmueble.setZona(res.getString("zona"));
          
            }else{
                JOptionPane.showMessageDialog(null, "No exite Propiedad");
            }
            
            ps.close();
                        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Propiedad Inmueble");
        }
        
        return propiedadInmueble;
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
                    //prop.setOcupante(rs.getInt("Ocupante"));
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
