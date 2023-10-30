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
    
    public void EstadoFalse(int id){
     String sql="UPDATE propiedadinmueble SET EstadoLocal=0 WHERE ID_Local=? ";
        try {
            try{
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1,id);
            int exito = ps.executeUpdate(); 
             GaranteData g = new GaranteData();                  
                g.BajaGarante(id);
            if(exito==1){
                JOptionPane.showMessageDialog(null, "¡Estado de la Propiedad modificado!");
            }    else{
                 JOptionPane.showMessageDialog(null, "Esta Propiedad no se puede volver a contratar");
                
            }
             }catch(NumberFormatException n){
             JOptionPane.showMessageDialog(null, "Se produjo un error");
                     
         }                       
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Propiedad Inmueble ");
        }         
  
  
  } 
    
    public void AgregarPropiedadInmueble(PropiedadInmueble propInmueble){
       
        String sql="INSERT INTO `propiedadinmueble`(`Accesibilidad`, `Caracteristicas`, `Direccion`, `Duenio`, `EstadoLocal`, `Forma`, `PrecioTazado`, `SuperficieMin`, `TipoLocal`, `Zona`) VALUES (?,?,?,?,?,?,?,?,?,?)";
                    
        try(PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            
           // ps.setInt(1, propInmueble.getID_Local());
            ps.setString(1, propInmueble.getAccesibilidad());
            ps.setString(2, propInmueble.getCaracteristicas());
            ps.setString(3, propInmueble.getDireccion());
            ps.setInt(4, propInmueble.getDuenio().getIdPropietario());
            ps.setBoolean(5, propInmueble.isEstadoLocal());
            ps.setString(6, propInmueble.getForma());
            //ps.setInt(8, propInmueble.getOcupante().getId_Inquilino());
            ps.setFloat(7, propInmueble.getPrecioTazado());
            ps.setInt(8, propInmueble.getSuperficieMinima());
            ps.setString(9, propInmueble.getTipoLocal());
            ps.setString(10, propInmueble.getZona());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()){
                propInmueble.setID_Local(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Propiedad Imnueble agregada exitosamente!");
            }
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, ex);
        }
        
        
    }
    
    public void EliminarPropiedadInmueble(int idLocal){
       String sql="UPDATE `propiedadinmueble` SET EstadoLocal=0 WHERE ID_Local=? AND EstadoLocal= 1";  
       
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
        String sql="UPDATE `propiedadinmueble` SET `Accesibilidad`=?, `Caracteristicas`=?, `Direccion`=?, `EstadoLocal`=?, `Forma`=?, `PrecioTazado`=?, `SuperficieMin`=?, `TipoLocal`=?, `Zona`=? WHERE ID_Local=?";
//        String sql="UPDATE `propiedadinmueble` SET `Accesibilidad`=?, `Caracteristicas`=?, `Direccion`=?, `Duenio`=?, `EstadoLocal`=?, `Forma`=?, `Ocupante`=?, `PrecioTazado`=?, `SuperficieMin`=?, `TipoLocal`=?, `Zona`=? WHERE ID_Local=?";
       
        try {
            PreparedStatement ps=con.prepareStatement(sql);
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
            
            int res=ps.executeUpdate();
            
            if (res>0){
                JOptionPane.showMessageDialog(null, "Propiedad Imnueble modificada exitosamente!");
            }else{
                JOptionPane.showMessageDialog(null, res+"No se pudo modificar Propiedad Imnueble");
            }
            ps.close();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Propiedad Inmueble");
        }
    }
     public void ModificarPropiedadInmuebleNull(PropiedadInmueble propInmueble){
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
        String sql="SELECT `Accesibilidad`, `Caracteristicas`, `Direccion`, `Duenio`, `EstadoLocal`, `Forma`, `Ocupante`, `PrecioTazado`, `SuperficieMin`, `TipoLocal`, `Zona` FROM `propiedadinmueble` WHERE ID_Local =?";
        
        PropiedadInmueble propiedadInmueble =null;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet res = ps.executeQuery();
            System.out.println("buscando"+codigo);
            if (res.next()){
                
                System.out.println("en if de bpi");
                propiedadInmueble =new PropiedadInmueble();
                propiedadInmueble.setID_Local(codigo);
                
                int idPropietario = res.getInt("Duenio");
                int idInquilino = res.getInt("Ocupante");
                
                //obtener duenio y ocupante
                PropietarioData pD= new PropietarioData();
                InquilinoData inD= new InquilinoData();
                
                Propietario prop=pD.BuscarPropietarioID(idPropietario);
                Inquilino inq= inD.BuscarInquilinoId(idInquilino);
                
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
               
                System.out.println("prop buscada::"+propiedadInmueble);    
                
            }else{
                JOptionPane.showMessageDialog(null, "No existe Propiedad");
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
            
            System.out.println("1 llegada");
            
            if (res.next()){
            
                System.out.println("entre if");
                
                propiedadInmueble =new PropiedadInmueble();
                
                propiedadInmueble.setID_Local(codigo);
                
                int idPropietario = res.getInt("Duenio");
                //obtener duenio 
                PropietarioData pD= new PropietarioData();
                Propietario prop=pD.BuscarPropietario(idPropietario);
                
                System.out.println(prop);
                
                propiedadInmueble.setAccesibilidad(res.getString("Accesibilidad"));
                propiedadInmueble.setCaracteristicas(res.getString("Caracteristicas"));
                propiedadInmueble.setDireccion(res.getString("Direccion"));
                propiedadInmueble.setDuenio(prop);
                propiedadInmueble.setEstadoLocal(res.getBoolean("EstadoLocal"));
                propiedadInmueble.setForma(res.getString("Forma"));
                propiedadInmueble.setPrecioTazado(res.getFloat("PrecioTazado"));
                propiedadInmueble.setSuperficieMinima(res.getInt("SuperficieMin"));
                propiedadInmueble.setTipoLocal(res.getString("TipoLocal"));
                propiedadInmueble.setZona(res.getString("Zona"));
                
                System.out.println("la prop "+propiedadInmueble);
          
            }else{
                JOptionPane.showMessageDialog(null, "No existe Propiedad");
            }
            
            ps.close();
                        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder busc inm a tabla Propiedad Inmueble");
        }
        
        return propiedadInmueble;
    }
    
        public List<PropiedadInmueble> obtenerLasPropiedades(){
        ArrayList<PropiedadInmueble> propiedad= new ArrayList<>();        
        String sql="SELECT * FROM `propiedadinmueble`WHERE EstadoLocal=TRUE";
         
        try {   
                PreparedStatement ps= con.prepareStatement(sql);
                ResultSet rs= ps.executeQuery();

                while(rs.next()){
                     int idPropietario= rs.getInt("Duenio");
                     int idInquilino = rs.getInt("Ocupante");
                
                    PropiedadInmueble prop =new PropiedadInmueble(); 
                    InquilinoData inD = new InquilinoData();
                    Inquilino inquilino = inD.BuscarInquilinoId(idInquilino);
                    
                    PropietarioData poD = new PropietarioData(); 
                    Propietario propi = poD.BuscarPropietarioID(idPropietario);
                    
                    
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
    
        public List<PropiedadInmueble> obtenerLasPropiedadeslibres(){
        ArrayList<PropiedadInmueble> propiedad= new ArrayList<>();        
        String sql="SELECT * FROM `propiedadinmueble` WHERE Ocupante IS NULL";
         
        try {   
                PreparedStatement ps= con.prepareStatement(sql);
                ResultSet rs= ps.executeQuery();


                while(rs.next()){
                        int idPropietario= rs.getInt("Dueño");
                     int idInquilino = rs.getInt("Ocupante");
                
                    PropiedadInmueble prop =new PropiedadInmueble(); 
                    
                    PropietarioData poD = new PropietarioData(); 
                    Propietario propi = poD.BuscarPropietario(idPropietario);
                   
                    InquilinoData inD = new InquilinoData();
                    Inquilino inquilino = inD.BuscarInquilinoId(idInquilino);
                    
                    
                    prop.setID_Local(rs.getInt("ID_Local"));
                    
                    prop.setAccesibilidad(rs.getString("Accesibilidad"));
                    prop.setCaracteristicas(rs.getString("Caracteristicas"));
                    prop.setDireccion(rs.getString("Direccion"));
                    prop.setDuenio(propi);
                    prop.setEstadoLocal(rs.getBoolean("EstadoLocal"));
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
        
        public List<PropiedadInmueble> obtenerLasPropiedadesActivas(){
        ArrayList<PropiedadInmueble> propiedad= new ArrayList<>();        
        String sql="SELECT * FROM propiedadinmueble WHERE EstadoLocal=1";
         
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
                    prop.setEstadoLocal(rs.getBoolean("EstadoLocal"));
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

        
        public List<PropiedadInmueble> obtenerLasPropiedadesOcupadas(){
        ArrayList<PropiedadInmueble> propiedad= new ArrayList<>();        
        String sql="SELECT * FROM `propiedadinmueble` WHERE Ocupante IS NOT NULL";
         
        try {   
                PreparedStatement ps= con.prepareStatement(sql);
                ResultSet rs= ps.executeQuery();

                while(rs.next()){
                     int idPropietario= rs.getInt("Duenio");
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
                    prop.setEstadoLocal(rs.getBoolean("EstadoLocal"));
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

        public List<PropiedadInmueble> obtenerLasPropiedadesTipoCasa(String casa){
        ArrayList<PropiedadInmueble> propiedad= new ArrayList<>();        
        String sql="SELECT * FROM `propiedadinmueble` WHERE TipoLocal=?";
         
        try {   
                PreparedStatement ps= con.prepareStatement(sql);
                ps.setString(1, casa);
                ResultSet rs= ps.executeQuery();

                while(rs.next()){
                     int idPropietario= rs.getInt("Duenio");
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
                    prop.setEstadoLocal(rs.getBoolean("EstadoLocal"));
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

        
        public List<PropiedadInmueble> obtenerLasPropiedadesTipoTerreno(String terreno){
        ArrayList<PropiedadInmueble> propiedad= new ArrayList<>();        
        String sql="SELECT * FROM `propiedadinmueble` WHERE TipoLocal=´Terreno´";
         
        try {   
                PreparedStatement ps= con.prepareStatement(sql);
                ps.setString(1, terreno);
                ResultSet rs= ps.executeQuery();

                while(rs.next()){
                     int idPropietario= rs.getInt("Duenio");
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
                    prop.setEstadoLocal(rs.getBoolean("EstadoLocal"));
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

                
        public List<PropiedadInmueble> obtenerLasPropiedadesTipoLC(String localC){
        ArrayList<PropiedadInmueble> propiedad= new ArrayList<>();        
        String sql="SELECT * FROM `propiedadinmueble` WHERE TipoLocal=´Local Comerdial´";
         
        try {   
                PreparedStatement ps= con.prepareStatement(sql);
                ps.setString(1, localC);

                ResultSet rs= ps.executeQuery();

                while(rs.next()){
                     int idPropietario= rs.getInt("Duenio");
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
                    prop.setEstadoLocal(rs.getBoolean("EstadoLocal"));
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

                        
        public List<PropiedadInmueble> obtenerLasPropiedadesTipoGalpon(String galpon){
        ArrayList<PropiedadInmueble> propiedad= new ArrayList<>();        
        String sql="SELECT * FROM `propiedadinmueble` WHERE TipoLocal=´Galpon´";
         
        try {   
                PreparedStatement ps= con.prepareStatement(sql);
                ps.setString(1, galpon);

                ResultSet rs= ps.executeQuery();

                while(rs.next()){
                     int idPropietario= rs.getInt("Duenio");
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
                    prop.setEstadoLocal(rs.getBoolean("EstadoLocal"));
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

                                
        public List<PropiedadInmueble> obtenerLasPropiedadesTipoGarage(String garage){
        ArrayList<PropiedadInmueble> propiedad= new ArrayList<>();        
        String sql="SELECT * FROM `propiedadinmueble` WHERE TipoLocal=´Garage´";
         
        try {   
                PreparedStatement ps= con.prepareStatement(sql);
                ps.setString(1, garage);

                ResultSet rs= ps.executeQuery();

                while(rs.next()){
                     int idPropietario= rs.getInt("Duenio");
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
                    prop.setEstadoLocal(rs.getBoolean("EstadoLocal"));
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

