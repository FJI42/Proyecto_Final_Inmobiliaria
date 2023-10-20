/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinalVista;
import ProyectoFinalVista.InquilinoNuevo;
import ProyectoFinalVista.Vistas;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import javax.swing.DefaultCellEditor;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import proyectofinal.Entidades.Inquilino;
import proyectofinal.accesoADatos.Conexion;
import proyectofinal.accesoADatos.InquilinoData;
/**
 *
 * @author User
 */
public class InquilinosVistas extends javax.swing.JInternalFrame {

       private DefaultTableModel modelo = new DefaultTableModel();
    private Connection con= null;
    private InquilinoData id = new InquilinoData();
    public InquilinosVistas() {
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

        jPanel1 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        rdbIExistentes = new javax.swing.JRadioButton();
        rdbIbaja = new javax.swing.JRadioButton();
        btnNuevo = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        Modificar1 = new javax.swing.JButton();
        btnVerMas = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nro", "Apellido", "Nombre", "DNI", "Detalle", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(150);
        }

        rdbIExistentes.setText("Inquilinos Existentes");
        rdbIExistentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbIExistentesActionPerformed(evt);
            }
        });

        rdbIbaja.setText("Inquilinos de Baja");
        rdbIbaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbIbajaActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEliminar1.setText("Eliminar");
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });

        Modificar1.setText("Modificar");
        Modificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modificar1ActionPerformed(evt);
            }
        });

        btnVerMas.setText("Ver Mas");
        btnVerMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(rdbIExistentes)
                                .addGap(98, 98, 98)
                                .addComponent(rdbIbaja))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(btnEliminar1)
                .addGap(70, 70, 70)
                .addComponent(Modificar1)
                .addGap(70, 70, 70)
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVerMas)
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbIExistentes)
                    .addComponent(rdbIbaja))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnEliminar1)
                    .addComponent(Modificar1)
                    .addComponent(btnVerMas))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
    setVisible(false);
    
    // Muestra la nueva ventana
    InquilinoNuevo nombre = new InquilinoNuevo();   
       JDesktopPane desktopPane = getDesktopPane(); 
       desktopPane.add(nombre);
    nombre.setVisible(true);
//     dispose();
    
 
      
      
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void Modificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    
    // Muestra la nueva ventana
    InquilinoModificar nombre = new InquilinoModificar();   
       JDesktopPane desktopPane = getDesktopPane(); 
       desktopPane.add(nombre);
    nombre.setVisible(true);
