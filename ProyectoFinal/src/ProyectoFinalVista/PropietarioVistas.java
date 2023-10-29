/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinalVista;
import ProyectoFinalVista.*;
import ProyectoFinalVista.NuevoPropietario;
import ProyectoFinalVista.Vistas;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import proyectofinal.Entidades.Propietario;
import proyectofinal.accesoADatos.Conexion;
import proyectofinal.accesoADatos.PropietarioData;
/**
 *
 * @author User
 */
public class PropietarioVistas extends javax.swing.JInternalFrame {
private DefaultTableModel modelo = new DefaultTableModel();
private Connection con= null;
private PropietarioData id = new PropietarioData();

    /**
     * Creates new form InquilinosVistas
     */
    public PropietarioVistas() {
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

        BtnCargar = new javax.swing.JButton();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        rdbIExistentes = new javax.swing.JRadioButton();
        rdbIbaja = new javax.swing.JRadioButton();
        btnNuevoPropietario = new javax.swing.JButton();
        btnEliminarPropietario = new javax.swing.JButton();
        ModificarPropietario1 = new javax.swing.JButton();
        btnVerMas = new javax.swing.JButton();

        BtnCargar.setText("...");

        jMenuItem3.setText("jMenuItem3");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("jMenuItem1");

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
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
                "Nro", "Apellido", "Nombre", "Dni", "Domicilio", "Telefono"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(120);
        }

        rdbIExistentes.setText("Propietarios Existentes");
        rdbIExistentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbIExistentesActionPerformed(evt);
            }
        });

        rdbIbaja.setText("Propietarios de Baja");
        rdbIbaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbIbajaActionPerformed(evt);
            }
        });

        btnNuevoPropietario.setText("Nuevo");
        btnNuevoPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPropietarioActionPerformed(evt);
            }
        });

        btnEliminarPropietario.setText("Eliminar");
        btnEliminarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPropietarioActionPerformed(evt);
            }
        });

        ModificarPropietario1.setText("Modificar");
        ModificarPropietario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarPropietario1ActionPerformed(evt);
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
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdbIExistentes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rdbIbaja)
                                .addGap(108, 108, 108)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btnNuevoPropietario)
                .addGap(69, 69, 69)
                .addComponent(ModificarPropietario1)
                .addGap(77, 77, 77)
                .addComponent(btnEliminarPropietario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVerMas)
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbIExistentes)
                    .addComponent(rdbIbaja))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoPropietario)
                    .addComponent(ModificarPropietario1)
                    .addComponent(btnEliminarPropietario)
                    .addComponent(btnVerMas))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPropietarioActionPerformed
        // TODO add your handling code here:
    setVisible(false);
    // Muestra la nueva ventana
       NuevoPropietario nombre = new NuevoPropietario();   
       JDesktopPane desktopPane = getDesktopPane(); 
       desktopPane.add(nombre);
       nombre.setVisible(true);
//     dispose();
    }//GEN-LAST:event_btnNuevoPropietarioActionPerformed

    private void ModificarPropietario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarPropietario1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    // Muestra la nueva ventana
       ModificarPropietario nombre = new ModificarPropietario();   
       JDesktopPane desktopPane = getDesktopPane(); 
       desktopPane.add(nombre);
       nombre.setVisible(true);
