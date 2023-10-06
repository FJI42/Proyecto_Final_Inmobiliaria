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
        PreparedStatement statement = con.prepareStatement(consulta);
        statement.setInt(1, inquilino.getDNI());

        try (ResultSet resultSet = statement.executeQuery()) {
            if (resultSet.next()) {
                
                System.out.println("El registro ya existe en la base de datos.");
            } else {
                
                String sql = "INSERT INTO `inquilino`(`Apellido`, `Nombre`, `DNI`, `Detalles`, `Tipo`, `Estado`) VALUES (?,?,?,?,?,?)";

                try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                    ps.setString(1, inquilino.getApellido());
                    ps.setString(2, inquilino.getNombre());
                    ps.setInt(3, inquilino.getDNI());
                    ps.setString(4, inquilino.getDetalle());
                    ps.setString(5, inquilino.getTipo());
                    ps.setBoolean(6, inquilino.isEstado());
                    ps.executeUpdate();

                    ResultSet rs = ps.getGeneratedKeys();
                    if (rs.next()) {
                        inquilino.setId_Inquilino(rs.getInt(1));
                        JOptionPane.showMessageDialog(null, "Inquilino Guardado");
                    }
                } catch (SQLException ex) {
                   
                }
            }
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inquilino");
        }
    } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inquilino");
    
    }
  }
       
    public void BajaInquilino(int id){
         String sql="UPDATE inquilino SET estado=0 WHERE ID_Inquilino=? AND estado=1 ";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1,id);
            int exito = ps.executeUpdate(); 
            
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Inquilino Eliminado");
            }    else{
                 JOptionPane.showMessageDialog(null, "No se encontro el Inquilino");
                
            }
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inquilino");
        }
                                   
      }
    
    public Inquilino BuscarInquilino(int id){
     String sql= "SELECT `ID_Inquilino`, `Apellido`, `Nombre`, `DNI`, `Detalles`, `Tipo`, `Estado` FROM `inquilino` WHERE ID_Inquilino=? AND Estado=1";
            Inquilino inquilino=null; 
     try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                inquilino=new Inquilino();
                inquilino.setId_Inquilino(id);
                inquilino.setApellido(rs.getString("apellido"));
                inquilino.setNombre(rs.getString("nombre"));
                 inquilino.setDNI(rs.getInt("dni"));
                inquilino.setDetalle(rs.getString("Detalles"));
                inquilino.setTipo(rs.getString("Tipo"));
//                inquilino.setEstado(true); 
                                   
             }else {                 
                JOptionPane.showMessageDialog(null,"No existe ese Inquilino");                
            }             
             ps.close();
                                                   
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
//                ps.setInt(1,id); 
                ResultSet rs= ps.executeQuery();
                while(rs.next()){
                    Inquilino in =new Inquilino(); 
//                    in.setId_Inquilino(id);
                in.setApellido(rs.getString("apellido"));
                in.setNombre(rs.getString("nombre"));
                 in.setDNI(rs.getInt("dni"));
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
//                    in.setId_Inquilino(id);
                in.setApellido(rs.getString("apellido"));
                in.setNombre(rs.getString("nombre"));
                 in.setDNI(rs.getInt("dni"));
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
     
       public void modificarInquilino(Inquilino inquilino){
            
            String sql="UPDATE inquilino SET Apellido=?,Nombre=?,DNI=?,Detalles=?,Tipo=?,Estado=? WHERE ID_Inquilino=?";
            
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            
            ps.setString(1,inquilino.getApellido());
            ps.setString(2,inquilino.getNombre());
            ps.setInt(3,inquilino.getDNI());
            ps.setString(4, inquilino.getDetalle());
            ps.setString(5, inquilino.getTipo());
            ps.setBoolean(6, inquilino.isEstado());
            ps.setInt(7, 1);
           
            int exito= ps.executeUpdate();
            
            if(exito==1){
                 System.out.println("hasta aca funciona");
                JOptionPane.showMessageDialog(null, "Inquilino modificado");
            }else{
                 JOptionPane.showMessageDialog(null, "No se encontro el inquilino que busca");
            }
            
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Inquilino");
        }
            
      }      
}