//     dispose();
    }//GEN-LAST:event_Modificar1ActionPerformed

    private void rdbIExistentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbIExistentesActionPerformed
        // TODO add your handling code here:
          rdbIbaja.setSelected(false);
        borrarFilas();
       
      
        if ( rdbIExistentes.isSelected() == true) {
            for (Inquilino in : id.obtenerLosInquilinos()) {
                modelo.addRow(new Object[]{in.getId_Inquilino(),in.getApellido(),in.getNombre(),in.getDNI(),in.getCUIL(),in.getDetalle(),in.getTipo()});
            }
    }//GEN-LAST:event_rdbIExistentesActionPerformed
    }
    private void rdbIbajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbIbajaActionPerformed
        // TODO add your handling code here:
        rdbIExistentes.setSelected(false);
         borrarFilas();
        
      
        if (  rdbIbaja.isSelected() == true) {
            for (Inquilino in : id.obtenerInquilinosdeBaja()) {
                modelo.addRow(new Object[]{in.getId_Inquilino(),in.getApellido(),in.getNombre(),in.getDNI(),in.getCUIL(),in.getDetalle(),in.getTipo()});
            }
    }                       
    }//GEN-LAST:event_rdbIbajaActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        // TODO add your handling code here:
           try {
            int filaS = jTable1.getSelectedRow();
            
            Inquilino in = new Inquilino((int) modelo.getValueAt(filaS, 0), (String) modelo.getValueAt(filaS, 1),(String) modelo.getValueAt(filaS, 2), (int) modelo.getValueAt(filaS, 3),(long) modelo.getValueAt(filaS, 4), (String) modelo.getValueAt(filaS, 5),(String) modelo.getValueAt(filaS, 6),true);
           int resp = JOptionPane.showConfirmDialog(this, "Estás seguro que quieres dar de Baja a este Inquilino?", "Dar de Baja", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION){
          id.BajaInquilino(in.getId_Inquilino());
        }
            

        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado nada, intentar nuevamente");
        }
        
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        try{
        int buscar = parseInt(txtBuscar.getText());
        String ValidarDNI = txtBuscar.getText();
        if (ValidarDNI.length() != 8) {
            JOptionPane.showMessageDialog(null, "Para buscar debe ingresar el DNI del inquilino");
        } else {
            borrarFilas();
            if (id.BuscarInquilino(buscar).isEstado()) {
                rdbIExistentes.setSelected(true);
                rdbIbaja.setSelected(false);
            } else {
                rdbIExistentes.setSelected(false);
                rdbIbaja.setSelected(true);
            }
            int idI = id.BuscarInquilino(buscar).getId_Inquilino();
            String Apellido = id.BuscarInquilino(buscar).getApellido();
            String Nombre = id.BuscarInquilino(buscar).getNombre();
            int DNI = id.BuscarInquilino(buscar).getDNI();
            long CUIL = id.BuscarInquilino(buscar).getCUIL();
            String Detalle = id.BuscarInquilino(buscar).getDetalle();
            String Tipo = id.BuscarInquilino(buscar).getTipo();
            Inquilino in = new Inquilino(idI, Apellido, Nombre, DNI,CUIL, Detalle, Tipo);
            modelo.addRow(new Object[]{in.getId_Inquilino(), in.getApellido(), in.getNombre(), in.getDNI(),in.getCUIL(), in.getDetalle(), in.getTipo()});
            txtBuscar.setText("");
        }
        }catch(NullPointerException N){
            JOptionPane.showMessageDialog(null,"No existe ese Inquilino");
            txtBuscar.setText("");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
 char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
        if(txtBuscar.getText().length() >= 8)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void btnVerMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMasActionPerformed
        // TODO add your handling code here:
           try {
            int filaS = jTable1.getSelectedRow();
            
            Inquilino in = new Inquilino((int) modelo.getValueAt(filaS, 0), (String) modelo.getValueAt(filaS, 1),(String) modelo.getValueAt(filaS, 2), (int) modelo.getValueAt(filaS, 3),(long) modelo.getValueAt(filaS, 4), (String) modelo.getValueAt(filaS, 5),(String) modelo.getValueAt(filaS, 6),true);
           
       
          id.BuscarInquilino(in.getDNI());
         JOptionPane.showMessageDialog(this,  
    "Nro: " + in.getId_Inquilino() + "\n" +
    "Apellido: " + in.getApellido()+ "\n" +
    "Nombre: " + in.getNombre() +  "\n " +
    "DNI: " + in.getDNI() + "\n" +
    "CUIL: " + in.getCUIL() + "\n" +
    "Detalle: " + in.getDetalle() + "\n" +
    "Tipo: " + in.getTipo());  

        
            

        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado nada, intentar nuevamente");
        }
    }//GEN-LAST:event_btnVerMasActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Modificar1;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnVerMas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rdbIExistentes;
    private javax.swing.JRadioButton rdbIbaja;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

 private void ArmarCabecera(){
    modelo.addColumn("Nro");
    modelo.addColumn("Apellido");
    modelo.addColumn("Nombre");
    modelo.addColumn("DNI");
    modelo.addColumn("CUIL");
    modelo.addColumn("Detalles");
    modelo.addColumn("Tipo");

    jTable1.setModel(modelo);
    jTable1.setDefaultEditor(Object.class, null);

    // Programa una tarea para ejecutarse después de que se muestre la interfaz gráfica
    SwingUtilities.invokeLater(() -> {
        // Asegúrate de que haya al menos 5 columnas antes de intentar establecer el ancho
        if (jTable1.getColumnCount() >= 5) {
             jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
              jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
               jTable1.getColumnModel().getColumn(4).setPreferredWidth(58);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(100);
             jTable1.getColumnModel().getColumn(6).setPreferredWidth(30);
        }
    });
 }
      private void borrarFilas(){
        int f = jTable1.getRowCount()-1;
        for(;f>=0;f--){
              modelo.removeRow(f);
    }
    }
}

