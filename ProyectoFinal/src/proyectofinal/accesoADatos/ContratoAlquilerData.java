package proyectofinal.accesoADatos;

import proyectofinal.accesoADatos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import proyectofinal.Entidades.ContratoAlquiler;

public class ContratoAlquilerData {
    
    private Connection con= null;
    
    public ContratoAlquilerData(){ 
        
        con= Conexion.getConexion();
        
    }
    //buscarContrato
    //cancelacion 
    //crear contrato
    //renovacion 
    
    public ContratoAlquiler buscarContrato(int cod) {
    String sql = "SELECT ID_Contrato,Inquilino, Fecha_Final, Fecha_Inicio, Fecha_Realizacion, Marca, Propiedad, Vendedor FROM contratoalquiler WHERE ID_Contrato=?";
    ContratoAlquiler contrato = null;
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, cod);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            contrato = new ContratoAlquiler();
            contrato.setID_Contrato(cod);
            contrato.setInquilino(("Inquilino")); 
            contrato.setFecha_Final(rs.getDate("Fecha_Final").toLocalDate());
            contrato.setFecha_Inicio(rs.getDate("Fecha_Inicio").toLocalDate());
            contrato.setFecha_Realizacion(rs.getDate("Fecha_Realizacion").toLocalDate());
            contrato.setMarca(("Marca")); 
            contrato.setPropiedad(("Propiedad")); 
            contrato.setVendedor(rs.getString("Vendedor")); 
        } else {
            JOptionPane.showMessageDialog(null, "No existe ese contrato");
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ContratoAlquiler");
    }
    return contrato;
 
    }
    
    public void cancelacion(int ID_Contrato,int Inquilino){
        
        String sql="DELETE from contratoalquiler WHERE ID_Contrato=? and Inquilino=?";
            try { 
                PreparedStatement ps= con.prepareStatement(sql);
                ps.setInt(1,ID_Contrato);
                ps.setInt(2,Inquilino);
                int filas = ps.executeUpdate();
                if(filas>0){
                    JOptionPane.showMessageDialog(null, "Cancelacion exitosa");
                }
                
                ps.close(); 
                
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Error al acceder a la tabla contratoAlquiler");
            }                
    }
    
    public void crearContrato(ContratoAlquiler ca){
        String sql="INSERT INTO contratoAlquiler(Inquilino,Fecha_Final,Fecha_Inicio,Fecha_Realizacion,Marca,Propiedad,Vendedor) VALUES (?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,ca.getInquilino().getId_Inquilino());
            ps.setDate(2, java.sql.Date.valueOf(ca.getFecha_Final()));
            ps.setDate(3, java.sql.Date.valueOf(ca.getFecha_Inicio()));
            ps.setDate(4, java.sql.Date.valueOf(ca.getFecha_Realizacion()));
            ps.setString(5, String.valueOf(ca.getMarca())); 
            ps.setInt(5,(ca.getPropiedad()));
            ps.setString(6,ca.getVendedor());
                         
            ps.executeUpdate();
            
            ResultSet rs= ps.getGeneratedKeys();
            if(rs.next()){
                
                JOptionPane.showMessageDialog(null, "Contrato creado");
            }
            
            ps.close(); 
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ContratoAlquiler");
        }
                   
    }
    
     public void renovacion(int ID_Contrato,int Inquilino,String Vendedor){
        String sql="UPDATE contratoalquiler SET ID_Contrato=? WHERE Inquilino=? and Vendedor=?";
            try { 
                PreparedStatement ps= con.prepareStatement(sql);
                ps.setInt(1,ID_Contrato);
                ps.setInt(2,Inquilino);
                ps.setString(3,Vendedor);
                ps.executeUpdate();
                
                int filas=ps.executeUpdate();
                if(filas>0){
                    JOptionPane.showMessageDialog(null, "Renovacion Exitosa");
                }
                
        ps.close();    
                
                
            } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ContratoAlquiler");
            }
        
    }
      
    //Verificar si funcionan correctamente 
    
}
