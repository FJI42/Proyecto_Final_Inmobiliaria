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
                
                String sql = "INSERT INTO `propietario`(`Apellido`, `Nombre`, `DNI`, `Domicilio`, `Telefono`)VALUES(?,?,?,?,?,?)";
    
    try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                    ps.setString(1, propietario1.getApelidoPropietario());
                    ps.setString(2, propietario1.getNombrePropietario());
                    ps.setInt(3, propietario1.getDni());
                    ps.setString(4, propietario1.getDomicilio());
                    ps.setInt(5, propietario1.getTelefono());
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
}

    
    

