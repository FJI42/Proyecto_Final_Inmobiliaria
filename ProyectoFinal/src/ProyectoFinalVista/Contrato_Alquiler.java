package ProyectoFinalVista;

import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyectofinal.accesoADatos.*;
import proyectofinal.Entidades.*;

/**
 *
 * @author usuario
 */
public class Contrato_Alquiler extends javax.swing.JInternalFrame {
private Connection con= null;
    ContratoAlquilerData caD= new ContratoAlquilerData();
    /**
     * Creates new form ContratoAlquiler
     */
    public Contrato_Alquiler() {
        initComponents();
        con= Conexion.getConexion();
        cargarCombo();
        cargarCombo2(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jbCrearContrato = new javax.swing.JButton();
        jbRenovarContrato = new javax.swing.JButton();
        jbBuscarContrato = new javax.swing.JButton();
        jbCancelarContrato = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jcInquilinos = new javax.swing.JComboBox<>();
        jcPropiedades = new javax.swing.JComboBox<>();
        jrbEstado = new javax.swing.JRadioButton();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jDateChooser6 = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(102, 102, 255));

        jLabel2.setText("Codigo:");

        jLabel3.setText("Inquilino:");

        jLabel4.setText("Fecha Final:");

        jLabel5.setText("Fecha Inicio:");

        jLabel6.setText("Fecha de Realizacion:");

        jLabel7.setText("Marca:");

        jLabel8.setText("Propiedad:");

        jLabel9.setText("Vendedor:");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        jbCrearContrato.setText("Crear");
        jbCrearContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearContratoActionPerformed(evt);
            }
        });

        jbRenovarContrato.setText("Renovar");

        jbBuscarContrato.setText("Buscar");
        jbBuscarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarContratoActionPerformed(evt);
            }
        });

        jbCancelarContrato.setText("Cancelar");

        jLabel10.setText("Estado:");

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jcInquilinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcInquilinosActionPerformed(evt);
            }
        });

        jcPropiedades.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbCrearContrato)
                        .addGap(74, 74, 74)
                        .addComponent(jbRenovarContrato)
                        .addGap(84, 84, 84)
                        .addComponent(jbCancelarContrato))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbEstado)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcInquilinos, 0, 79, Short.MAX_VALUE)
                                    .addComponent(jTextField1))
                                .addGap(78, 78, 78)
                                .addComponent(jbBuscarContrato))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jcPropiedades, javax.swing.GroupLayout.Alignment.LEADING, 0, 76, Short.MAX_VALUE))
                            .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbBuscarContrato))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jcInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addComponent(jLabel4))
                            .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5))
                    .addComponent(jDateChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jDateChooser6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jcPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jrbEstado))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCrearContrato)
                    .addComponent(jbRenovarContrato)
                    .addComponent(jbCancelarContrato)
                    .addComponent(jbSalir))
                .addGap(0, 45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
         int resp = JOptionPane.showConfirmDialog(this, "Estás seguro que quieres salir?", "Cerrar Ventana", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarContratoActionPerformed
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
        
    }//GEN-LAST:event_jbBuscarContratoActionPerformed

    private void jcInquilinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcInquilinosActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jcInquilinosActionPerformed

    private void jbCrearContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearContratoActionPerformed
        // TODO add your handling code here:
         //int id = Integer.parseInt(jTextField1.getText());
        Inquilino inquilino = (Inquilino)jcInquilinos.getSelectedItem();
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        String fecha_final = formatoFecha.format(jDateChooser4.getDate());
        LocalDate fechFin = LocalDate.parse(fecha_final, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        String fecha_inicio = formatoFecha.format(jDateChooser5.getDate());
        LocalDate fechIn = LocalDate.parse(fecha_inicio, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        String fecha_realizacion = formatoFecha.format(jDateChooser6.getDate());
        LocalDate fechRea = LocalDate.parse(fecha_realizacion, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        char marca = jTextField3.getText().charAt(0);
        PropiedadInmueble propiedad= (PropiedadInmueble)jcPropiedades.getSelectedItem();
        String vendedor= jTextField5.getText();
        
               
       ContratoAlquiler cal = new ContratoAlquiler(inquilino, fechFin, fechIn, fechRea, marca,propiedad, vendedor,true);
        caD.crearContrato(cal);
        
        
    }//GEN-LAST:event_jbCrearContratoActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
        if(jTextField1.getText().length() >= 8)
    {
        evt.consume();
    }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
       if(!Character.isLetter(c) && c != ' ') {
        evt.consume();
       }
    }//GEN-LAST:event_jTextField5KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private com.toedter.calendar.JDateChooser jDateChooser6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton jbBuscarContrato;
    private javax.swing.JButton jbCancelarContrato;
    private javax.swing.JButton jbCrearContrato;
    private javax.swing.JButton jbRenovarContrato;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Inquilino> jcInquilinos;
    private javax.swing.JComboBox<PropiedadInmueble> jcPropiedades;
    private javax.swing.JRadioButton jrbEstado;
    // End of variables declaration//GEN-END:variables


    private void cargarCombo(){ 
        
        InquilinoData inqD = new InquilinoData();
        ArrayList<Inquilino> inquilino = new ArrayList<>();

        for (Inquilino inqui : inqD.obtenerLosInquilinos()) {
            inquilino.add(inqui);
            jcInquilinos.addItem(inqui);
        }

    }
    
     private void cargarCombo2(){ 
        
        PropiedadInmuebleData piD = new PropiedadInmuebleData();
        ArrayList<PropiedadInmueble> propiedad = new ArrayList<>();

        for (PropiedadInmueble prop : piD.obtenerLasPropiedades()) {
            propiedad.add(prop);
            jcPropiedades.addItem(prop);
            
        }
    }
    


}
