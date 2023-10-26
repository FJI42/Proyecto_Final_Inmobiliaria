/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.accesoADatos;

import proyectofinal.accesoADatos.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyectofinal.Entidades.Inquilino;
import proyectofinal.accesoADatos.GaranteData;
/**
 *
 * @author User
 */
public class InquilinoData {
      private Connection con= null;
    
    public InquilinoData(){
         con= Conexion.getConexion();
    }

  public void AgregarInquilino(Inquilino inquilino)  {
    String consulta = "SELECT * FROM inquilino WHERE `DNI` = ? ";

    try {
        try{
        PreparedStatement statement = con.prepareStatement(consulta);
        statement.setInt(1, inquilino.getDNI());

        try (ResultSet resultSet = statement.executeQuery()) {
            if (resultSet.next()) {
                
             
                JOptionPane.showMessageDialog(null, "El registro ya existe en la base de datos.");
            } else {
                
                String sql = "INSERT INTO `inquilino`(`Apellido`, `Nombre`, `DNI`,`CUIL`, `Detalles`, `Tipo`, `Estado`) VALUES (?,?,?,?,?,?,?)";

                try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                    ps.setString(1, inquilino.getApellido());
                    ps.setString(2, inquilino.getNombre());
                    ps.setInt(3, inquilino.getDNI());
                    ps.setLong(4, inquilino.getCUIL());
                    ps.setString(5, inquilino.getDetalle());
                    ps.setString(6, inquilino.getTipo());
                    ps.setBoolean(7, inquilino.isEstado());
                    ps.executeUpdate();

                    ResultSet rs = ps.getGeneratedKeys();
                    if (rs.next()) {
                        inquilino.setId_Inquilino(rs.getInt(1));
                        JOptionPane.showMessageDialog(null, "Inquilino Guardado");
                    }
                } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "Error al guardar");
                }
            }
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Error en a la tabla Inquilino");
        }
         }catch(NumberFormatException n){
             JOptionPane.showMessageDialog(null, "Se produjo un error");
                     
         }                       
    } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inquilino");
    
    }
  }
       
    public void BajaInquilino(int id){
         String sql="UPDATE inquilino SET estado=0 WHERE ID_Inquilino=? AND estado=1 ";
        try {
            try{
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1,id);
            int exito = ps.executeUpdate(); 
             GaranteData g = new GaranteData();                  
                g.BajaGarante(id);
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Inquilino Eliminado");
            }    else{
                 JOptionPane.showMessageDialog(null, "El Inquilino ya esta dado de baja");
                
            }
             }catch(NumberFormatException n){
             JOptionPane.showMessageDialog(null, "Se produjo un error");
                     
         }                       
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inquilino");
        }
                                   
      }
    
    public Inquilino BuscarInquilino(int dni){
     String sql= "SELECT `ID_Inquilino`, `Apellido`, `Nombre`, `DNI`,`CUIL`, `Detalles`, `Tipo`, `Estado` FROM `inquilino` WHERE DNI=?";
            Inquilino inquilino=null; 
     try {
         try{ 
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1,dni);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                inquilino=new Inquilino();
                inquilino.setId_Inquilino(rs.getInt("ID_Inquilino"));
                inquilino.setApellido(rs.getString("apellido"));
                inquilino.setNombre(rs.getString("nombre"));
                inquilino.setDNI(dni); 
                inquilino.setCUIL(rs.getLong("CUIL"));
                inquilino.setDetalle(rs.getString("Detalles"));
                inquilino.setTipo(rs.getString("Tipo"));
                inquilino.setEstado(rs.getBoolean("Estado")); 
                                   
                        
            }             
             ps.close();
         }catch(NumberFormatException n){
             JOptionPane.showMessageDialog(null, "Se produjo un error");
                     
         }                       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inquilino");
        }
        
        return inquilino;             
} 
    
    public Inquilino BuscarInquilinoId(int id){
     String sql= "SELECT `ID_Inquilino`, `Apellido`, `Nombre`, `DNI`,`CUIL`, `Detalles`, `Tipo` FROM `inquilino` WHERE ID_Inquilino=?";
            Inquilino inquilino=null; 
     try {
         try{ 
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                inquilino=new Inquilino();
                inquilino.setId_Inquilino(id);
                inquilino.setApellido(rs.getString("Apellido"));
                inquilino.setNombre(rs.getString("Nombre"));
                inquilino.setDNI(rs.getInt("DNI")); 
                inquilino.setCUIL(rs.getLong("CUIL"));
                inquilino.setDetalle(rs.getString("Detalles"));
                inquilino.setTipo(rs.getString("Tipo"));
                //inquilino.setEstado(rs.getBoolean("Estado")); 
               
            }             
             ps.close();
         }catch(NumberFormatException n){
             JOptionPane.showMessageDialog(null, "Se produjo un error");
                     
         }                       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inquilino");
        }
        
        return inquilino;             
} 
 
    public List<Inquilino> obtenerInquilinosdeBaja(){
        ArrayList<Inquilino> inquilino= new ArrayList<>();   
        String sql="SELECT * FROM inquilino WHERE estado=0";
         try {
                PreparedStatement ps= con.prepareStatement(sql);
                
                ResultSet rs= ps.executeQuery();
                while(rs.next()){
                    Inquilino in =new Inquilino(); 
                    in.setId_Inquilino(rs.getInt("ID_Inquilino"));
                in.setApellido(rs.getString("apellido"));
                in.setNombre(rs.getString("nombre"));
                 in.setDNI(rs.getInt("dni"));
                 in.setCUIL(rs.getLong("CUIL"));
                in.setDetalle(rs.getString("Detalles"));
                in.setTipo(rs.getString("Tipo"));
                    inquilino.add(in);
                    
                }
                
                ps.close(); 
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inquilino");
            }
        
        return inquilino; 
       }
     public List<Inquilino> obtenerLosInquilinos(){
        ArrayList<Inquilino> inquilino= new ArrayList<>();   
        String sql="SELECT * FROM inquilino WHERE estado=1";
         try {
                PreparedStatement ps= con.prepareStatement(sql);
//                ps.setInt(1,id); 
                ResultSet rs= ps.executeQuery();
                while(rs.next()){
                    Inquilino in =new Inquilino(); 
                in.setId_Inquilino(rs.getInt("ID_Inquilino"));
                in.setApellido(rs.getString("apellido"));
                in.setNombre(rs.getString("nombre"));
                in.setDNI(rs.getInt("dni"));
                in.setCUIL(rs.getLong("CUIL"));
                in.setDetalle(rs.getString("Detalles"));
                in.setTipo(rs.getString("Tipo"));
                in.setEstado(rs.getBoolean("Estado"));
                    inquilino.add(in);
                    
                }
                
                ps.close(); 
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inquilino");
            }
        
        return inquilino; 
       }
     
       public void modificarInquilino(Inquilino inquilino){
            
            String sql="UPDATE inquilino SET Apellido=?,Nombre=?,DNI=?,CUIL=?,Detalles=?,Tipo=? WHERE ID_Inquilino=?";
            
        try {
            try{
            PreparedStatement ps= con.prepareStatement(sql);
            
            ps.setString(1,inquilino.getApellido());
            ps.setString(2,inquilino.getNombre());
            ps.setInt(3,inquilino.getDNI());
            ps.setLong(4,inquilino.getCUIL());
            ps.setString(5, inquilino.getDetalle());
            ps.setString(6, inquilino.getTipo());
            ps.setInt(7, inquilino.getId_Inquilino());
           
            int exito= ps.executeUpdate();
            
            if(exito==1){
      
                JOptionPane.showMessageDialog(null, "Inquilino modificado");
            }else{
                 JOptionPane.showMessageDialog(null, "No se encontro el inquilino que busca");
            }
            }catch(NumberFormatException n){
             JOptionPane.showMessageDialog(null, "Se produjo un error");
                     
         }          
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Inquilino");
        }
            
      }      
}


