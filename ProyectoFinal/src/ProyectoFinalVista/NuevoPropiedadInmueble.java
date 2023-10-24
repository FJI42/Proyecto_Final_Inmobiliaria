/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ProyectoFinalVista;

import java.sql.Connection;
import java.util.ArrayList;
import proyectofinal.Entidades.Propietario;
import proyectofinal.accesoADatos.Conexion;
import proyectofinal.accesoADatos.PropiedadInmuebleData;
import proyectofinal.accesoADatos.PropietarioData;

/**
 *
 * @author MCali
 */
public class NuevoPropiedadInmueble extends javax.swing.JInternalFrame {

    /**
     * Creates new form NuevoPropiedadInmueble
     */
    private Connection con = null;
    
    PropiedadInmuebleData propInmD = new PropiedadInmuebleData();
    
    public NuevoPropiedadInmueble() {
        
        initComponents();
        con=Conexion.getConexion();
        cargar_cbPropietario();
        cargar_cbTipoLocal();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIdInm = new javax.swing.JLabel();
        lbAccesibilidad = new javax.swing.JLabel();
        txtIdInm = new javax.swing.JTextField();
        txtAccesibilidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lbCaracteristicas = new javax.swing.JLabel();
        lbDireccion = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lbPropietario = new javax.swing.JLabel();
        lbForma = new javax.swing.JLabel();
        lbPrecioTazado = new javax.swing.JLabel();
        lbSuperficie = new javax.swing.JLabel();
        txtPrecioTazado = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtSuperficie = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCaracteristicas = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnAgregarPropInm = new javax.swing.JButton();
        lbTipoLocal = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lbZona = new javax.swing.JLabel();
        txtZona = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        cbPropietarios = new javax.swing.JComboBox<>();
        cbTipoLocal = new javax.swing.JComboBox<>();
        btnAgregarPropietario = new javax.swing.JButton();
        txtForma = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Propiedad inmueble -Nueva-");
        setPreferredSize(new java.awt.Dimension(400, 600));

        lbIdInm.setText("ID Nuevo Inmueble");

        lbAccesibilidad.setText("Accesibilidad");

        txtIdInm.setEditable(false);
        txtIdInm.setPreferredSize(new java.awt.Dimension(100, 22));

        jLabel5.setFont(new java.awt.Font("Verdana", 2, 8)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("jLabel2");

        lbCaracteristicas.setText("Caracteristicas");

        lbDireccion.setText("Direccion");

        jLabel8.setFont(new java.awt.Font("Verdana", 2, 8)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("jLabel2");

        lbPropietario.setText("Propietario:");

        lbForma.setText("Forma");

        lbPrecioTazado.setText("Precio Tazado");

        lbSuperficie.setText("Superficie");

        jLabel13.setFont(new java.awt.Font("Verdana", 2, 8)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("jLabel2");

        jLabel15.setFont(new java.awt.Font("Verdana", 2, 8)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("jLabel2");

        jLabel16.setFont(new java.awt.Font("Verdana", 2, 8)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("jLabel2");

        btnCancelar.setText("Cancelar");

        btnAgregarPropInm.setText("Agregar");

        lbTipoLocal.setText("Tipo de Local");

        jLabel18.setFont(new java.awt.Font("Verdana", 2, 8)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("jLabel2");

        lbZona.setText("Zona");

        jLabel20.setFont(new java.awt.Font("Verdana", 2, 8)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("jLabel2");

        cbPropietarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-" }));

        cbTipoLocal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione-", "Casa", "Terreno", "Local Comercial", "Galpon", "Garage" }));

        btnAgregarPropietario.setText("Nuevo Propoietario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btnAgregarPropInm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(79, 79, 79))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbAccesibilidad)
                            .addComponent(lbCaracteristicas)
                            .addComponent(lbDireccion)
                            .addComponent(lbForma)
                            .addComponent(lbPrecioTazado)
                            .addComponent(lbSuperficie)
                            .addComponent(lbTipoLocal)
                            .addComponent(lbZona))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAccesibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioTazado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(txtZona, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTipoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtForma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel20)
                            .addComponent(txtSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbIdInm)
                    .addComponent(lbPropietario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarPropietario)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtIdInm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbPropietarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbIdInm)
                    .addComponent(txtIdInm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbPropietario)
                    .addComponent(cbPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregarPropietario)
                .addGap(9, 9, 9)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lbAccesibilidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtAccesibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel5)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lbCaracteristicas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel13)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lbForma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtForma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLabel15)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lbPrecioTazado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtPrecioTazado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLabel16)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbSuperficie, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                    .addComponent(txtSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lbTipoLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbTipoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbZona, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(txtZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarPropInm)
                            .addComponent(btnCancelar))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel20)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargar_cbPropietario(){ 
        
        PropietarioData propD = new PropietarioData();
        ArrayList<Propietario> propietario = new ArrayList<>();

        for (Propietario prop : propD.obtenerLosPropietarios()) {
            propietario.add(prop);
            cbPropietarios.addItem(prop);
        }

    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarPropInm;
    private javax.swing.JButton btnAgregarPropietario;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbPropietarios;
    private javax.swing.JComboBox<String> cbTipoLocal;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbAccesibilidad;
    private javax.swing.JLabel lbCaracteristicas;
    private javax.swing.JLabel lbDireccion;
    private javax.swing.JLabel lbForma;
    private javax.swing.JLabel lbIdInm;
    private javax.swing.JLabel lbPrecioTazado;
    private javax.swing.JLabel lbPropietario;
    private javax.swing.JLabel lbSuperficie;
    private javax.swing.JLabel lbTipoLocal;
    private javax.swing.JLabel lbZona;
    private javax.swing.JTextField txtAccesibilidad;
    private javax.swing.JTextField txtCaracteristicas;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtForma;
    private javax.swing.JTextField txtIdInm;
    private javax.swing.JTextField txtPrecioTazado;
    private javax.swing.JTextField txtSuperficie;
    private javax.swing.JTextField txtZona;
    // End of variables declaration//GEN-END:variables
}
