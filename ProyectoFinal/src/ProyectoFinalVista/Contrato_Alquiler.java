package ProyectoFinalVista;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyectofinal.accesoADatos.*;
import proyectofinal.Entidades.*;
import javax.swing.JDesktopPane;

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
        cargarComboGarante();
        cPropietario(); 
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
        jlID = new javax.swing.JLabel();
        jtID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtMarca = new javax.swing.JTextField();
        jtVendedor = new javax.swing.JTextField();
        jbCrearContrato = new javax.swing.JButton();
        jbRenovarContrato = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jbSalir = new javax.swing.JButton();
        jcInquilinos = new javax.swing.JComboBox<>();
        jcPropiedades = new javax.swing.JComboBox<>();
        jrbEstado = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jDateChooser6 = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(102, 102, 255));
        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jlID.setText("ID:");

        jtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIDActionPerformed(evt);
            }
        });
        jtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtIDKeyTyped(evt);
            }
        });

        jButton1.setText("Nuevo garante");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Inquilino:");

        jLabel1.setText("Garante: ");

        jLabel4.setText("Fecha Final:");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha Inicio:");

        jLabel6.setText("Fecha de Realizacion:");

        jLabel7.setText("Marca:");

        jLabel8.setText("Propiedad:");

        jLabel9.setText("Vendedor:");

        jtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMarcaActionPerformed(evt);
            }
        });
        jtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtMarcaKeyTyped(evt);
            }
        });

        jtVendedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtVendedorKeyTyped(evt);
            }
        });

        jbCrearContrato.setText("Crear");
        jbCrearContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearContratoActionPerformed(evt);
            }
        });

        jbRenovarContrato.setText("Renovar");
        jbRenovarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRenovarContratoActionPerformed(evt);
            }
        });

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

        jrbEstado.setText("Activo");
        jrbEstado.setToolTipText("");

        jLabel2.setText("Propietario:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(43, 43, 43)
                                            .addComponent(jlID))
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(2, 2, 2)))
                        .addGap(22, 22, 22)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(jbRenovarContrato))
                            .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbEstado)
                            .addComponent(jtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(210, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jbCrearContrato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(94, 94, 94)
                .addComponent(jbSalir)
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlID)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbRenovarContrato)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jcInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5))
                    .addComponent(jDateChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jDateChooser6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jtVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jrbEstado))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jbSalir)
                    .addComponent(jbCrearContrato))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRenovarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRenovarContratoActionPerformed
        // TODO add your handling code here:
        try {
            if (!jtID.getText().isEmpty() && jComboBox1.getSelectedItem()!=null && jComboBox2.getSelectedItem()!=null && jcInquilinos.getSelectedItem()!= null  && jDateChooser4.getDate()!= null &&jDateChooser5.getDate()!= null && jDateChooser6.getDate()!= null && !jtMarca.getText().isEmpty() && jcPropiedades.getSelectedItem()!= null && !jtVendedor.getText().isEmpty() &&  jDateChooser4.getDate()!=null && jrbEstado.isSelected() == true ) {

                int ID = parseInt(jtID.getText());
                Inquilino inquilino = (Inquilino)jcInquilinos.getSelectedItem();
                //Garante garant = (Garante)jComboBox1.getSelectedItem();
                LocalDate fecha_final = jDateChooser4.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate fecha_inicio = jDateChooser5.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate fecha_realizacion = jDateChooser6.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                char marca = jtMarca.getText().charAt(0);
                PropiedadInmueble propiedad= (PropiedadInmueble)jcPropiedades.getSelectedItem();        
                String vendedor= jtVendedor.getText();                              
                boolean estado = jrbEstado.isSelected();
                Propietario propietario = (Propietario)jComboBox2.getSelectedItem();
                
            ContratoAlquiler cal = new ContratoAlquiler(ID,inquilino,fecha_final,fecha_inicio,fecha_realizacion, marca, propiedad, vendedor, estado,propietario);
            caD.renovacion(cal); 
                
            } else if(jtID.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "¡No debe dejar el campo del ID vacio!");
            }
            else if (jtVendedor.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "¡No debe dejar el campo del Vendedor vacio!");
            } else if (jDateChooser4.getDate() == null) {
                JOptionPane.showMessageDialog(this, "¡No debe dejar el campo Fecha Final!");
            } else if (jDateChooser5.getDate()==null){
                JOptionPane.showMessageDialog(this, "¡No debe dejar el campo Fecha Inicio!");    
            } else if (jDateChooser6.getDate()==null){
                JOptionPane.showMessageDialog(this, "¡No debe dejar el campo Fecha de Realizacion!");
            } else if (jtMarca.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "¡No debe dejar la Marca vacia!");
            } 
             else if (jtVendedor.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "¡No debe dejar el Vendedor vacio!");
            }
            else if (jrbEstado.isSelected() == false) {
                JOptionPane.showMessageDialog(this, "¡Debe dejar sin marcar el campo estado!");
            } else if(jComboBox1.getSelectedItem()==null){
                JOptionPane.showMessageDialog(this, "Inquilino sin garante ¡No puede renovar!");
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "¡No debe dejar campos vacios!");
        }
        
        
            jtID.setText("");
            jDateChooser4.setDate(null);
            jDateChooser5.setDate(null);
            jDateChooser6.setDate(null);
        
            jtMarca.setText("");
            jtVendedor.setText("");
    }//GEN-LAST:event_jbRenovarContratoActionPerformed

    private void jbCrearContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearContratoActionPerformed
        // TODO add your handling code here:
        guardar(); 
        
        jDateChooser4.setDate(null);
        jDateChooser5.setDate(null);
        jDateChooser6.setDate(null);
        
        jtMarca.setText("");
        jtVendedor.setText("");

    }//GEN-LAST:event_jbCrearContratoActionPerformed

    private void jcInquilinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcInquilinosActionPerformed
        // TODO add your handling code here:
       cargarComboGarante();
        
        
    }//GEN-LAST:event_jcInquilinosActionPerformed
   
    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
         int resp = JOptionPane.showConfirmDialog(this, "Estás seguro que quieres salir?", "Cerrar Ventana", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         setVisible(false);
    
    // Muestra la nueva ventana
       GaranteNuevo2 nombre = new GaranteNuevo2();   
       JDesktopPane desktopPane = getDesktopPane(); 
       desktopPane.add(nombre);
       nombre.setVisible(true);
    //     dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMarcaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jtMarcaActionPerformed

    private void jtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIDActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jtIDActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        cargarComboGarante();
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMarcaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
       if(!Character.isLetter(c) && c != ' ') {
        evt.consume();
       }
    }//GEN-LAST:event_jtMarcaKeyTyped

    private void jtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIDKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
        if(jtID.getText().length() >= 8)
    {
        evt.consume();
    }
    }//GEN-LAST:event_jtIDKeyTyped

    private void jtVendedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtVendedorKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
       if(!Character.isLetter(c) && c != ' ') {
        evt.consume();
       }
    }//GEN-LAST:event_jtVendedorKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Garante> jComboBox1;
    private javax.swing.JComboBox<Propietario> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private com.toedter.calendar.JDateChooser jDateChooser6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbCrearContrato;
    private javax.swing.JButton jbRenovarContrato;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Inquilino> jcInquilinos;
    private javax.swing.JComboBox<PropiedadInmueble> jcPropiedades;
    private javax.swing.JLabel jlID;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtID;
    private javax.swing.JTextField jtMarca;
    private javax.swing.JTextField jtVendedor;
    // End of variables declaration//GEN-END:variables


    private void cargarCombo(){ 
        
        InquilinoData inqD = new InquilinoData();
        ArrayList<Inquilino> inquilino = new ArrayList<>();

        for (Inquilino inqui : inqD.obtenerInquilinosdeBaja()) {
            inquilino.add(inqui);
            jcInquilinos.addItem(inqui);
        }

    }
    
     private void cargarCombo2(){ 
        
        PropiedadInmuebleData piD = new PropiedadInmuebleData();
        ArrayList<PropiedadInmueble> propiedad = new ArrayList<>();

        for (PropiedadInmueble prop : piD.obtenerLasPropiedadesActivas()) {
            propiedad.add(prop);
            jcPropiedades.addItem(prop);  
        }
    }
     
    private void cargarComboGarante(){ 
   
        GaranteData garD = new GaranteData();
        ArrayList<Garante> garante= new ArrayList<>();  
        Inquilino inq = (Inquilino)jcInquilinos.getSelectedItem();
        jComboBox1.removeAllItems();
        
         for (Garante gar : garD.obtenerGaranteID(inq.getId_Inquilino())) {
            garante.add(gar);           
            jComboBox1.addItem(gar);                                
         } 
    
    } 
    

    private void cPropietario(){ 
        PropietarioData pD= new PropietarioData();
        ArrayList<Propietario> propietario= new ArrayList<>();  
        Propietario pro = (Propietario)jComboBox2.getSelectedItem();
        //jComboBox2.removeAllItems();
        
        for (Propietario po : pD.obtenerLosPropietarios()) {
            propietario.add(po);           
            jComboBox2.addItem(po);                                
         }

    }

    
    
     public void guardar() {
        try {
            if (jcInquilinos.getSelectedItem()!= null && jComboBox2.getSelectedItem()!=null  && jComboBox1.getSelectedItem()!=null && jDateChooser4.getDate()!= null &&jDateChooser5.getDate()!= null && jDateChooser6.getDate()!= null && !jtMarca.getText().isEmpty() && jcPropiedades.getSelectedItem()!= null && !jtVendedor.getText().isEmpty() &&  jDateChooser4.getDate()!=null && jrbEstado.isSelected() == true ) {
                
                Inquilino inquilino = (Inquilino)jcInquilinos.getSelectedItem();
                //Garante garante = (Garante)jComboBox1.getSelectedItem();
                LocalDate fecha_final = jDateChooser4.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate fecha_inicio = jDateChooser5.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate fecha_realizacion = jDateChooser6.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                char marca = jtMarca.getText().charAt(0);
                PropiedadInmueble propiedad= (PropiedadInmueble)jcPropiedades.getSelectedItem();        
                String vendedor= jtVendedor.getText();                              
                boolean estado = jrbEstado.isSelected();
                Propietario propietario = (Propietario)jComboBox2.getSelectedItem();
                
            ContratoAlquiler cal = new ContratoAlquiler(inquilino,fecha_final,fecha_inicio,fecha_realizacion, marca, propiedad, vendedor, estado,propietario);
            
            //ContratoAlquiler co= new ContratoAlquiler(8,inq, LocalDate.of(2028,8,23),LocalDate.of(2021,8,12),LocalDate.of(2013,10,10),'B',mi,"Alberto",true);
            caD.crearContrato(cal); 
                
            } 
            else if (jtVendedor.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No debe dejar el campo del Vendedor vacio");
            } else if (jDateChooser4.getDate() == null) {
                JOptionPane.showMessageDialog(this, "No debe dejar el campo Fecha Final");
            } else if (jDateChooser5.getDate()==null){
                JOptionPane.showMessageDialog(this, "No debe dejar el campo Fecha Inicio");    
            } else if (jDateChooser4.getDate()==null){
                JOptionPane.showMessageDialog(this, "No debe dejar el campo Fecha de Realizacion");
            } else if (jtMarca.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No debe dejar la Marca vacia");
            } 
          
             else if (jtVendedor.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "No debe dejar el Vendedor vacio");
            }
            else if (jrbEstado.isSelected() == false) {
                JOptionPane.showMessageDialog(this, "Debe dejar activado el campo estado");
            } else if(jComboBox1.getSelectedItem()==null){
                JOptionPane.showMessageDialog(this, "Inquilino sin garante ¡No puede contratar!");
            
            }

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No debe dejar campos vacios");
        }
    
    }
      
   
             
     public void habilitarBotones(){
       
            jbCrearContrato.setEnabled(true);
            jbRenovarContrato.setEnabled(true);
        
    }
     
     public void desHabilitarBotones(){

            jbCrearContrato.setEnabled(false);
            jbRenovarContrato.setEnabled(false);
            
       
    }
}
