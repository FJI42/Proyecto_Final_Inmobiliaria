/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.accesoADatos;

import proyectofinal.accesoADatos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import proyectofinal.Entidades.Propietario;

/**
 *
 * @author User
 */
public class PropietarioData {
    private Connection con= null;
    
    public PropietarioData(){
         con= Conexion.getConexion();
    }

    public void agregaPropietario(Propietario propietario1){
        
    String consulta = "SELECT * FROM propietario WHERE `DNI` = ? ";

    try {
        PreparedStatement statement = con.prepareStatement(consulta);
        statement.setInt(1, propietario1.getDni());

        try (ResultSet resultSet = statement.executeQuery()) {
            if (resultSet.next()) {
                
                System.out.println("El registro ya existe en la base de datos.");
            } else {
                
                String sql = "INSERT INTO `propietario`(`Apellido`, `Nombre`, `DNI`, `Domicilio`, `Telefono`,`Estado`)VALUES(?,?,?,?,?,?)";
    
    try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                    ps.setString(1, propietario1.getApelidoPropietario());
                    ps.setString(2, propietario1.getNombrePropietario());
                    ps.setInt(3,    propietario1.getDni());
                    ps.setString(4, propietario1.getDomicilio());
                    ps.setLong(5,    propietario1.getTelefono());
                    ps.setBoolean(6,propietario1.isEstado());
                    ps.executeUpdate();
                    
                    ResultSet rs = ps.getGeneratedKeys();
                    if (rs.next()) {
                        propietario1.setIdPropietario(rs.getInt(1));
                        JOptionPane.showMessageDialog(null, "Propietario Guardado");
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al guardar");
}   }
            
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Error en la tabla Propietario");}
        }catch (SQLException e) {
         JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Propietario");
    }
    }
    
    
        public void BajaPropietario(int id){
         String sql="UPDATE propietario SET Estado=0 WHERE ID_Propietario =? AND Estado=1 ";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1,id);
            int exito = ps.executeUpdate(); 
            
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Propietario Eliminado");
            }    else{
                 JOptionPane.showMessageDialog(null, "No se encontro el Propietario");
                
            }
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Propietario");
        }
        }  
        public Propietario BuscarPropietario(int id){
     String sql= "SELECT * FROM `propietario` WHERE DNI=? ";
            Propietario propietario=null; 
     try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                propietario=new Propietario();
                propietario.setIdPropietario(rs.getInt("ID_Propietario"));
                propietario.setApelidoPropietario(rs.getString("Apellido"));
                propietario.setNombrePropietario(rs.getString("Nombre"));
                propietario.setDni(rs.getInt("DNI"));
                propietario.setDomicilio(rs.getString("Domicilio"));
                propietario.setTelefono(rs.getLong("Telefono"));
                propietario.setEstado(true); 
            }                  
//             }else {                 
//                JOptionPane.showMessageDialog(null,"No existe ese Propietario");                
//            }             
             ps.close();
                                                   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Propietario");
        }
        
        return propietario;             
}
        
        
        public Propietario BuscarPropietarioID(int id){
     String sql= "SELECT * FROM `propietario` WHERE ID_Propietario=? AND Estado=1";
            Propietario propietario=null; 
     try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                propietario=new Propietario();
                propietario.setIdPropietario(id);
                propietario.setApelidoPropietario(rs.getString("Apellido"));
                propietario.setNombrePropietario(rs.getString("Nombre"));
                propietario.setDni(id);
                propietario.setDomicilio(rs.getString("Domicilio"));
                propietario.setTelefono(rs.getLong("Telefono"));
                propietario.setEstado(true); 
                                   
             } else {                 
                JOptionPane.showMessageDialog(null,"No existe ese Propietario");                
            }             
             ps.close();
                                                   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Propietario");
        }
        
        return propietario;             
}
        
               public void modificarPropietario(Propietario propietario){
            
            String sql="UPDATE propietario SET Apellido=?,Nombre=?,DNI=?,Domicilio=?,Telefono=?,Estado=? WHERE ID_Propietario=?";
            
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            
            ps.setString(1,  propietario.getApelidoPropietario());
            ps.setString(2,  propietario.getNombrePropietario());
            ps.setInt(3,     propietario.getDni());
            ps.setString(4,  propietario.getDomicilio());
            ps.setLong(5,     propietario.getTelefono());
            ps.setBoolean(6, propietario.isEstado());
            ps.setInt(7,     propietario.getIdPropietario());
           
            int exito= ps.executeUpdate();
            
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Propietario modificado");
            }else{
                 JOptionPane.showMessageDialog(null, "No se encontro el Propietario que busca");
            }
            
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Propietario");
        }
            
      }
        public List<Propietario> obtenerLosPropietarios(){
        ArrayList<Propietario> propietario= new ArrayList<>();   
        String sql="SELECT * FROM propietario WHERE Estado=1";
         try {
                PreparedStatement ps= con.prepareStatement(sql);
//                ps.setInt(1,id); 
                ResultSet rs= ps.executeQuery();
                while(rs.next()){
                Propietario in =new Propietario(); 
                in.setIdPropietario(rs.getInt("ID_Propietario"));
                in.setApelidoPropietario(rs.getString("Apellido"));
                in.setNombrePropietario(rs.getString("Nombre"));
                in.setDni(rs.getInt("DNI"));
                in.setDomicilio(rs.getString("Domicilio"));
                in.setTelefono(rs.getLong("Telefono"));
                propietario.add(in);
                }
                
                ps.close(); 
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Propietario");
            }
        
        return propietario; 
       }
        public List<Propietario> obtenerLosPropietariosID(int id){
        ArrayList<Propietario> propietario= new ArrayList<>();   
        String sql="SELECT * FROM propietario WHERE ID_Propietario=?";
         try {
                PreparedStatement ps= con.prepareStatement(sql);
                ps.setInt(1,id); 
                ResultSet rs= ps.executeQuery();
                while(rs.next()){
                Propietario in =new Propietario(); 
                in.setIdPropietario(rs.getInt("ID_Propietario"));
                in.setApelidoPropietario(rs.getString("Apellido"));
                in.setNombrePropietario(rs.getString("Nombre"));
                in.setDni(rs.getInt("DNI"));
                in.setDomicilio(rs.getString("Domicilio"));
                in.setTelefono(rs.getInt("Telefono"));
                propietario.add(in);
                }
                
                ps.close(); 
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Propietario");
            }
        
        return propietario; 
       }
        
            public List<Propietario> obtenerPropietariosdeBaja(){
        ArrayList<Propietario> propietario= new ArrayList<>();   
        String sql="SELECT * FROM propietario WHERE estado=0";
         try {
                PreparedStatement ps= con.prepareStatement(sql);
//                ps.setInt(1,id); 
                ResultSet rs= ps.executeQuery();
                while(rs.next()){
                    Propietario in =new Propietario(); 
                in.setIdPropietario(rs.getInt("iD_Propietario"));
                in.setApelidoPropietario(rs.getString("apellido"));
                in.setNombrePropietario(rs.getString("nombre"));
                in.setDni(rs.getInt("dni"));
                in.setDomicilio(rs.getString("Domicilio"));
                in.setTelefono(rs.getInt("Telefono"));
                propietario.add(in);
                }
                
                ps.close(); 
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Propietario");
            }
        
        return propietario; 
       }
 }

