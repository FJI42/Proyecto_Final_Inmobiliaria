package proyectofinal.accesoADatos;

import proyectofinal.accesoADatos.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyectofinal.Entidades.ContratoAlquiler;
import proyectofinal.Entidades.Inquilino;
import proyectofinal.Entidades.PropiedadInmueble;
import proyectofinal.accesoADatos.*;


public class ContratoAlquilerData {
    
    private Connection con= null;
    
    public ContratoAlquilerData(){ 
        
        con= Conexion.getConexion();
        
    }
      
    //buscarContrato (funciona)
    //cancelacion (funciona)
    //crear contrato (funciona)
    //renovacion (funciona)
    
     public void crearContrato(ContratoAlquiler ca){
         
        String consulta= "SELECT * FROM `contratoalquiler` WHERE ID_Contrato=?";
         
        try{
            PreparedStatement statement = con.prepareStatement(consulta);
            statement.setInt(1, ca.getID_Contrato());
           try(ResultSet resultSet = statement.executeQuery()){
             if (resultSet.next()) {        
                System.out.println("El registro ya existe en la base de datos.");           
             } else {
         
            String sql="INSERT INTO `contratoalquiler`(`Inquilino`, `Fecha_Final`, `Fecha_Inicio`, `Fecha_Realizacion`, `Marca`, `Propiedad`, `Vendedor`) VALUES (?,?,?,?,?,?,?)";

            try(PreparedStatement ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)){

                //ps.setInt(1, ca.getID_Contrato());
                ps.setInt(1,ca.getInquilino().getId_Inquilino());
                ps.setDate(2, java.sql.Date.valueOf(ca.getFecha_Final()));
                ps.setDate(3, java.sql.Date.valueOf(ca.getFecha_Inicio()));
                ps.setDate(4, java.sql.Date.valueOf(ca.getFecha_Realizacion()));
                ps.setString(5, String.valueOf(ca.getMarca())); 
                ps.setInt(6,ca.getPropiedad().getID_Local());            
                ps.setString(7, ca.getVendedor());
               
                Inquilino inquilino = ca.getInquilino();
                inquilino.setEstado(true);
                
                ps.executeUpdate();

                ResultSet rs= ps.getGeneratedKeys();
                if(rs.next()){
                    ca.setID_Contrato(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Contrato creado");
                }
                ps.close(); 
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Contrato Alquiler");
        } 
             
        } 
             }catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Error en a la tabla Contrato ");
         } 
         } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Contrato");
    
             }
  } 
 
 
     public void renovacion(ContratoAlquiler id){
        String sql="UPDATE `contratoalquiler` SET `Inquilino`=?,`Fecha_Final`=?,`Fecha_Inicio`=?,`Fecha_Realizacion`=?,`Marca`=?,`Propiedad`=?,`Vendedor`=?,`Estado`=? WHERE ID_Contrato=?";
           
        try { 
              PreparedStatement ps= con.prepareStatement(sql);
               
                ps.setInt(1,id.getInquilino().getId_Inquilino());
                ps.setDate(2, Date.valueOf(id.getFecha_Final()));
                ps.setDate(3, Date.valueOf(id.getFecha_Inicio()));
                ps.setDate(4, Date.valueOf(id.getFecha_Realizacion()));
                ps.setString(5, String.valueOf(id.getMarca())); 
                ps.setInt(6,id.getPropiedad().getID_Local());            
                ps.setString(7, id.getVendedor());
                ps.setInt(8,id.getID_Contrato());
                ps.setBoolean(9, true);
                
                 int exito= ps.executeUpdate();
               
                if(exito==1){
                   
                    JOptionPane.showMessageDialog(null, "Renovacion Exitosa");
                }    
                               
            } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Contrato Alquiler");
            }
        
    }
    
    public ContratoAlquiler buscarContrato(int cod) {
        
    String sql = "SELECT `Inquilino`,`Fecha_Final`,`Fecha_Inicio`,`Fecha_Realizacion`,`Marca`,`Propiedad`,`Vendedor`,`Estado` FROM `contratoalquiler` WHERE ID_Contrato=?";
    ContratoAlquiler contrato = null;
    try {
         PreparedStatement ps= con.prepareStatement(sql);
        ps.setInt(1, cod);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
          contrato = new ContratoAlquiler();
             contrato.setID_Contrato(cod);
            int idInquilino = rs.getInt("Inquilino");
            int idPropiedad = rs.getInt("Propiedad");
            
            // Usar métodos para obtener los objetos Inquilino y PropiedadInmueble completos
            PropiedadInmuebleData piD = new PropiedadInmuebleData(); 
            InquilinoData inD = new InquilinoData();       
            Inquilino inquilino = inD.BuscarInquilinoId(idInquilino);
            
           // System.out.println(inquilino.toString());
            PropiedadInmueble propiedad = piD.buscarPropInmueble(idPropiedad);
            contrato.setInquilino(inquilino);
            contrato.setFecha_Final(rs.getDate("Fecha_Final").toLocalDate());
            contrato.setFecha_Inicio(rs.getDate("Fecha_Inicio").toLocalDate());
            contrato.setFecha_Realizacion(rs.getDate("Fecha_Realizacion").toLocalDate());
            contrato.setMarca(rs.getString("Marca").charAt(0)); // Suponiendo que "Marca" es un char en la base de datos
            contrato.setPropiedad(propiedad);
            contrato.setVendedor(rs.getString("Vendedor"));
            contrato.setEstado(true);

        } else {
            JOptionPane.showMessageDialog(null, "No existe ese contrato");
        }
        
        ps.close();
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Contrato Alquiler");
    }
       return contrato;
 
    }
    
    public void cancelacion(int ID_Contrato){
        
        String sql="UPDATE contratoalquiler SET estado=0 WHERE ID_Contrato=?";
            try { 
                PreparedStatement ps= con.prepareStatement(sql);
                ps.setInt(1,ID_Contrato);
                int filas = ps.executeUpdate();
                
                if(filas>0){
                    JOptionPane.showMessageDialog(null, "Cancelacion exitosa");
                }
                
                ps.close(); 
                
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Error al acceder a la tabla contratoAlquiler");
            }                
    }

    public List<ContratoAlquiler> obtenerContratosdeBaja(){
        ArrayList<ContratoAlquiler> contratoAl= new ArrayList<>();   
        String sql="SELECT * FROM contratoalquiler WHERE estado=0";
         try {
                PreparedStatement ps= con.prepareStatement(sql);
                
                ResultSet rs= ps.executeQuery();
                while(rs.next()){
                    ContratoAlquiler al= new ContratoAlquiler(); 
            int idInquilino = rs.getInt("Inquilino");
            int idPropiedad = rs.getInt("Propiedad");
            
            // Usar métodos para obtener los objetos Inquilino y PropiedadInmueble completos
            PropiedadInmuebleData piD = new PropiedadInmuebleData(); 
            InquilinoData inD = new InquilinoData();
        
            Inquilino inquilino = inD.BuscarInquilinoId(idInquilino);
            PropiedadInmueble propiedad = piD.buscarPropInmueble(idPropiedad);
                    
            //al.setID_Contrato(rs.getInt("ID_Contrato"));
            al.setInquilino(inquilino);
            al.setFecha_Final(rs.getDate("Fecha_Final").toLocalDate());
            al.setFecha_Inicio(rs.getDate("Fecha_Inicio").toLocalDate());
            al.setFecha_Realizacion(rs.getDate("Fecha_Realizacion").toLocalDate());
            al.setMarca(rs.getString("Marca").charAt(0)); // Suponiendo que "Marca" es un char en la base de datos
            al.setPropiedad(propiedad);
            al.setVendedor(rs.getString("Vendedor"));
            //al.setEstado(true);

                
                contratoAl.add(al);
                    
                }
                
                ps.close(); 
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Contrato Alquiler");
            }
        
        return contratoAl; 
       }
    
     public List<ContratoAlquiler> obtenerLosContratos(){
        ArrayList<ContratoAlquiler> contratoAlquiler= new ArrayList<>();   
        String sql="SELECT * FROM contratoalquiler WHERE estado=1";
         try {
                PreparedStatement ps= con.prepareStatement(sql);
//                ps.setInt(1,id); 
                ResultSet rs= ps.executeQuery();
                while(rs.next()){
           ContratoAlquiler al= new ContratoAlquiler(); 
            int idInquilino = rs.getInt("Inquilino");
            int idPropiedad = rs.getInt("Propiedad");
            
            // Usar métodos para obtener los objetos Inquilino y PropiedadInmueble completos
            PropiedadInmuebleData piD = new PropiedadInmuebleData(); 
            InquilinoData inD = new InquilinoData();
        
            Inquilino inquilino = inD.BuscarInquilinoId(idInquilino);

            PropiedadInmueble propiedad = piD.buscarPropInmueble(idPropiedad);
                    
            //al.setID_Contrato(rs.getInt("ID_Contrato"));
            al.setInquilino(inquilino);
            al.setFecha_Final(rs.getDate("Fecha_Final").toLocalDate());
            al.setFecha_Inicio(rs.getDate("Fecha_Inicio").toLocalDate());
            al.setFecha_Realizacion(rs.getDate("Fecha_Realizacion").toLocalDate());
            al.setMarca(rs.getString("Marca").charAt(0)); // Suponiendo que "Marca" es un char en la base de datos
            al.setPropiedad(propiedad);
            al.setVendedor(rs.getString("Vendedor"));
            //al.setEstado(true); 
            contratoAlquiler.add(al); 
               
                }
                
                ps.close(); 
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Contrato Alquiler");
            }
        
        return contratoAlquiler; 
       }
    
}
