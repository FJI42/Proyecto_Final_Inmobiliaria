package acceso_a_Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import proyectofinal.ContratoAlquiler;

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
    String sql = "SELECT codContrato, elInquilino, Fecha_Final, Fecha_Inicio, FechaRealizacion, Marca, propiedad, Vendedor FROM ContratoAlquiler WHERE codContrato=?";
    ContratoAlquiler contrato = null;
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, cod);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            contrato = new ContratoAlquiler();
            contrato.setCodContrato(cod);
            contrato.setElInquilino(("elInquilino")); 
            contrato.setFecha_Final(rs.getDate("Fecha_Final").toLocalDate());
            contrato.setFecha_Inicio(rs.getDate("Fecha_Inicio").toLocalDate());
            contrato.setFechaRealizacion(rs.getDate("FechaRealizacion").toLocalDate());
            contrato.setMarca(("Marca")); 
            contrato.setPropiedad(("propiedad")); 
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
    
    public void cancelacion(int codContrato,int elInquilino){
        
        String sql="DELETE from ContratoAlquiler WHERE codContrato=? and elInquilino=?";
            try { 
                PreparedStatement ps= con.prepareStatement(sql);
                ps.setInt(1,codContrato);
                ps.setInt(2,elInquilino);
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
        String sql="INSERT INTO ContratoAlquiler(elInquilino,Fecha_Final,Fecha_Inicio,FechaRealizacion,Marca,propiedad,Vendedor) VALUES (?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,ca.getElInquilino().getId_Inquilino());
            ps.setDate(2, java.sql.Date.valueOf(ca.getFecha_Final()));
            ps.setDate(3, java.sql.Date.valueOf(ca.getFecha_Inicio()));
            ps.setDate(4, java.sql.Date.valueOf(ca.getFechaRealizacion()));
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
      
    
     public void renovacion(int codContrato,int elInquilino,String Vendedor){
        String sql="UPDATE ContratoAlquiler SET codContrato=? WHERE id_alumno=? and id_materia=?";
            try { 
                PreparedStatement ps= con.prepareStatement(sql);
                ps.setInt(1,codContrato);
                ps.setInt(2,elInquilino);
                ps.setString(3,Vendedor);
                ps.executeUpdate();
                
                int filas=ps.executeUpdate();
                if(filas>0){
                    JOptionPane.showMessageDialog(null, "Nota actualizada");
                }
                
        ps.close();    
                
                
            } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
            }
        
    }
      
    //Verificar si funcionan correctamente 
    
}
