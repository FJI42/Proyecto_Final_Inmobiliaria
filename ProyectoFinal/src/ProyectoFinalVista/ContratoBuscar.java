/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinalVista;

import static java.lang.Integer.parseInt;
import java.sql.Connection;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
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
        jTable1.setModel(modelo);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbActivo)
                                    .addGap(100, 100, 100)
                                    .addComponent(jbVencido))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbBuscar)
                                    .addGap(61, 61, 61)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jbSalir)
                        .addGap(129, 129, 129)
                        .addComponent(jButton1)))
                .addContainerGap(30, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jButton1))
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
     if(contratoEncontrado!=null){ 
            JOptionPane.showMessageDialog(
         null,
         "Id_Contrato: " + contratoEncontrado.getID_Contrato() + "\n" +
         "Inquilino: " + contratoEncontrado.getInquilino() + "\n" +
         "Fecha_Final: " + contratoEncontrado.getFecha_Final() + "\n" +
         "Fecha_Inicio: " + contratoEncontrado.getFecha_Inicio() + "\n" +
         "Fecha_Realizacion: " + contratoEncontrado.getFecha_Realizacion() + "\n" +
         "Marca: " + contratoEncontrado.getMarca() + "\n" +
         "Propiedad: " + contratoEncontrado.getPropiedad() + "\n" +
         "Vendedor: " + contratoEncontrado.getVendedor() 

     );  
     }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActivoActionPerformed
        // TODO add your handling code here:
        jbVencido.setSelected(false);
        borrarFilas();
   
        if (jbActivo.isSelected() == true) {
            for (ContratoAlquiler ca : caD.obtenerLosContratos()) {
                modelo.addRow(new Object[]{ca.getInquilino(),ca.getFecha_Final(),ca.getFecha_Inicio(),ca.getFecha_Realizacion(),ca.getMarca(),ca.getPropiedad(),ca.getVendedor()});
            }
    }     

    }//GEN-LAST:event_jbActivoActionPerformed

    private void jbVencidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVencidoActionPerformed
        // TODO add your handling code here:
         jbActivo.setSelected(false);
         borrarFilas();

        if (jbVencido.isSelected() == true) {
            for (ContratoAlquiler ca : caD.obtenerContratosdeBaja()) {
                modelo.addRow(new Object[]{ca.getInquilino(),ca.getFecha_Final(),ca.getFecha_Inicio(),ca.getFecha_Realizacion(),ca.getMarca(),ca.getPropiedad(),ca.getVendedor()});
            }
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbActivo;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JButton jbVencido;
    // End of variables declaration//GEN-END:variables

    private void ArmarCabecera(){
    modelo.addColumn("Inquilino");
    modelo.addColumn("Fecha Final");
    modelo.addColumn("Fecha Inicio");
    modelo.addColumn("Fecha Realizacion");
    modelo.addColumn("Marca");
    modelo.addColumn("Propiedades");
    modelo.addColumn("Vendedor");
    //modelo.addColumn("Estado");

    //jTable1.setModel(modelo);

    }
    
    private void borrarFilas(){
        int f = jTable1.getRowCount()-1;
        for(;f>=0;f--){
              modelo.removeRow(f);
    }
    }

}