/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyectofinal.Entidades.Garante;
import proyectofinal.Entidades.Inquilino;

/**
 *
 * @author User
 */
public class GaranteData {
     private Connection con= null;
    
    public GaranteData(){
         con= Conexion.getConexion();
    }
     public void AgregarGarante(Garante garante)  {
    String consulta = "SELECT * FROM garantes WHERE `DNI` = ? ";

    try {
        try{
        PreparedStatement statement = con.prepareStatement(consulta);
        statement.setInt(1, garante.getDNI());

        try (ResultSet resultSet = statement.executeQuery()) {
            if (resultSet.next()) {
                
             
                JOptionPane.showMessageDialog(null, "El registro ya existe en la base de datos.");
            } else {
                
                String sql = "INSERT INTO `garantes`(`Apellido`, `Nombre`, `DNI`,`CUIL`, `Detalles`, ID_Inquilino) VALUES (?,?,?,?,?,?)";

                try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                    ps.setString(1, garante.getApellido());
                    ps.setString(2, garante.getNombre());
                    ps.setInt(3, garante.getDNI());
                    ps.setLong(4, garante.getCUIL());
                    ps.setString(5, garante.getDetalle());
                    ps.setInt(6, garante.getId_Inquilino());
                    
                    ps.executeUpdate();

                    ResultSet rs = ps.getGeneratedKeys();
                    if (rs.next()) {
                        garante.setId_Inquilino(rs.getInt(1));
                        JOptionPane.showMessageDialog(null, "Garante Guardado");
                    }
                } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "Error al guardar");
                }
            }
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Error en a la tabla Garante");
        }
         }catch(NumberFormatException n){
             JOptionPane.showMessageDialog(null, "Se produjo un error");
                     
         }                       
    } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Garante");
    
    }
  }
       
    public void BajaGarante(int id){
         String sql="DELETE FROM `garantes` WHERE ID_Inquilino=? ";
        try {
            try{
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1,id);
             
          

            int exito = ps.executeUpdate(); 
//            
//            if(exito==1){
//                JOptionPane.showMessageDialog(null, "Inquilino Eliminado");
//            }    else{
//                 JOptionPane.showMessageDialog(null, "El Inquilino ya esta dado de baja");
//                
//            }
             }catch(NumberFormatException n){
             JOptionPane.showMessageDialog(null, "Se produjo un error");
                     
         }                       
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Garantes");
        }
                                   
      }
    
    public Garante BuscarGarante(int dni){
     String sql= "SELECT `ID_Garante`, `Apellido`, `Nombre`, `DNI`,`CUIL`, `Detalles`, `ID_Inquilino` FROM `garantes` WHERE DNI=?";
           Garante garante=null; 
     try {
         try{
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1,dni);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                 garante=new Garante();
                garante.setID_Garante(rs.getInt("ID_Garante"));
                 garante.setApellido(rs.getString("apellido"));
                garante.setNombre(rs.getString("nombre"));
                garante.setDNI(dni); 
                 garante.setCUIL(rs.getLong("CUIL"));
                 garante.setDetalle(rs.getString("Detalles"));
                 garante.setId_Inquilino(rs.getInt("ID_Inquilino"));
                
                                   
                        
            }             
             ps.close();
         }catch(NumberFormatException n){
             JOptionPane.showMessageDialog(null, "Se produjo un error");
                     
         }                       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Garante");
        }
        
        return garante;             
} 
    
 
     public List<Garante> obtenerGarante(){
        ArrayList<Garante> garante= new ArrayList<>();   
        String sql="SELECT * FROM garantes ";
         try {
                PreparedStatement ps= con.prepareStatement(sql);
//                ps.setInt(1,id); 
                ResultSet rs= ps.executeQuery();
                while(rs.next()){
                    Garante in =new Garante(); 
                in.setID_Garante(rs.getInt("ID_Garante"));
                in.setApellido(rs.getString("apellido"));
                in.setNombre(rs.getString("nombre"));
                in.setDNI(rs.getInt("dni"));
                in.setCUIL(rs.getLong("CUIL"));
                in.setDetalle(rs.getString("Detalles"));
                in.setId_Inquilino(rs.getInt("ID_Inquilino"));
                    garante.add(in);
                    
                }
                
                ps.close(); 
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Garante");
            }
        
        return garante; 
       }
     
      public List<Garante> obtenerGaranteID(int id){
        ArrayList<Garante> garante= new ArrayList<>();   
        String sql="SELECT * FROM garantes WHERE ID_Inquilino=?";
         try {
                PreparedStatement ps= con.prepareStatement(sql);
                ps.setInt(1,id); 
                ResultSet rs= ps.executeQuery();
                while(rs.next()){
                    Garante in =new Garante(); 
                in.setID_Garante(rs.getInt("ID_Garante"));
                in.setApellido(rs.getString("apellido"));
                in.setNombre(rs.getString("nombre"));
                in.setDNI(rs.getInt("dni"));
                in.setCUIL(rs.getLong("CUIL"));
                in.setDetalle(rs.getString("Detalles"));
                in.setId_Inquilino(id);
                    garante.add(in);
                    
                }
                
                ps.close(); 
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Garante");
            }
        
        return garante; 
       }
     
       public void modificarGarante(Garante garante){
            
            String sql="UPDATE garantes SET Apellido=?,Nombre=?,DNI=?,CUIL=?,Detalles=?,ID_Inquilino=? WHERE ID_Garante=?";
            
        try {
            try{
            PreparedStatement ps= con.prepareStatement(sql);
            
            ps.setString(1,garante.getApellido());
            ps.setString(2,garante.getNombre());
            ps.setInt(3,garante.getDNI());
            ps.setLong(4,garante.getCUIL());
            ps.setString(5, garante.getDetalle());
            ps.setInt(6, garante.getId_Inquilino());
            ps.setInt(7, garante.getID_Garante());
           
            int exito= ps.executeUpdate();
            
            if(exito==1){
      
                JOptionPane.showMessageDialog(null, "Garante modificado");
            }else{
                 JOptionPane.showMessageDialog(null, "No se encontro el Garante que busca");
            }
            }catch(NumberFormatException n){
             JOptionPane.showMessageDialog(null, "Se produjo un error");
                     
         }          
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Garante");
        }
            
      }      
}