//     dispose();
    }//GEN-LAST:event_ModificarPropietario1ActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
    char c = evt.getKeyChar();
    if(c<'0' || c>'9') evt.consume();
    if(txtBuscar.getText().length() >= 8)
    {evt.consume();}
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void rdbIExistentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbIExistentesActionPerformed
                  rdbIbaja.setSelected(false);
        borrarFilas();
      
    
        if ( rdbIExistentes.isSelected() == true) {
        
            for (Propietario in : id.obtenerLosPropietarios()) {
                modelo.addRow(new Object[]{in.getIdPropietario(),in.getApelidoPropietario(),in.getNombrePropietario(),in.getDni(),in.getDomicilio(),in.getTelefono()});
        
            }
    }
    }//GEN-LAST:event_rdbIExistentesActionPerformed

    private void rdbIbajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbIbajaActionPerformed
     rdbIExistentes.setSelected(false);
         borrarFilas();
    
      
        if (  rdbIbaja.isSelected() == true) {
        
            for (Propietario in : id.obtenerPropietariosdeBaja()) {
                modelo.addRow(new Object[]{in.getIdPropietario(),in.getApelidoPropietario(),in.getNombrePropietario(),in.getDni(),in.getDomicilio(),in.getTelefono()});
        
            }
        }
    }//GEN-LAST:event_rdbIbajaActionPerformed

    private void btnEliminarPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPropietarioActionPerformed
       try {
            int filaS = jTable1.getSelectedRow();
            
            Propietario in = new Propietario((int) modelo.getValueAt(filaS, 0), (String) modelo.getValueAt(filaS, 1),(String) modelo.getValueAt(filaS, 2), (int) modelo.getValueAt(filaS, 3),(String) modelo.getValueAt(filaS, 4), (int) modelo.getValueAt(filaS, 5));
           int resp = JOptionPane.showConfirmDialog(this, "Estás seguro que quieres dar de Baja a este Propietario?", "Dar de Baja", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION){
          id.BajaPropietario(in.getIdPropietario());
        }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado nada, intentar nuevamente");
        }
    }//GEN-LAST:event_btnEliminarPropietarioActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
            try{
        int buscar = parseInt(txtBuscar.getText());
        String ValidarDNI = txtBuscar.getText();
        if (ValidarDNI.length() < 0) {
            JOptionPane.showMessageDialog(null, "Para buscar debe ingresar el Dni del Propietario");
        } else {
            borrarFilas();
            if (id.BuscarPropietario(buscar).isEstado()) {
                rdbIExistentes.setSelected(true);
                rdbIbaja.setSelected(false);
            } else {
                rdbIExistentes.setSelected(false);
                rdbIbaja.setSelected(true);
            }
            int idI = id.BuscarPropietario(buscar).getIdPropietario();
            String Apellido = id.BuscarPropietario(buscar).getApelidoPropietario();
            String Nombre = id.BuscarPropietario(buscar).getNombrePropietario();
            int Dni = id.BuscarPropietario(buscar).getDni();
            String Domicilio = id.BuscarPropietario(buscar).getDomicilio();
            int Telefono = id.BuscarPropietario(buscar).getTelefono();
            boolean Estado = id.BuscarPropietario(buscar).isEstado();
            Propietario in = new Propietario(idI,Apellido, Nombre, Dni,Domicilio, Telefono, Estado);
            modelo.addRow(new Object[]{in.getIdPropietario(), in.getApelidoPropietario(), in.getNombrePropietario(), in.getDni(),in.getDomicilio(), in.getTelefono(), in.isEstado()});
            txtBuscar.setText("");
        }
        }catch(NullPointerException N){
            JOptionPane.showMessageDialog(null,"No existe ese Propietario");
            txtBuscar.setText("");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed

    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnVerMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMasActionPerformed
               try {
            int filaS = jTable1.getSelectedRow();
            
          Propietario in = new Propietario((int) modelo.getValueAt(filaS, 0), (String) modelo.getValueAt(filaS, 1),(String) modelo.getValueAt(filaS, 2), (int) modelo.getValueAt(filaS, 3),(String) modelo.getValueAt(filaS, 4), (int) modelo.getValueAt(filaS, 5));
           
          id.BuscarPropietario(in.getDni());
         JOptionPane.showMessageDialog(this,  
                 
    "Nro: "       + in.getIdPropietario()     + "\n " +
    "Apellido: "  + in.getApelidoPropietario()+ "\n " +
    "Nombre: "    + in.getNombrePropietario() + "\n " +
    "Dni: "       + in.getDni()               + "\n " +
    "Domicilio: " + in.getDomicilio()         + "\n " +
    "Telefono: "  + in.getTelefono()          + "\n "  );  
         
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado nada, intentar nuevamente");
        }
    }//GEN-LAST:event_btnVerMasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCargar;
    private javax.swing.JButton ModificarPropietario1;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminarPropietario;
    private javax.swing.JButton btnNuevoPropietario;
    private javax.swing.JButton btnVerMas;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
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
    modelo.addColumn("Dni");
    modelo.addColumn("Domicilio");
    modelo.addColumn("Telefono");
    

    jTable1.setModel(modelo);
    jTable1.setDefaultEditor(Object.class, null);

    // Programa una tarea para ejecutarse después de que se muestre la interfaz gráfica
    SwingUtilities.invokeLater(() -> {
        // Asegúrate de que haya al menos 5 columnas antes de intentar establecer el ancho
        if (jTable1.getColumnCount() >= 5) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(58);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(30);
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