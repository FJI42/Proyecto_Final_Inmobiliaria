package ProyectoFinalVista;

import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import proyectofinal.Entidades.*;
import proyectofinal.accesoADatos.*;

/**
 *
 * @author usuario
 */
public class ContratoBuscar extends javax.swing.JInternalFrame {
    
  ContratoAlquilerData caD= new ContratoAlquilerData(); 
  private DefaultTableModel modelo = new DefaultTableModel();
    private Connection con= null;
    /**
     * Creates new form ContratoBuscar
     */
    public ContratoBuscar() {
        initComponents();
        con= Conexion.getConexion();
        ArmarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbBuscar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jbActivo = new javax.swing.JButton();
        jbVencido = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setClosable(true);

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbActivo.setText("Contrato activo");
        jbActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActivoActionPerformed(evt);
            }
        });

        jbVencido.setText("Contrato vencido");
        jbVencido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVencidoActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jbSalir.setText("Salir ");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbBuscar)
                                .addGap(61, 61, 61)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 149, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbActivo)
                                .addGap(124, 124, 124)
                                .addComponent(jbVencido)
                                .addGap(125, 125, 125))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jbSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(87, 87, 87)
                .addComponent(jButton1)
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBuscar)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbActivo)
                    .addComponent(jbVencido))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
         int resp = JOptionPane.showConfirmDialog(this, "Estás seguro que quieres salir?", "Cerrar Ventana", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        ContratoAlquiler contratoEncontrado= caD.buscarContrato(parseInt(jTextField1.getText()));
     try { 
         if(contratoEncontrado!=null){ 
            JOptionPane.showMessageDialog(
         null,
         "Id_Contrato: " + contratoEncontrado.getID_Contrato() + "\n" +
         "Inquilino: " + contratoEncontrado.getInquilino().getId_Inquilino() + "\n" +
         "Fecha_Final: " + contratoEncontrado.getFecha_Final() + "\n" +
         "Fecha_Inicio: " + contratoEncontrado.getFecha_Inicio() + "\n" +
         "Fecha_Realizacion: " + contratoEncontrado.getFecha_Realizacion() + "\n" +
         "Marca: " + contratoEncontrado.getMarca() + "\n" +
         "Propiedad: " + contratoEncontrado.getPropiedad().getID_Local() + "\n" +
         "Vendedor: " + contratoEncontrado.getVendedor());    
          
            jTextField1.setText("");
         }
               
     } catch(NullPointerException ex){
         JOptionPane.showMessageDialog(this,"Error al Buscar");
     }
         
     //Funciona correctamente 
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActivoActionPerformed
        // TODO add your handling code here:
        jbVencido.setSelected(false);
        borrarFilas();
        //System.out.println(caD.obtenerLosContratos());
        List<ContratoAlquiler> contratoAlquiler= new ArrayList<>();
        contratoAlquiler = caD.obtenerLosContratos(); 
       // if (jbActivo.isSelected() == true) {  
            for (ContratoAlquiler al : contratoAlquiler) {
                modelo.addRow(new Object[]{al.getID_Contrato(),al.getInquilino(),al.getFecha_Final(),al.getFecha_Inicio(),al.getFecha_Realizacion(),al.getMarca(),al.getPropiedad(),al.getVendedor()});
                
           // }
    }     

    }//GEN-LAST:event_jbActivoActionPerformed

    private void jbVencidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVencidoActionPerformed
        // TODO add your handling code here:
         jbActivo.setSelected(false);
         borrarFilas();

         List<ContratoAlquiler> contratoAlquiler= new ArrayList<>();
         contratoAlquiler = caD.obtenerContratosdeBaja(); 
        //if (jbVencido.isSelected() == true) {
            for (ContratoAlquiler al : contratoAlquiler) {
                modelo.addRow(new Object[]{al.getID_Contrato(),al.getInquilino(),al.getFecha_Final(),al.getFecha_Inicio(),al.getFecha_Realizacion(),al.getMarca(),al.getPropiedad(),al.getVendedor()});
            //}
    } 
    }//GEN-LAST:event_jbVencidoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    
    // Muestra la nueva ventana
       Contrato_Alquiler nombre = new Contrato_Alquiler();   
       JDesktopPane desktopPane = getDesktopPane(); 
       desktopPane.add(nombre);
       nombre.setVisible(true);
//     dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

//        try {
//        int fs = jTable1.getSelectedRow();
//        int idContrato= (int)modelo.getValueAt(fs,0); 
//        Inquilino idInquilino = (Inquilino) modelo.getValueAt(fs, 1); 
//        LocalDate fechaFinal = (LocalDate) modelo.getValueAt(fs, 2);
//        LocalDate fechaInicio = (LocalDate) modelo.getValueAt(fs, 3);
//        LocalDate fechaRealizacion = (LocalDate) modelo.getValueAt(fs, 4);
//        char marca = (char) modelo.getValueAt(fs, 5);
//        PropiedadInmueble propiedad = (PropiedadInmueble) modelo.getValueAt(fs, 6);
//        String vendedor = (String) modelo.getValueAt(fs, 7);
//        //boolean estado = true;
//
//        ContratoAlquiler con = new ContratoAlquiler(idContrato,idInquilino, fechaFinal, fechaInicio, fechaRealizacion, marca, propiedad, vendedor, true);
//        caD.cancelacion(con.getID_Contrato());
//     } catch (ArrayIndexOutOfBoundsException e) {
//    JOptionPane.showMessageDialog(this, "No hay nada seleccionado");
//      } 

    try {
        int fs = jTable1.getSelectedRow(); 
        ContratoAlquiler con1 = new ContratoAlquiler((int) modelo.getValueAt(fs, 0), 
            (Inquilino)modelo.getValueAt(fs, 1), (LocalDate)modelo.getValueAt(fs, 2), 
            (LocalDate) modelo.getValueAt(fs, 3),(LocalDate) modelo.getValueAt(fs, 4),
            (char) modelo.getValueAt(fs, 5),(PropiedadInmueble) modelo.getValueAt(fs, 6),
            (String) modelo.getValueAt(fs, 7), true);
            int resp = JOptionPane.showConfirmDialog(this, "Estás seguro que quieres dar de Baja a este Contrato", "Dar de Baja", JOptionPane.YES_NO_OPTION);
            
            if (resp == JOptionPane.YES_OPTION){                
                caD.cancelacion(con1.getID_Contrato()); } 
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "No hay nada seleccionado");
        } //Funciona !
        

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbActivo;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbVencido;
    // End of variables declaration//GEN-END:variables

    private void ArmarCabecera(){
    modelo.addColumn("Codigo");
    modelo.addColumn("Inquilino");
    modelo.addColumn("Fecha Final");
    modelo.addColumn("Fecha Inicio");
    modelo.addColumn("Fecha Realizacion");
    modelo.addColumn("Marca");
    modelo.addColumn("Propiedades");
    modelo.addColumn("Vendedor");

    jTable1.setModel(modelo);
    //jTable1.setDefaultEditor(Object.class, null);

    }
    
    private void borrarFilas(){
        int f = jTable1.getRowCount()-1;
        for(;f>=0;f--){
              modelo.removeRow(f);
    }
    }

}
