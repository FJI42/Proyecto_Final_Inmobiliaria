/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinalVista;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import proyectofinal.Entidades.Inquilino;
import proyectofinal.accesoADatos.Conexion;
import proyectofinal.accesoADatos.InquilinoData;

/**
 *
 * @author User
 */
public class InquilinoModificar extends javax.swing.JInternalFrame {
private Connection con= null;
public InquilinoData in = new InquilinoData();   
    public InquilinoModificar() {
        initComponents();
        con= Conexion.getConexion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtADetalle = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboTipo = new javax.swing.JComboBox<>();
        btnModificar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtCUIL = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIKeyTyped(evt);
            }
        });

        txtADetalle.setColumns(20);
        txtADetalle.setRows(5);
        jScrollPane1.setViewportView(txtADetalle);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Apellido");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("DNI");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setText("Tipo");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setText("Detalle");

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Soltero", "Pareja", "Familia" }));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Salir");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setText("Nº");

        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });

        txtCUIL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCUILKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setText("CUIL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(btnCancelar)
                .addGap(116, 116, 116)
                .addComponent(btnModificar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDNI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCUIL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(158, 158, 158))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(txtCUIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnModificar))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        InquilinosVistas nombre = new InquilinosVistas();   
       JDesktopPane desktopPane = getDesktopPane(); 
       desktopPane.add(nombre);
    nombre.setVisible(true);
     dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
      try{
          int ID  = parseInt(txtID.getText());
          
          String ValidarDNI = txtDNI.getText();
          String ValidarCUIL = txtCUIL.getText();
          int DNI = parseInt(txtDNI.getText());  
          long CUIL = parseLong(txtCUIL.getText()); 
          System.out.println(CUIL);
          String Apellido = txtApellido.getText();
          String Nombre = txtNombre.getText();
          String Detalle = txtADetalle.getText();
          int i =  cboTipo.getSelectedIndex();
          
          String Tipo =  cboTipo.getItemAt(i);
          if (!Apellido.trim().isEmpty() && !Nombre.trim().isEmpty() && !Detalle.trim().isEmpty()) {
    // La cadena no está vacía y no tiene espacios al principio ni al final
           if(ValidarDNI.length() != 8 && ValidarCUIL.length() !=11){
               if(ValidarDNI.length() != 8){  
               JOptionPane.showMessageDialog(null, "El DNI esta incompleto.");
               }
               if(ValidarCUIL.length() !=11){
                 JOptionPane.showMessageDialog(null, "El CUIL esta incompleto.");
                 
               }
              } else{    
 
          Inquilino inq = new Inquilino(ID, Apellido, Nombre, DNI,CUIL, Detalle, Tipo);
          in.modificarInquilino(inq);
          txtID.setText("");
          txtDNI.setText("");
          txtCUIL.setText("");
          txtApellido.setText("");
          txtNombre.setText("");
          txtADetalle.setText("");
          cboTipo.setSelectedItem("Estudiante");
          
           }
    }else{
              
            
              JOptionPane.showMessageDialog(null, "Debe Completar todas las casillas.");
          
          }
      }catch(NumberFormatException E){
          JOptionPane.showMessageDialog(null, "Debe aaCompletar todas las casillas.");
      } 
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
        if(txtDNI.getText().length() >= 8)
    {
        evt.consume();
    }
    }//GEN-LAST:event_txtDNIKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
       if(!Character.isLetter(c) && c != ' ') {
        evt.consume();
    }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
       if(!Character.isLetter(c) && c != ' ') {
        evt.consume();}
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_txtIDKeyTyped

    private void txtCUILKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCUILKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
        if(txtCUIL.getText().length() >= 11)
    {
        evt.consume();
    }
    }//GEN-LAST:event_txtCUILKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtADetalle;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCUIL;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
